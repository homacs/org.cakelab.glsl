package org.cakelab.glsl.pp;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.ConstantValue;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.error.ErrorHandling;
import org.cakelab.glsl.pp.error.ExpressionError;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.scanner.StreamScanner;
import org.cakelab.glsl.pp.tokens.TAny;
import org.cakelab.glsl.pp.tokens.TAtom;
import org.cakelab.glsl.pp.tokens.TCharSequence;
import org.cakelab.glsl.pp.tokens.TComment;
import org.cakelab.glsl.pp.tokens.TEndl;
import org.cakelab.glsl.pp.tokens.THeaderPath;
import org.cakelab.glsl.pp.tokens.TIdentifier;
import org.cakelab.glsl.pp.tokens.TLineContinuation;
import org.cakelab.glsl.pp.tokens.TNumber;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.TWhitespace;
import org.cakelab.glsl.pp.tokens.Token;

public abstract class Parser extends ErrorHandling {

	protected Token token = null;
	
	
	public boolean atEOF() {
		return in.eof() || LA1() == StreamScanner.EOF;
	}

	protected ExpressionError expressionError(Location mark, String message) {
		syntaxError(message);
		Interval interval = interval(mark);
		return new ExpressionError(interval, message);
	}

	protected ExpressionError expressionError(String message) {
		syntaxError(message);
		Interval interval = new Interval(in.location(), in.location());
		return new ExpressionError(interval, message);
	}

	
	public abstract void parse();
	
	protected Interval interval(Location start) {
		return new Interval(start, in.location());
	}

	protected Location line_start(Location start) {
		Location l = start.clone();
		l.setColumn(Location.FIRST_COLUMN);
		return l;
	}



	/** Skips all input characters including line continuation sequences 
	 * (\\\r) and stops after CRLF or EOF. 
	 * @return false if lexer is already at EOF.
	 * @see #read_remaining_line() 
	 */
	protected boolean skip_remaining_line() {
		if (in.eof()) return false;
		while (!ENDL()) {
			if (!line_continuation()) {
				in.consume();
			}
		}
		return true;
	}

	/** 
	 * Reads all input characters including line continuation sequences 
	 * (\\\r) and stops after CRLF or EOF.
	 * The sequence of characters, including the terminating CRLF or EOF
	 * is returned as string.
	 */
	protected String read_remaining_line() {
		// TODO [6] see if we really need this (consider methods above)
		if (in.eof()) return null;
		StringBuffer result = new StringBuffer();
		while(!ENDL()) {
			if (!line_continuation()) {
				result.append((char)in.consume());
			}
		}
		return result.toString();
	}

	/** \\\r\n or \\\n */
	protected boolean line_continuation() {
		if (optional("\\\r\n") || optional("\\\n")) {
			return true;
		}
		return false;
	}
	
	protected int LA1() {
		return LA(1);
	}

	protected int LA(int i) {
		return in.lookahead(i);
	}

	protected boolean LA_equals(String s) {
		return LA_equals(1,s);
	}

	protected boolean LA_equals(int start, String s) {
		assert(start > 0);
		for (int i = 0, l = start; i < s.length(); i++, l++) {
			char c = (char) in.lookahead(l);
			if (c != s.charAt(i)) return false;
		}
		return true;
	}

	protected boolean LA_equals(char c) {
		return (LA1() == c);
	}

	/** Returns the single input item which equals one character of the given set */
	protected boolean ATOM(String set) {
		token = null;
		if (0 <= set.indexOf(in.lookahead(1))) {
			Location start = in.nextLocation();
			int c = in.consume();
			
			token = new TAtom(interval(start), String.valueOf((char)c));
			return true;
		}
		return false;
	}


	/**
	 * Either \r\n or \n or EOF
	 * @return
	 */
	protected boolean ENDL() {
		token = null;
		Location start = in.nextLocation();
		if (optional("\r\n")) {
			token = new TEndl(interval(start), "\r\n");
			return true;
		} else if (optional('\n')) {
			token = new TEndl(interval(start), "\n");
			return true;
		} else if (LA1() == StreamScanner.EOF) {
			in.consume();
			token = new TEndl(interval(start), "");
			return true;
		} else {
			return false;
		}
	}

	
	protected boolean HEADER_PATH() {
		Location start = in.nextLocation();
		if (optional('<')) {
			StringBuffer text = new StringBuffer('<');
			int c;
			for (c = in.LA1(); c != IScanner.EOF && c != '>'; c = in.LA1()) {
				text.append((char)in.consume());
			}
			mandatory('>');
			token = new THeaderPath(interval(start), text.toString());
			return true;
		}
		return false;
	}
	
