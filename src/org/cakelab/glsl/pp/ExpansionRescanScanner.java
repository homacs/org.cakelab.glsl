package org.cakelab.glsl.pp;

import java.io.InputStream;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.ast.MacroInvocation;

public class ExpansionRescanScanner extends Scanner {
	// TODO [4] remove from here
	// A macro invocation results in at least two steps. 
	// At first the macro is expanded, which assigns (expanded) arguments, 
	// evaluates # and ## operators and returns a macro expanded 
	// string as result. This string then replaces the originating 
	// macro invocation expression in the text. The expanded string
	// is from now on considered to be an ordinary part of the input 
	// and gets scanned like ordinary text by the parser. This may or 
	// may not result in another macro invocation originating from
	// the expanded text. To keep track of locations of expressions found
	// in the text, the introduction of the prepending lexer was necessary.
	//
 	// Prepending lexer is used to prepend text received from macro expansion 
	// to the text from input stream and make ordinary parsing possible. It is
	// prepended to the lexer of the following text and covers management of
	// the different input sources, which comes at some cost of course.
	// But, when the prepended text is fully consumed, the prepending lexer may be 
	// removed, but only if no rewind to a position inside the prepended text is possible.
	//
	// The prepended text replaces the macro invocation in the text, it originates from. 
	// It will be virtually prepended to the text immediately following the macro invocation. 
	// Its start is virtually on the same position as the start of the former macro invocation,
	// but it may be longer or shorter as the originating macro invocation. 
	//
	// A prepending lexer is always the result of a successfully parsed and executed macro
	// invocation. Thus, a rewind will never go beyond the start of the string of the 
	// prepending lexer. Even parameters of macros have to be expanded before invocation
	// of the macro. An unsuccessfully parsed macro invocation will not cause the 
	// successfully parsed parameters to be rewound. In other words, a prepending lexer 
	// will never be removed during rewinds.
	//
	// Text can be inserted in prepended text as well as result of further macro expansions. 
	// Thus there can be multiple prepending lexers prepending one another.
	// 
	// Includes do not interfere with expansions because an expansion is the result of a macro call
	// which cannot span over directive lines. Thus an include is always simply an insertion of
	// a string at the current position (if valid) and will not be rewound, once applied.
	// 
	// Thus, there is the source string at ground layer with multiple layers of replacing 
	// strings from expansions above it. An expansion may start on a top layer string and 
	// cross multiple string end-boundaries down to the bottom layer (layer 0).
	//
	// layer 2:             |------|
	//                             v
	// layer 1:                |XXX--|
	//                               v
	// layer 0: |XXXXXXXXXXXXXXXXXXXX--------------------------------------
	//
	// Legend: X: obsolete chars, v: insertion point, -: chars to be scanned
	//
	// Strings can also be added at an insertion point after a prepending string,
	// resulting in a partial or full replacement of that prepended string.
	//
	// string 2:             |----------|          \
	//                                  |           > both layer 1
	// string 1:                |XXXXX| |          /
	//                                v v
	// source 0: |XXXXXXXXXXXXXXXXXXXXXX--------------------------------------
	//
	// In this case, string 2 effectively replaces string 1, because an added string
	// will never be rewound to a position before it (see above). This is also true, 
	// if string 2 does not overlap string 1. Thus, we can make the following conclusion:
	// 
	// (I)   A prepending string on a layer N makes all prepending strings on layer N+1
	//       obsolete.
	//
	// There are now four operations to be supported by this structure:
	// 
	// (1) Scanning traverses the strings across layers from left to right and may add 
	//     new strings on top to the right or at the start of a lower layer string.
	//
	// (2) Creating location markers for rewind positions.
	//
	// (3) Rewinding (virtually) traverses layers in right to left order but not beyond
	//     the start of any string.
	//
	// (4) Committing scans will be added to acknowledge previous scans to be successfully 
	//     parsed, which means that there will be no rewind into the past. All strings 
	//     having their end to the left of the committed position (i.e. they run to EOF) 
	//     can be dismissed in this case. Commits can occur on any layer.
	//
	// Due to the nature of prepending strings getting prepended by another prepending string
	// prepending lexers will be chained: Every prepending lexer has an appending lexer, 
	// which may be a prepending lexer as well. Scanning, rewinding, and commit calls go
	// to the currently active prepending lexer. The currently active lexer may forward
	// calls to the appending lexer, if applicable (see below).
	//
	// Scans will go beyond the end of a prepending string. The prepending lexer has to 
	// be aware of it and forward scans accordingly to the appending lexer.
	// 
	// In case of e rewind the following cases may occur:
	// a) Rewind goes back to prepended text. Prepending lexer must stay.
	// b) Rewind goes to a location inside the appended text after the insertion point. 
	//    Prepending lexer must stay to support a rewind into the prepending text later.
	// c) Illegal rewind goes back before the prepended text. This is an internal error, 
	//    as explained above.
	//
	// Accordingly, location markers of rewind positions refer to either the prepending 
	// string or the appending string. When referring to a location in the prepending
	// string, the lexer of the appending string have to be reset to the insertion
	// point of the prepending string (the position it had when the string was prepended).
	// When referring to the appending string, the prepending lexer will stay at EOF and
	// just forward the rewind to the appending lexer. 
	//
	// Due to (I) we can 'auto-commit' every time a new string is added. But for
	// all other cases, we need to perform manual commits to dismiss obsolete prepending 
	// lexers. Commits can be performed on any layer if the precondition holds, that a rewind
	// beyond the current position cannot happen in future.
	// 
	// TODO [1] merge with location mapping in respect to macro expanded locations
	// TODO [1] prepending lexer has to use MacroExpandedLocation, to refer to own locations: 
	//      Returned location always refers to start of macro invocation.
	//      The macro expanded offset refers to the offset inside of the 
	//      prepended string and replaces Location.pos . Attributes pos, column 
	//      and line will stay untouched. The macro invocation reference
	//      is used to determine, whether a location belongs to a prepending 
	//      lexer. This is safe, because for each macro invocation exists exactly
	//      one prepending lexer at a time.  
	//      The macro invocation causing the prepended text, will have already been
	//      reported to the location map before prepended text gets scanned.
	// TODO [1] location map has to consider, that multiple macro invocations may start 
	//      on another macro invocation. This is identifiable with the reported 
	//      MacroExpandedLocation but it may still overlap with an appended text section.
	//
	// Location Assignment:
	// Text resulting from a macro expansion is always associated with the 
	// originating macro invocation expression. Since the text replaces the 
	// macro invocation, it is possible that another macro invocation expression
	// occurs, which start in the expanded text and ends in the appended text. 
	// The appended text is either the original input or the result of a macro 
	// invocation, but not from a macro invocation which starts at a later position
	// as the currently expanded macro invocation. 
	// Parameters of macro get expanded before they get assigned. Parameter expansion
	// operates only on the given text of the parameter (up to the next ',' or ')' )
	// and does not include appending text. Macro expansion uses a separate temporarily 
	// instantiated ordinary lexer with the text of that single parameter as input. 
	// Parameter expansion may also involve prepending lexers, but they will not scan 
	// beyond the end of the text of that parameter.
	
