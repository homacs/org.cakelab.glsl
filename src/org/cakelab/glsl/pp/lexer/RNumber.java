package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TNumber;
import org.cakelab.glsl.pp.tokens.Token;

public class RNumber extends LexerRule {
	
	public RNumber(IScanner in, ErrorHandler handler) {
		super(in, handler);
	}
	
	@Override
	public Token consume() {
		Location mark = in.nextLocation();
		
		final String DEC_DIGITS = "0123456789";
		final String HEX_DIGITS = "0123456789abcdefABCDEF";
		final String DEC_EXPONENT = "eE";
		final String HEX_EXPONENT = "pP";
		String exponentPrefixes = DEC_EXPONENT;
		boolean isReal = false;
		String digits = DEC_DIGITS;
		StringBuffer num = new StringBuffer();

		if (in.LA_equals("0x")||in.LA_equals("0X")) {
			in.consume_to_buffer(2, num);
			digits = HEX_DIGITS;
			exponentPrefixes = HEX_EXPONENT;
		}


		if (consume_from_set(digits, num)) {
			if (in.consume_optional('.')) {
				isReal = true;
				num.append('.');
				consume_from_set(digits, num);
			}
		} else if (in.consume_optional('.')) {
			isReal = true;
			num.append('.');
			if (consume_from_set(digits, num)) {
				// consumed above
			} else {
				syntaxError("number format error: missing digits after '.'");
				return new TNumber(interval(mark), num.toString());
			}
		} else if (digits == HEX_DIGITS) {
			syntaxError(mark, "missing number after hex prefix");
			return new TNumber(interval(mark), num.toString());
		}

		assert(num.length() > 0) : "internal error: token can only be consumed if match was positive!";
		
		if (consume_from_set(exponentPrefixes, num)) {
			isReal = true;
			consume_from_set("+-", num);
			// exponent always decimal digits
			if (!consume_from_set("0123456789", num)) {
				syntaxError(mark, "missing value of exponent");
				return new TNumber(interval(mark), num.toString());
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
		return new TNumber(interval(mark), num.toString());
	}

	private boolean consume_from_set(String set, StringBuffer num) {
		int c = in.LA1();
		if (set.indexOf(c) >= 0) {
			do {
				num.append((char)c);
				in.consume();
				c = in.LA1();
			} while (set.indexOf(c) >= 0);
			return true;
		}
		return false;
	}

	@Override
	public boolean match() {
		int c = in.LA1();
		return (isDigit(c) || (c == '.' && isDigit(in.LA(2))));
	}

	@Override
	public void skip() {
		consume();
	}
}