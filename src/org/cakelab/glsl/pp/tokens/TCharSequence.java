package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.TokenFormatException;

public class TCharSequence extends Token {

	public TCharSequence(Interval interval, String text) {
		super(interval, text);
	}

	public TCharSequence(String text) {
		super(text);
	}

	public TCharSequence(TCharSequence that) {
		super(that);
	}


	@Override
	public Token clone() {
		return new TCharSequence(this);
	}

	protected String decode(char startDelimiter, char endDelimiter) throws TokenFormatException {
		int i = 0;

		String text = getText();
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
							throw new TokenFormatException(this, "illegal unicode code sequence in character sequence (\\" + prefix + upto_four_hex_digits.toString() + ")");
						}
					} else {
						// error recovery
						throw new TokenFormatException(this, "illegal unicode code sequence in character sequence (\\" + prefix + c + ")");
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
							throw new TokenFormatException(this, "illegal octal sequence in character sequence (\\" + upto_three_oct_digits + ")");
						}
					} else {
						throw new TokenFormatException(this, "undefined escape sequence '\\" + (char)c + "'");
					}
					break;
				}
			}
		}
		assert text.charAt(i) == endDelimiter : "missing end delimiter in string";
		assert ++i == text.length() : "end delimiter before end of text";
		return string.toString();
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


}