	/** 
	 * Preprocessed text of a string started and terminated by given delimiter.
	 * @see #CHAR_SEQUENCE(char, char)*/
	protected boolean CHAR_SEQUENCE(char startAndEndDelimiter) {
		return CHAR_SEQUENCE(startAndEndDelimiter, startAndEndDelimiter);
	}
	

	/** Returns the preprocessed text of a string (or character) enclosed in 
	 * the given start and end delimiters.
	 * <h3>Note:</h3> Returned string contains start and end delimiter, 
	 * and line continuations will be removed, but escape sequences 
	 * will not be decoded!
	 * */
	protected boolean CHAR_SEQUENCE(char startDelimiter, char endDelimiter) {
		token = null;
		Location start = in.nextLocation();
		boolean result = false;
		if (optional(startDelimiter)){
			result = true;
			StringBuffer string = new StringBuffer();
			string.append(startDelimiter);
			while(!(LA_equals(endDelimiter)||in.eof())) {
				if (LA1() != '\\') {
					// general case: anything not an escape sequence
					
					if (LA1() == '\n') {
						syntaxError("missing terminating " + endDelimiter);
						// it was a string, just terminator missing
						break;
					}
					string.append((char)in.consume());
				} else if (line_continuation()) {
					// "\\\n"
					continue;
				} else {
					// special case: escape sequence
					// we do not fully interpret escape sequences here
					// just tracking whether there is a proper number of characters following the '\'

					string.append((char)in.consume());
					int c = LA1();
					switch(c) {
					case 'u': 
					case 'x':
					{
						string.append((char)in.consume());
						if (NUMBER_HEX(4)) {
							// TODO [3] support 8 byte hex
							string.append(token.getText());
						} else {
							syntaxError("missing digits to unicode escape sequence");
						}
						break;
					}
					default:
						if (NUMBER_OCT(3)) {
							// 1-3 octal digits
							string.append(token.getText());
						} else {
							// any other escape sequence (or non-escape sequence)
							string.append((char)in.consume());
						}
					}
				}
			}
			mandatory(endDelimiter);
			string.append(endDelimiter);
			token = new TCharSequence(interval(start), string.toString());
		}
		return result;
	}
	
	
	
