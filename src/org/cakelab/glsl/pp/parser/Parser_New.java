package org.cakelab.glsl.pp.parser;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.ConstantValue;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.pp.error.ErrorHandling_New;
import org.cakelab.glsl.pp.error.ErrorRecoveryHandler;
import org.cakelab.glsl.pp.lexer.ILexer;
import org.cakelab.glsl.pp.tokens.TCharSequence;
import org.cakelab.glsl.pp.tokens.TComment;
import org.cakelab.glsl.pp.tokens.TCrlf;
import org.cakelab.glsl.pp.tokens.TDots;
import org.cakelab.glsl.pp.tokens.TEof;
import org.cakelab.glsl.pp.tokens.THeaderPath;
import org.cakelab.glsl.pp.tokens.TIdentifier;
import org.cakelab.glsl.pp.tokens.TLineContinuation;
import org.cakelab.glsl.pp.tokens.TNumber;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.TWhitespace;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

public abstract class Parser_New extends ErrorHandling_New implements ErrorRecoveryHandler {

	protected Token token = null;
	protected ILexer lexer;
	
	
	public Parser_New(ILexer lexer) {
		setLexer(lexer);
	}
	
	protected Parser_New() {}
	
	protected void setLexer(ILexer lexer) {
		this.lexer = lexer;
		super.setErrorHandler(lexer.getErrorHandler());
		super.setRecoveryHandler(this);
	}


	public boolean atEOF() {
		return lexer.eof();
	}

	
	public abstract void parse();
	
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
				lexer.consume(1);
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
	protected TokenList read_remaining_line() {
		// TODO [6] see if we really need this (consider methods above)
		if (lexer.eof()) return null;
		TokenList result = new TokenList();
		while(!ENDL()) {
			if (!line_continuation()) {
				result.add(lexer.consume(1));
			}
		}
		return result;
	}

	/** \\\r\n or \\\n */
	protected boolean line_continuation() {
		token = null;
		if (optional(TLineContinuation.class)) {
			return true;
		}
		return false;
	}
	
	protected boolean optional(Class<? extends Token> tokenType) {
		if (tokenType.isInstance(lexer.lookahead(1))) {
			token = lexer.consume(1);
			return true;
		}
		return false;
	}

	protected boolean optional(Class<? extends Token> tokenType, String text) {
		Token la = lexer.lookahead(1);
		if (tokenType.isInstance(la) && text.equals(la.getText())) {
			token = lexer.consume(1);
			return true;
		}
		return false;
	}

	protected boolean mandatory(Class<? extends Token> tokenType, String text) {
		if (!optional(tokenType, text)) {
			syntaxError(lexer.lookahead(1).getStart(), "missing token '" + text + "' (type: "+ tokenType.getSimpleName() + ")");
			return false;
		}
		return true;
	}


	
	
	/**
	 * Either \r\n or \n or EOF
	 * @return
	 */
	protected boolean ENDL() {
		token = null;
		if (optional(TCrlf.class) || optional(TEof.class)) {
			return true;
		} else {
			return false;
		}
	}

	
	protected boolean HEADER_PATH() {
		token = null;
		if (optional(THeaderPath.class)) {
			return true;
		}
		return false;
	}
	

	
	
	protected String decodeCharSequence(TCharSequence token, char startDelimiter, char endDelimiter) {
		int i = 0;
		String text = token.getText();
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
							syntaxError(token, "illegal unicode code sequence in character sequence (\\" + prefix + upto_four_hex_digits.toString() + ")");
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
							syntaxError(token, "illegal octal sequence in character sequence (\\" + upto_three_oct_digits + ")");
							return string.toString();
						}
					} else {
						syntaxError(token, "undefined escape sequence '\\" + (char)c + "'");
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
			return expressionError(token.getInterval(), "not a valid number '" + token.getText() + "'");
		}
	}

	private boolean isOctDigit(char c) {
		return '0' <= c  && c <= '7';
	}

	private boolean isDigit(char c) {
		return '0' <= c  && c <= '9';
	}

	private boolean isHexDigit(char c) {
		return isDigit(c) || ('a' <= c && c <= 'f') || ('A' <= c && c <= 'F');
	}

	protected boolean NUMBER() {
		token = null;
		if (optional(TNumber.class)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	protected boolean DOTS() {
		token = null;
		return optional(TDots.class);
	}

	protected boolean PUNCTUATOR(boolean acceptHashes) {
		token = null;
		Token t = lexer.lookahead(1);
		if (t instanceof TPunctuator) {
			if (!acceptHashes) {
				// TODO [4] consider introduction of THash and THashHash
				String text = t.getText();
				if (!text.equals("#") && !text.equals("##")) {
					token = t;
				}
			}
		}
		return token != null;
	}
	
	protected boolean PUNCTUATOR(char c) {
		return PUNCTUATOR(String.valueOf(c));
	}

	protected boolean PUNCTUATOR(String text) {
		token = null;
		Token t = lexer.lookahead(1);
		if (t instanceof TPunctuator && text.equals(t.getText())) {
			token = lexer.consume(1);
		}
		return token != null;
	}



	protected boolean IDENTIFIER() {
		token = null;
		if (optional(TIdentifier.class)) {
			return true;
		} else {
			return false;
		}
	}
	


	/** WHITESPACE including traditional white space chars,
	 * line continuation markers and comments but no pure
	 * CRLF (except multi-line comments and line continuations).
	 * Any whitespace read is stored in "this.token" .
	 */
	protected boolean WHITESPACE() {
		token = null;
		if (optional(TWhitespace.class)) {
			return true;
		} else if (line_continuation()) {
			return true;
		} else if (optional(TComment.class)) {
			return true;
		} else {
			return false;
		}
	}

	protected int nextNonWhiteLookahead(int from, boolean skipCRLF) {
		int i = from;
		for (Token la = lexer.lookahead(i); !(la instanceof TEof); la = lexer.lookahead(i)) {
			if (!skipCRLF && la instanceof TCrlf) {
				break;
			} else if (la instanceof TWhitespace) {
				i++;
			} else {
				break;
			}
		}
		return i;
	}
	
	
	protected boolean CRLF() {
		token = null;
		if (optional(TCrlf.class)) {
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
		while (optional(TCrlf.class) || optional(TWhitespace.class)) {
			result = true;
		}
		return result;
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
		Token t = lexer.lookahead(1);
		if (t instanceof TIdentifier && t.getText().equals(id)) {
			token = lexer.consume(1);
			return true;
		} else {
			return false;
		}
	}


	protected boolean mandatory_endl() {
		if (!ENDL()) {
			syntaxError(lexer.lookahead(1).getStart(), "missing mandatory CRLF or end of file");
			
			recoveryHandler.skip_to_next_line();
			// still here, then skip to next line end to recover from error
			while (!ENDL()) lexer.consume(1);
			return false;
		}
		return true;
	}

	@Override
	public void dismiss() {
		lexer.dismiss();
	}

	@Override
	public void skip_to_next_line() {
		skip_remaining_line();
		
	}



}
