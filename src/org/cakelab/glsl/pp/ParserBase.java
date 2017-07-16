package org.cakelab.glsl.pp;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.ParserErrorHandler;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Node;

public class ParserBase {
	
	public static class StandardErrorHandler implements ParserErrorHandler {

		/**
		 * @param location
		 * @param errMsg
		 * @return whether to stop processing or not
		 */
		@Override
		public boolean error(Location location, String errMsg) {
			System.err.println(location.toString() + ": " + errMsg);
			return true;
		}

		@Override
		public boolean warning(Location location, String warningMsg) {
			System.err.println(location.toString() + ": " + warningMsg);
			return false;
		}

		@Override
		public boolean error(Node node, String errMsg) {
			return error(node.getStart(), errMsg);
		}

		@Override
		public boolean warning(Interval interval, String message) {
			return warning(interval.getStart(), message);
		}
	}
	

	public class LastToken {
		private String IDENTIFIER;
		/** contains the string only, not including the limiters (e.g. '"') */
		private String STRING_LITERAL;
		private String ANYTHING;
		private String NUMBER;
		private int TOKEN;
		private String WHITESPACE;
		private String ENDL;
		
		public void erase() {
			IDENTIFIER = null;
			STRING_LITERAL = null;
			ANYTHING = null;
			NUMBER = null;
			TOKEN = -1;
			WHITESPACE = null;
			ENDL = null;
		}
		
		public String IDENTIFIER() {
			return IDENTIFIER;
		}
		
		public void IDENTIFIER(String iDENTIFIER) {
			erase();
			IDENTIFIER = iDENTIFIER;
		}
		
		public String STRING_LITERAL() {
			return STRING_LITERAL;
		}

		public void STRING_LITERAL(String string) {
			erase();
			STRING_LITERAL = string;
		}
		
		public String ANYTHING() {
			return ANYTHING;
		}

		public void ANYTHING(String aNYTHING) {
			erase();
			ANYTHING = aNYTHING;
		}

		public String NUMBER() {
			return NUMBER;
		}

		public void NUMBER(String nUMBER) {
			erase();
			NUMBER = nUMBER;
		}

		public int TOKEN() {
			return TOKEN;
		}

		public void TOKEN(int token) {
			erase();
			TOKEN = token;
		}

		public String WHITESPACE() {
			return WHITESPACE;
		}
		
		public void WHITESPACE(String c) {
			erase();
			WHITESPACE = c;
		}

		public void ENDL(String endl) {
			erase();
			ENDL = endl;
		}
		public String ENDL() {
			return ENDL;
		}
		
	}




	
	protected Lexer lexer;
	private ParserErrorHandler errorHandler = new StandardErrorHandler();
	protected LastToken last = new LastToken();

	
	public void setErrorHandler(ParserErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}

	public boolean atEOF() {
		return lexer.eof() || LA1() == Lexer.EOF;
	}


	/** reports an error on the next location to be scanned */
	protected void syntaxError(String string) throws SyntaxError {
		syntaxError(lexer.nextLocation(), string);
	}

	protected void syntaxError(Location location, String string) throws SyntaxError {
		boolean stop = errorHandler.error(location, string);
		if (stop) {
			lexer.dismiss();
		}
	}

	protected void syntaxError(EvaluationException e) throws SyntaxError {
		if (!(e.getOrigin() instanceof ExpressionError)) {
			// has not yet been reported -> report
			boolean stop = errorHandler.error(e.getOrigin(), e.getMessage());
			if (stop) {
				lexer.dismiss();
			}
		}
	}
	
	protected ExpressionError expressionError(Location mark, String message) {
		syntaxError(message);
		Interval interval = interval(mark);
		return new ExpressionError(interval, lexer.getText(interval), message);
	}

	protected ExpressionError expressionError(String message) {
		syntaxError(message);
		Interval interval = new Interval(lexer.location(), lexer.location());
		return new ExpressionError(interval, "", message);
	}


	protected boolean syntaxWarning(String string) {
		return syntaxWarning(line_start(lexer.location()), string);
	}

	protected boolean syntaxWarning(Location location, String message) {
		boolean stop = errorHandler.warning(location, message);
		if (stop) {
			lexer.dismiss();
		}
		return stop;
	}

	protected boolean syntaxWarning(Interval interval, String message) {
		boolean stop = errorHandler.warning(interval, message);
		if (stop) {
			lexer.dismiss();
		}
		return stop;
	}