	protected String decodeCharSequence(String text, char startDelimiter, char endDelimiter) {
		int i = 0;
		char c = text.charAt(i);
		assert(c == startDelimiter) : "internal error: missing start delimiter for char sequence";
		StringBuffer string = new StringBuffer();
		for (i++; i < text.length()-1; i++) {
			c = text.charAt(i);
			if (c != '\\') {
				// general case: anything not an escape sequence
				assert (c != '\n') : "internal error: char sequence containing '\n'";  // has to be removed by preprocessor
				assert (c != endDelimiter) : "internal error: char sequence internally containing end delimiter";  // sequence should have ended there
				string.append(c);
			} else {
				// special case: escape sequence
				if (i>= text.length()) return string.toString();
				i++;
				c = text.charAt(i);
				assert (c != '\n') : "internal error: char sequence containing '\n'"; // has to be removed by preprocessor
				
				switch(c) {
				case '\'': string.append('\''); break;
				case '\"': string.append('\"'); break;
				case '\\': string.append('\\'); break;
				case '?': string.append('?'); break;
				case 'a': string.append('\u0007'); break; // bell (alert), ASCII 07
				case 'b': string.append('\b'); break;
				case 'f': string.append('\f'); break;
				case 'n': string.append('\n'); break;
				case 'r': string.append('\r'); break;
				case 't': string.append('\t'); break;
				case 'v': string.append('\u0011'); break; // vertical tab
				case 'u':
				case 'x':
				{
					char prefix = c;
					// decode unicode code
					i++;
					c = text.charAt(i);
					// TODO [3] support 8 byte hex (depending on OS)
					if (isHexDigit(c)) {
						StringBuffer upto_four_hex_digits = new StringBuffer();
						int max = Math.min(i+4, text.length()-1);
						for (; isHexDigit(c) && i < max ; i++, c = text.charAt(i)) upto_four_hex_digits.append(c);
						// 1-4 hex digits
						i--;  // for loop will add the last
						try {
							int oct = Integer.decode("0x" + upto_four_hex_digits.toString());
							string.append((char)oct);
						} catch (IllegalArgumentException e) {
							syntaxError("illegal unicode code sequence in character sequence (\\" + prefix + upto_four_hex_digits.toString() + ")");
							return string.toString();
						}
					} else {
						// error recovery
						i--;
					}
					break;
				}
				default:
					if (isOctDigit(c)) {
						StringBuffer upto_three_oct_digits = new StringBuffer();
						int max = Math.min(i+3, text.length()-1);
						for (; isOctDigit(c) && i < max ; i++, c = text.charAt(i)) upto_three_oct_digits.append(c);
						// 1-3 octal digits
						i--;  // for loop will add the last
						try {
							int oct = Integer.decode("0" + upto_three_oct_digits.toString());
							string.append((char)oct);
						} catch (IllegalArgumentException e) {
							syntaxError("illegal octal sequence in character sequence (\\" + upto_three_oct_digits + ")");
							return string.toString();
						}
					} else {
						syntaxError("undefined escape sequence '\\" + (char)c + "'");
						i--;
					}
					break;
				}
			}
		}
		assert text.charAt(i) == endDelimiter : "missing end delimiter in string";
		assert ++i == text.length() : "end delimiter before end of text";
		return string.toString();
	}

	protected Expression decodeNumber(TNumber token) {
		final int DEC = 0;
		final int HEX = 1;
		int type = DEC;
		final String HEX_DIGITS = "0123456789abcdef";

		boolean isReal = false;
		
		//
		// Decode value
		//
		try {
			
			String text = token.getText().toLowerCase();
			

			
			if (text.startsWith("0x")) {
				type = HEX;
			}

			isReal = (text.indexOf('.') >= 0) ;
			
			if (type != HEX && text.endsWith("f")) {
				isReal = true;
				text = text.substring(0, text.length()-1);
			}
			
			
			if (isReal) {
				// postfix 'f' was removed above
				if (text.endsWith("l")) text = text.substring(0, text.length()-1);
				
				Double value;
				if (type == HEX) {
					// hexadecimal with fracture
					// not supported by Java, so we need to decode it manually
					String[] part = text.split("p");
					double exp;
					if (part.length == 2) exp = Double.valueOf(part[1]);
					else exp = 0;

					String base = part[0];
					part = base.split("\\.");
					if (base.startsWith("0x.")) {
						value = 0.0;
					} else {
						value = (double)Long.decode(part[0]); // intpart
					}
					if (part.length == 2) {
						String fract = part[1];
						double pow = 1.0/16;
						for (int i = 0; i < fract.length(); i++) {
							value += HEX_DIGITS.indexOf(fract.charAt(i)) * pow;
							pow /= 16;
						}
					}
					
					value *= Math.pow(2.0, exp);
				} else {
					value = Double.parseDouble(text);
				}
				return new ConstantValue<Double>(token.getInterval(), value);
			} else {
				if (text.endsWith("l")) text = text.substring(0, text.length()-1);
				if (text.endsWith("u")) text = text.substring(0, text.length()-1);
				Long value = Long.decode(text);
				return new ConstantValue<Long>(token.getInterval(), value, false);
			}
		} catch (NumberFormatException e) {
			// this should not occur at this stage, because the preprocessor already checked the syntax
			return expressionError(token.getStart(), "not a valid number '" + token.getText() + "'");
		}
	}

	private boolean isOctDigit(char c) {
		return '0' <= c  && c <= '7';
	}

	private boolean isHexDigit(char c) {
		return isDigit(c) || ('a' <= c && c <= 'f') || ('A' <= c && c <= 'F');
	}

