package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.ErrorHandlingStrategy;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TNumber;
import org.cakelab.glsl.pp.tokens.Token;

public class RNumber extends LexerRule {
	
	public RNumber(IScanner in, ErrorHandlingStrategy handler) {
		super(in, handler);
	}
	
	@Override
	public Token analyse() {
		if (match()) {
			tokenStart();
			final String DEC_DIGITS = "0123456789";
			final String HEX_DIGITS = "0123456789abcdefABCDEF";
			final String DEC_EXPONENT = "eE";
			final String HEX_EXPONENT = "pP";
			String exponentPrefixes = DEC_EXPONENT;
			boolean isReal = false;
			String digits = DEC_DIGITS;
			StringBuffer num = new StringBuffer();
	
			if (LA_equals("0x")||LA_equals("0X")) {
				num.append(consumeChar());
				num.append(consumeChar());

				digits = HEX_DIGITS;
				exponentPrefixes = HEX_EXPONENT;
			}
	
	
			if (consume_from_set(digits, num)) {
				if (LA1() == '.') {
					isReal = true;
					num.append(consumeChar());
					consume_from_set(digits, num);
				}
			} else if (LA1() == '.') {
				isReal = true;
				num.append(consumeChar());
				if (consume_from_set(digits, num)) {
					// consumed above
				} else {
					syntaxError("number format error: missing digits after '.'");
					return createToken(num.toString());
				}
			} else if (digits == HEX_DIGITS) {
				syntaxError("missing number after hex prefix");
				return createToken(num.toString());
			}
	
			assert(num.length() > 0) : "internal error: token can only be consumed if match was positive!";
			
			if (consume_from_set(exponentPrefixes, num)) {
				isReal = true;
				consume_from_set("+-", num);
				// exponent always decimal digits
				if (!consume_from_set("0123456789", num)) {
					syntaxError("missing value of exponent");
					return createToken(num.toString());
				}
			}
			
			// postfixes
			if (isReal) {
				if (consume_from_set("fF", num)) {
					// float
				} else if (consume_from_set("lL", num)) {
					// double
				}
			} else {
				if (consume_from_set("fF", num)) {
					isReal = true;
					// float again
				} else {
					consume_from_set("uU", num); // unsigned
					consume_from_set("lL", num); // long
				}
			}
			return createToken(num.toString());
		} else {
			return null;
		}
	}


	private boolean consume_from_set(String set, StringBuffer num) {
		int c = LA1();
		if (set.indexOf(c) >= 0) {
			do {
				num.append((char)c);
				consumeChar();
				c = LA1();
			} while (set.indexOf(c) >= 0);
			return true;
		}
		return false;
	}

	public boolean match() {
		int c = LA1();
		return (isDigit(c) || (c == '.' && isDigit(LA(2))));
	}

	@Override
	protected Token createToken(Interval interval, String text) {
		return new TNumber(interval, text);
	}

}