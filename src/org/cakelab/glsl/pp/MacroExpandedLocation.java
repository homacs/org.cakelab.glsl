package org.cakelab.glsl.pp;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.ast.MacroInvocation;

/**
 * Location of an input token generated by a macro expansion.
 * <p>
 * The location attributes (source identifier, line and column) 
 * refer to the location (start) of the macro invocation in the
 * input text. In case this input text was produced by macro expansion
 * as well, the location will point to the start of that macro invocation.
 * Thus, location always points to the start of the first macro 
 * invocation in the original input, which interfered with the
 * macro invocation of the macro expanded text parsed for this
 * location.
 * </p>
 * <p>{@link #getMacroInvocation()} provides the AST entry of the 
 * macro invocation which has been expanded during preprocessing.
 * If this macro invocation is based on another macro invocation,
 * the start (and end eventually) will be a macro expanded location
 * as well, which has a reference of that macro invocation.
 * </p>
 * <p>
 * {@link #getMacroExpandedOffset()} additionally provides 
 * the position of the generated token in the macro expanded text, 
 * relative to the start of the expanded text. This may be useful
 * to point out errors in expanded text rather than just pointing 
 * to the malicious macro invocation or definition.
 * </p>
 * 
 * <h3>Note:</h3> Start and end of a token or expression can be 
 *              inside macro expanded or simple text sections (e.g. 
 *              it can start in a text location and end in a 
 *              macro expanded location).
 *              
 * @author homac
 *
 */
public class MacroExpandedLocation extends Location {

	private int macroExpandedOffset;
	private MacroInvocation invocation;

	// TODO [6] check whether we can drop some of the constructors
	public MacroExpandedLocation(Location that, int macroExpandedOffset, MacroInvocation macroInvocation) {
		super(that);
		this.macroExpandedOffset = macroExpandedOffset;
		this.invocation = macroInvocation;
	}

	public MacroExpandedLocation(MacroExpandedLocation that) {
		super(that);
		this.macroExpandedOffset = that.macroExpandedOffset;
		this.invocation = that.invocation;
	}

	/** 
	 * Creates a macro expanded location, pointing at the start
	 * of the expanded text of the given macro invocation expression.
	 * 
	 * @param macroInvocation
	 */
	public MacroExpandedLocation(MacroInvocation macroInvocation) {
		super(macroInvocation.getStart());
		this.macroExpandedOffset = ScannerLocation.POS_START;
		this.invocation = macroInvocation;
	}

	public int getMacroExpandedOffset() {
		return macroExpandedOffset;
	}

	public MacroInvocation getMacroInvocation() {
		return invocation;
	}
	
	@Override
	public int getLexerPosition() {
		return macroExpandedOffset;
	}

	@Override
	protected void nextLine() {
		nextColumn();
	}

	@Override
	protected void nextColumn() {
		macroExpandedOffset++;
	}

	@Override
	protected void setLexerPosition(int lastConsumedPos) {
		macroExpandedOffset = lastConsumedPos;
	}
	

	public MacroExpandedLocation clone() {
		return new MacroExpandedLocation(this);
	}
	
}