	/** a following sequence of characters which does contain characters
	 * of the given set only.
	 * @param set
	 * @return
	 */
	protected boolean ANYTHING_IN(String set) {
		return ANYTHING_IN(set, Integer.MAX_VALUE);
	}
	
	/** a following sequence of maximum 'max' characters which does contain characters
	 * of the given set only.
	 * @param set
	 * @return
	 */
	protected boolean ANYTHING_IN(String set, int max) {
		assert(max > 1);
		token = null;
		Location start = in.nextLocation();
		int c = LA1();
		if (set.indexOf(c) >= 0) {
			StringBuffer anything = new StringBuffer();
			do {
				anything.append((char)c);
				in.consume();
				c = LA1();
				max--;
			} while (set.indexOf(c) >= 0 && max > 0);
			token = new TAny(interval(start), anything.toString());
			return true;
		}
		return false;
	}

	protected boolean ANYTHING_UNTIL(char limiter) {
		token = null;
		Location start = in.nextLocation();
		int c = LA1();
		if (c != limiter) {
			StringBuffer anything = new StringBuffer();
			do {
				in.consume();
				anything.append((char)c);
				c = LA1();
			} while(c != limiter);
			token = new TAny(interval(start), anything.toString());
			return true;
		} else {
			return false;
		}
	}

	


	protected boolean NUMBER() {
		Location mark = in.nextLocation();
		
		final String DEC_DIGITS = "0123456789";
		final String HEX_DIGITS = "0123456789abcdefABCDEF";
		final String DEC_EXPONENT = "eE";
		final String HEX_EXPONENT = "pP";
		String exponentPrefixes = DEC_EXPONENT;
		boolean isReal = false;
		String digits = DEC_DIGITS;
		StringBuffer num = new StringBuffer();

		if (optional("0x")) {
			num.append("0x");
			digits = HEX_DIGITS;
			exponentPrefixes = HEX_EXPONENT;
		} else if (optional("0X")) {
			num.append("0X");
			digits = HEX_DIGITS;
			exponentPrefixes = HEX_EXPONENT;
		}


		if (ANYTHING_IN(digits)) {
			num.append(token.getText());
			if (optional('.')) {
				isReal = true;
				num.append('.');
				if (ANYTHING_IN(digits)) num.append(token.getText());
			}
		} else if (optional('.')) {
			isReal = true;
			num.append('.');
			if (ANYTHING_IN(digits)) num.append(token.getText());
			else {
				syntaxError("number format error: missing digits after '.'");
				token = new TNumber(interval(mark), num.toString());
				return true;
			}
		} else if (digits == HEX_DIGITS) {
			syntaxError(mark, "missing number after hex prefix");
			token = new TNumber(interval(mark), num.toString());
			return true;
		} else {
			// not a number
			return false;
		}

		if (num.length() > 0) {
			if (ATOM(exponentPrefixes)) {
				isReal = true;
				num.append(token.getText());
				if (ATOM("+-")) num.append(token.getText());
				// exponent always decimal digits
				if (!NUMBER_DEC()) {
					syntaxError(mark, "missing value of exponent");
					token = new TNumber(interval(mark), num.toString());
					return true;
				}
				num.append(token.getText());
			}
			
			// postfixes
			if (isReal) {
				if (ATOM("fF")) {
					// float
					num.append(token.getText());
				} else if (ATOM("lL")) {
					// double
					num.append(token.getText());
				}
			} else {
				if (ATOM("fF")) {
					isReal = true;
					// float again
					num.append(token.getText());
				} else {
					if (ATOM("uU")) num.append(token.getText()); // unsigned
					if (ATOM("lL")) num.append(token.getText()); // long
				}
			}
			token = new TNumber(interval(mark), num.toString());
			return true;
		} else {
			return false;
		}
	}
	
	protected boolean NUMBER_DEC() {
		return NUMBER_DEC(Integer.MAX_VALUE);
	}

	protected boolean NUMBER_DEC(int max) {
		assert (max > 0);
		token = null;
		if (ANYTHING_IN("0123456789", max)) {
			token = new TNumber(token.getInterval(), token.getText());
			return true;
		} else {
			return false;
		}
	}