	// Simple case:
	// ------------
	// 1    MACRO      APPENDING_TEXT
	// 2 EXPANDED_TEXT APPENDING_TEXT
	//
	// With Parameter Expansion (1 step)
	// ---------------------------------
	// 1 MACRO(    PARAM  )    APPENDING_TEXT
	// 2 MACRO(EXPANDED_PARAM) APPENDING_TEXT
	// 3 EXPANDED_TEXT         APPENDING_TEXT
	//
	// With Parameter Which Expands to a Macro Invocation Expression
	// -------------------------------------------------------------
	// 1 MACRO(      PARAM      ) APPENDING_TEXT
	// 2 MACRO(MACRO    APPENDIX) APPENDING_TEXT
	// 3 MACRO(EXPANDED APPENDIX) APPENDING_TEXT
	// 4 EXPANDED_TEXT            APPENDING_TEXT

	// With MACRO which Expands to another Macro Invocation Expression
	// -------------------------------------------------------------
	// 1 MACRO         APPENDING_TEXT
	// 2 MACRO2        APPENDING_TEXT
	// 3 EXPANDED_TEXT APPENDING_TEXT

	// With MACRO which Expands to another Macro Invocation Expression involving appending text
	// -------------------------------------------------------------
	// 1 MACRO         APPENDING_TEXT  --> Input
	// 2 EXPANDED_T MACRO2 NDING_TEXT
	// 3 EXPANDED_T EXPANDED ING_TEXT  --> Output