	protected Interval interval(Location start) {
		return new Interval(lexer.nextLocation(start), lexer.location());
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
		if (lexer.eof()) return false;
		while (!ENDL()) {
			if (!line_continuation()) {
				lexer.consume();
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
		if (lexer.eof()) return null;
		StringBuffer result = new StringBuffer();
		while(!ENDL()) {
			if (!line_continuation()) {
				result.append((char)lexer.consume());
			}
		}
		return result.toString();
	}

	/** Parses a sequence of white spaces (including line continuation) terminated by either CRLF or EOF. */
	protected boolean empty_line_end() {
		// TODO [6] see if we really need this (consider methods above)
		Location reset = lexer.location();
		while(WHITESPACE());
		if (ENDL()) {
			return true;
		} else {
			lexer.rewind(reset);
			return false;
		}
	}


	/** \\\r\n or \\\n */
	protected boolean line_continuation() {
		if (optional("\\\r\n") || optional("\\\n")) {
			return true;
		}
		return false;
	}
	
	protected int LA1() {
		return lexer.lookahead(1);
	}


	protected boolean LA_equals(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = (char) lexer.lookahead(i+1);
			if (c != s.charAt(i)) return false;
		}
		return true;
	}

	protected boolean LA_equals(char c) {
		return (LA1() == c);
	}


	
	protected boolean TOKEN(String set) {
		if (0 <= set.indexOf(lexer.lookahead(1))) {
			last.TOKEN(lexer.consume());
			return true;
		}
		return false;
	}


	/**
	 * Either \r\n or \n or EOF
	 * @return
	 */
	protected boolean ENDL() {
		if (optional("\r\n")) {
			last.ENDL("\r\n");
			return true;
		} else if (optional('\n')) {
			last.ENDL("\n");
			return true;
		} else if (LA1() == Lexer.EOF) {
			lexer.consume();
			last.ENDL("");
			return true;
		} else {
			return false;
		}
	}

	/** a string enclosed in given limiters */
	protected boolean STRING_LITERAL(char limiter) {
		return STRING_LITERAL(limiter, limiter);
	}
	/** a string enclosed in the given start and end limiters */
	protected boolean STRING_LITERAL(char start, char end) {
		last.STRING_LITERAL(null);
		boolean result = false;
		if (optional(start)){
			result = true;
			StringBuffer string = new StringBuffer();
			while(!(LA_equals(end)||lexer.eof())) {
				if (LA1() != '\\') {
					if (LA1() == '\n') {
						syntaxError("missing terminating \"");
						// it was a string, just terminator missing
						break;
					}
					
					string.append((char)lexer.consume());
				} else if (line_continuation()) {
					continue;
				} else {
					// decode escape sequence:
					lexer.consume();
					int c = LA1();
					switch(c) {
					case '\'': lexer.consume(); string.append('\''); break;
					case '\"': lexer.consume(); string.append('\"'); break;
					case '\\': lexer.consume(); string.append('\\'); break;
					case '?': lexer.consume(); string.append('?'); break;
					case 'a': lexer.consume(); string.append('\u0007'); break; // bell (alert), ASCII 07
					case 'b': lexer.consume(); string.append('\b'); break;
					case 'f': lexer.consume(); string.append('\f'); break;
					case 'n': lexer.consume(); string.append('\n'); break;
					case 'r': lexer.consume(); string.append('\r'); break;
					case 't': lexer.consume(); string.append('\t'); break;
					case 'v': lexer.consume(); string.append('\u0011'); break; // vertical tab
					case 'u': lexer.consume(); {
						if (NUMBER_HEX(4)) {
							// TODO support 8 byte hex
							try {
								int hex = Integer.decode("0x" + last.NUMBER());
								if (hex > 0xffff) string.append((char)(hex>>32));
								string.append((char)(hex&0xffff));
							} catch (NumberFormatException e) {
								syntaxError("hexadecimal number in escape sequence too large");
							} catch (IllegalArgumentException e) {
								syntaxError("hexadecimal number in escape sequence is an invalid unicode code point");
							}
						} else {
							syntaxError("missing digits to unicode escape sequence");
						}
						break;
					}
					case 'x': lexer.consume(); {
						if (NUMBER_HEX(4)) {
							// TODO support 8 byte hex
							try {
								string.append(Character.toChars(Integer.decode("0x" + last.NUMBER())));
							} catch (NumberFormatException e) {
								syntaxError("hexadecimal number in escape sequence too large");
							} catch (IllegalArgumentException e) {
								syntaxError("hexadecimal number in escape sequence is an invalid unicode code point");
							}
						} else {
							syntaxError("missing digits to hexadeciaml number escape sequence");
						}
						break;
					}
					default:
						if (isDigit(c)) {
							// 1-3 octal digits
							NUMBER_OCT(3);
							try {
								int oct = Integer.decode("0" + last.NUMBER());
								string.append((char)oct);
							} catch (NumberFormatException e) {
								syntaxError("hexadecimal number in escape sequence too large");
							} catch (IllegalArgumentException e) {
								syntaxError("hexadecimal number in escape sequence is an invalid unicode code point");
							}
						} else {
							syntaxError("undefined escape sequence '\\" + (char)c + "'");
						}
					}
				}
			}
			mandatory(end);
			last.STRING_LITERAL(string.toString());
		}
		return result;
	}
	

	/** a following sequence of characters which does contain characters
	 * of the given set only.
	 * @param set
	 * @return
	 */
	protected boolean ANYTHING_IN(String set) {
		return ANYTHING_IN(set, Integer.MAX_VALUE);
	}
	
	/** a following sequence of maximum max characters which does contain characters
	 * of the given set only.
	 * @param set
	 * @return
	 */
	protected boolean ANYTHING_IN(String set, int max) {
		assert(max > 1);
		last.ANYTHING(null);
		int c = LA1();
		if (set.indexOf(c) >= 0) {
			StringBuffer anything = new StringBuffer();
			do {
				anything.append((char)c);
				lexer.consume();
				c = LA1();
				max--;
			} while (set.indexOf(c) >= 0 && max > 0);
			last.ANYTHING(anything.toString());
			return true;
		}
		return false;
	}

	protected boolean ANYTHING_UNTIL(char limiter) {
		last.ANYTHING(null);
		int c = LA1();
		if (c != limiter) {
			StringBuffer anything = new StringBuffer();
			do {
				lexer.consume();
				anything.append((char)c);
				c = LA1();
			} while(c != limiter);
			last.ANYTHING(anything.toString());
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
		last.NUMBER(null);
		if (ANYTHING_IN("0123456789", max)) {
			last.NUMBER(last.ANYTHING());
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
		last.NUMBER(null);
		if (ANYTHING_IN("01234567", max)) {
			last.NUMBER(last.ANYTHING());
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
		last.NUMBER(null);
		if (ANYTHING_IN("0123456789abcdefABCDEF", max)) {
			last.NUMBER(last.ANYTHING());
			return true;
		} else {
			return false;
		}
	}

	protected boolean DOTS() {
		return optional("...");
	}



	protected boolean IDENTIFIER() {
		int c = LA1();
		if (isAlpha(c)||c == '_') {
			StringBuffer identifier = new StringBuffer();
			do {
				identifier.append((char)lexer.consume());
				c = LA1();
			} while(isAlpha(c)||isDigit(c)||c == '_');
			last.IDENTIFIER(identifier.toString());
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
		int la = lexer.lookahead(1);
		if (isWhite(la)) {
			lexer.consume();
			last.WHITESPACE(Character.toString((char)la));
			return true;
		} else if (line_continuation()) {
			// To keep the same number of line in the output,
			// we will need to forward even line continuation
			// sequences. Because it does not matter for 
			// preprocessors, whether it is \r\n or just \n
			// we use the shorter one.
			last.WHITESPACE("\\\n");
			return true;
		} else if (optional("/*")) {
			// Multiline comments might contain CRLF
			// which implicitly means, that a directive line with comments
			// can spread over multiple lines even without line
			// continuation markers.
			StringBuffer comment = new StringBuffer("/*");
			while (! LA_equals("*/") && LA1() != Lexer.EOF) {
				if (line_continuation()) comment.append("\\\n");
				else comment.append((char)lexer.consume());
			}
			if (!optional("*/")) {
				syntaxError("missing '*/' to end the comment");
			}
			else 
			{
				comment.append("*/");
			}
			last.WHITESPACE(comment.toString());
			return true;
		} else if (optional("//")) {
			StringBuffer comment = new StringBuffer("//");
			while (!isEndl(LA1())) {
				if (line_continuation()) comment.append("\\\n");
				else comment.append((char)lexer.consume());
			}
			// The CRLF is not part of the comment in the preprocessor.
			// The comment is either a text line or at the end of a directive line.
			// In both types of rules , it is necessary to be able to 
			// check for the line end (anyway).
			last.WHITESPACE(comment.toString());
			return true;
		} else {
			return false;
		}
	}

	
	protected boolean CRLF() {
		if (LA1() == '\n') {
			lexer.consume(); 
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
		while (WHITESPACE() || CRLF()) result = true;
		return result;
	}


	
	
	protected boolean isEndl(int c) {
		return c == '\n' || c == Lexer.EOF;
	}

	protected boolean isDigit(int c) {
		if (c == Lexer.EOF) return false;
		return '0' <= c && c <= '9';
	}

	protected boolean isAlpha(int c) {
		if (c == Lexer.EOF) return false;
		return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
	}
	
	protected boolean isWhite(int c) {
		if (c == Lexer.EOF) return false;
		else return c == ' ' || c == '\t' || c == '\r';
	}

	/**
	 * consumes if the following tokens equal string
	 * @param string
	 * @return
	 */
	protected boolean optional(String string) {
		if (LA_equals(string)) {
			lexer.consume(string.length());
			return true;
		} else {
			return false;
		}
	}
	
	protected boolean optional(char c) {
		if (LA1() == c) {
			lexer.consume();
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
			int next = lexer.lookahead(id.length()+1);
			if (isAlpha(next) || isDigit(next) || next == '_' ) {
				return false;
			} else {
				lexer.consume(id.length());
				last.IDENTIFIER(id);
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
			syntaxError(lexer.nextLocation(), "missing '" + c + "'");
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
			while (!ENDL()) lexer.consume();
			return false;
		}
		return true;
	}



}