	protected boolean NUMBER_OCT() {
		return NUMBER_OCT(Integer.MAX_VALUE);
	}

	protected boolean NUMBER_OCT(int max) {
		assert (max > 0);
		if (ANYTHING_IN("01234567", max)) {
			token = new TNumber(token.getInterval(), token.getText());
			return true;
		} else {
			return false;
		}
	}

	protected boolean NUMBER_HEX() {
		return NUMBER_HEX(Integer.MAX_VALUE);
	}

	protected boolean NUMBER_HEX(int max) {
		assert (max > 0);
		if (ANYTHING_IN("0123456789abcdefABCDEF", max)) {
			token = new TNumber(token.getInterval(), token.getText());
			return true;
		} else {
			return false;
		}
	}

	
	
	protected boolean DOTS() {
		return optional("...");
	}

	protected boolean PUNCTUATOR(boolean acceptHashes) {
		token = null;
		Location start = in.nextLocation();
		
		final String[] punctuators = {"[","]","(",")","{","}",".","->",
		"++", "--", "&", "*", "+", "-", "~", "!",
		"/","%","<<",">>","<",">","<=",">=","==","!=","^","|","&&","||",
		"?",":",";","...",
		"=","*=","/=", "%=", "+=", "-=", "<<=", ">>=", "&=", "^=", "|=",
		/* # ## see blow */ ",",
		"<:", ":>", "<%", "%>", "%:", "%:%:"};
		
		for (String punctuator : punctuators) {
			if (optional(punctuator)) {
				token = new TPunctuator(interval(start),punctuator);
				return true;
			}
		}
		
		if (acceptHashes) {
			if (optional("##")) {
				
				token = new TPunctuator(interval(start), "##");
				return true;
			} else if (optional('#')) {
				token = new TPunctuator(interval(start), "#");
				return true;
			}
		}
		return false;
	}

	protected boolean IDENTIFIER() {
		int c = LA1();
		Location start = in.nextLocation();
		token = null;
		if (isAlpha(c)||c == '_') {
			StringBuffer identifier = new StringBuffer();
			do {
				identifier.append((char)in.consume());
				c = LA1();
			} while(isAlpha(c)||isDigit(c)||c == '_');
			token = new TIdentifier(interval(start), identifier.toString());
			return true;
		} else {
			return false;
		}
	}
	


	/** WHITESPACE including traditional white space chars,
	 * line continuation markers and comments but no pure
	 * CRLF (except multi-line comments and line continuations).
	 * Any whitespace read is stored in last.WHITESPACE .
	 */
	protected boolean WHITESPACE() {
		int la = in.lookahead(1);
		Location start = in.nextLocation();
		token = null;
		if (isWhite(la)) {
			in.consume();
			token = new TWhitespace(interval(start), Character.toString((char)la));
			return true;
		} else if (line_continuation()) {
			// To keep the same number of line in the output,
			// we will need to forward even line continuation
			// sequences. Because it does not matter for 
			// preprocessors, whether it is \r\n or just \n
			// we use the shorter one.
			token = new TLineContinuation(interval(start), "\\\n");
			return true;
		} else if (optional("/*")) {
			// Multiline comments might contain CRLF
			// which implicitly means, that a directive line with comments
			// can spread over multiple lines even without line
			// continuation markers.
			StringBuffer comment = new StringBuffer("/*");
			while (! LA_equals("*/") && LA1() != StreamScanner.EOF) {
				if (line_continuation()) comment.append("\\\n");
				else comment.append((char)in.consume());
			}
			if (!optional("*/")) {
				syntaxError("missing '*/' to end the comment");
			}
			else 
			{
				comment.append("*/");
			}
			token = new TComment(interval(start), comment.toString());
			return true;
		} else if (optional("//")) {
			StringBuffer comment = new StringBuffer("//");
			while (!isEndl(LA1())) {
				if (line_continuation()) comment.append("\\\n");
				else comment.append((char)in.consume());
			}
			// The CRLF is not part of the comment in the preprocessor.
			// The comment is either a text line or at the end of a directive line.
			// In both types of rules , it is necessary to be able to 
			// check for the line end (anyway).
			token = new TComment(interval(start), comment.toString());
			return true;
		} else {
			return false;
		}
	}