	// Thus, a macro expanded text section in the output can be the result of multiple 
	// stacked macro expansions. Therein parameter expansions precede expansion of the 
	// parameterised macro invocation.

	// When reporting an error in a macro expanded section, it requires all previous
	// macro expansions in the expanded section, up to the step, where the error occurred.
	// MacroExpandedLocation refers to the original location of a macro expansion and a 
	// location inside the macro expanded text (which caused the error). The 
	// MacroExpandedLocation also has a reference on the macro invocation expression which
	// resulted in the macro expanded text. This can be used to reconstruct the expansion 
	// even in case of stacked expansions. I.e. a macro expanded location refers to 
	// a former macro expansion which was rescanned and resulted in the new macro expansion.
	//
	// The location map is used to determine locations in original input, including 
	// line and column, when parsing the preprocessed output. 
	// The location map differentiates between ordinary text sections and expanded text sections.
	// An expanded text section may contain multiple subsections of expanded text originating
	// from different layered macro invocations. When the language parser requires the locations
	// of the original output, macro expanded text sections will provide macro expanded 
	// locations referring to start and end of the outermost macro invocation expression at this location. 
	// Since macro expanded locations contain information about original locations, the location
	// map just needs to store the intervals of expanded text sections (and subsections) 
	// visible in preprocessed output. Those will be stored in a list sorted 
	// by their start address in the output which allows for a binary search 
	// for the closest start and closest end. Overlaying entries (expansions, which replaced 
	// other expansions partially) will be inserted by cutting off intersections of the lower layer 
	// (always referring to the location in the preprocessed output).
	
	
	private Scanner append;

	ExpansionRescanScanner(MacroInvocation macroInvocation, InputStream prepend, Scanner append) {
		super(new MacroExpandedLocation(macroInvocation), prepend);
		this.append = append;
	}

	@Override
	public int current() {
		if (super.eof()) return append.current();
		else return super.current();
	}

	@Override
	public boolean eof() {
		return super.eof() && append.eof();
	}

	@Override
	public int lookahead(int i) {
		if (super.eof()) {
			return append.lookahead(i);
		} else {
			int pos = location.getLexerPosition()+i;
			int overflow = pos - (buffer.size()-1);
			if (overflow > 0) {
				return append.lookahead(overflow);
			}
			else 
			{
				return buffer.get(pos);
			}
		}
	}

	@Override
	public void consume(int n) {
		int stop = location.getLexerPosition()+n;
		if (stop < buffer.size()) {
			super.consume(n); 
		} else {
			int start = location.getLexerPosition()+1;
			if (start > buffer.size()) {
				append.consume(n);
			} else {
				int prependConsume = buffer.size() - start;
				super.consume(prependConsume+1); // consume to EOF
				int appendConsume = stop - buffer.size();
				append.consume(appendConsume);
			}
		}
	}

	@Override
	public int consume() {
		int pos = location.getLexerPosition()+1;
		if (pos > buffer.size()) return append.consume();
		else if (buffer.size() == pos) {
			super.consume(); // consume EOF
			return append.consume();
		} else {
			return super.consume();
		}
	}

	@Override
	public Scanner commit() {
		if (super.eof()) return append.commit();
		else return this;
	}
	
	@Override
	public void dismiss() {
		super.dismiss();
		append.dismiss();
	}

	@Override
	public Location location() {
		if (!super.eof()) return new MacroExpandedLocation((MacroExpandedLocation)super.location);
		else return append.location();
	}

	@Override
	public void setVirtualLocation(String id, int line) {
		if (super.eof()) append.setVirtualLocation(id, line);
		else throw new Error("internal error: expanded text contains line directive");
	}

	@Override
	public boolean atColumnStart() {
		if (super.eof()) return append.atColumnStart();
		else return false;
	}

}