	protected int nextTokenLookahead(int from, boolean skipCRLF) {
		int i = from;
		for (; in.lookahead(i) != StreamScanner.EOF;) {
			int next = skipNextWhite(i, skipCRLF);
			if (i == next) return i;
			else i = next;
		}
		return i;
	}
	
	protected int skipLineContinuation(int start) {
		if (LA_equals(start, "\\\n")) {
			return start+2;
		} else if (LA_equals(start, "\\\r\n")) {
			return start+3;
		} else {
			return start;
		}
	}
	
	protected int skipNextWhite(int start, boolean includingCRLF) {
		int i = start;
		
		
		int next = skipLineContinuation(i);
		if (next != i) {
			return next;
		}
		
		int la = in.lookahead(i);
		if (isWhite(la)) {
			return i+1;
		} else if (includingCRLF && la == '\n') {
			return i+1;
		} else if (LA_equals(i, "/*")) {
			i += 2;
			while (! LA_equals(i, "*/") && LA1() != StreamScanner.EOF) {
				i++;
			}
			if (!LA_equals(i, "*/")) {
				syntaxError("missing '*/' to end the comment");
			}
			else 
			{
				i += 2;
			}
			return i;
		} else if (LA_equals(i, "//")) {
			i += 2;
			while (!isEndl(in.lookahead(i))) {
				next = skipLineContinuation(i);
				if (next == i) {
					i++;
				} else {
					i = next;
				}
			}
			return i;
		} else {
			return i;
		}
	}
	
	protected boolean CRLF() {
		if (LA1() == '\n') {
			in.consume(); 
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Sequence consisting of CRLF() and WHITESPACE()
	 * @return
	 */
	protected boolean whitespace_crlf_sequence() {
		boolean result = false;
		Location start = in.nextLocation();
		StringBuffer whites = new StringBuffer();
		while (true) {
			if (WHITESPACE()) {
				result = true;
				whites.append(token.getText());
			} else if (CRLF()) {
				result = true;
				whites.append('\n');
			}
			else break;
		}
		if (result)	token = new TWhitespace(interval(start), whites.toString());
		return result;
	}

	
	protected boolean isEndl(int c) {
		return c == '\n' || c == StreamScanner.EOF;
	}

	protected boolean isDigit(int c) {
		if (c == StreamScanner.EOF) return false;
		return '0' <= c && c <= '9';
	}

	protected boolean isAlpha(int c) {
		if (c == StreamScanner.EOF) return false;
		return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
	}
	
	protected boolean isWhite(int c) {
		if (c == StreamScanner.EOF) return false;
		else return c == ' ' || c == '\t' || c == '\r';
	}

	/**
	 * consumes if the following tokens equal string
	 * @param string
	 * @return
	 */
	protected boolean optional(String string) {
		if (LA_equals(string)) {
			in.consume(string.length());
			return true;
		} else {
			return false;
		}
	}

	protected boolean optional(char c) {
		if (LA1() == c) {
			in.consume();
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Checks whether the following characters equal
	 * the given string (id) and the character thereafter
	 * are not legal identifier characters.
	 * 
	 * @param id
	 * @return
	 */
	protected boolean optionalIDENTIFIER(String id) {
		if (LA_equals(id)) {
			int next = in.lookahead(id.length()+1);
			if (isAlpha(next) || isDigit(next) || next == '_' ) {
				return false;
			} else {
				Location start = in.nextLocation();
				in.consume(id.length());
				token = new TIdentifier(interval(start), id);
				return true;
			}
		} else {
			return false;
		}
	}

	protected boolean mandatory(char c) {
		if (optional(c)) {
			return true;
		} else {
			syntaxError(in.nextLocation(), "missing '" + c + "'");
			return false;
		}
	}

	protected boolean mandatory(String string) {
		if (optional(string)) {
			return true;
		} else {
			syntaxError("missing '" + string + "'");
			return false;
		}
	}
	

	protected boolean mandatory_endl() {
		if (!ENDL()) {
			syntaxError("missing mandatory CRLF or end of file");
			// still here, then skip to next line end to recover from error
			while (!ENDL()) in.consume();
			return false;
		}
		return true;
	}



}
