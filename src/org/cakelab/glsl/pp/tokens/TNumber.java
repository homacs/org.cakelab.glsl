package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.ConstantValue;
import org.cakelab.glsl.pp.error.TokenFormatException;

/** Base class for number tokens of any format, 
 * such constant integer or floating point numbers 
 * */
public class TNumber extends Token {
	
	private ConstantValue<? extends Number> decoded = null;


	public TNumber(Interval interval, String text) {
		super(interval, text);
	}

	public TNumber(TNumber that) {
		super(that);
	}

	public TNumber(String text) {
		super(text);
	}

	@Override
	public Token clone() {
		return new TNumber(this);
	}

	/**
	 * basically not floating point and not hexadecimal
	 * @return
	 */
	public boolean isDecimalInteger() {
		return !isFloatingPoint() && !isHexadecimal();
	}

	public boolean isFloatingPoint() {
		return text.contains(".") || (!isHexadecimal() && (text.endsWith("f") || text.endsWith("F")));
	}

	public boolean isHexadecimal() {
		return text.startsWith("0x") || text.startsWith("0X");
	}

	public boolean isUnsignedInteger() {
		int i = text.length()-1;
		if (i > 1 && text.charAt(i) == 'l' || text.charAt(i) == 'L') {
			i--;
		}
		if (i > 0 && text.charAt(i) == 'u' || text.charAt(i) == 'U') {
			return true;
		}
		return false;
	}

	public boolean isInteger() {
		return !isFloatingPoint() && !isUnsignedInteger();
	}

	public boolean isFloat() {
		if (isFloatingPoint()) {
			int i = text.length()-1;
			if (i > 0 && text.charAt(i) == 'f' || text.charAt(i) == 'F') {
				return true;
			}
		}
		return false;
	}
	
	public boolean isDouble() {
		return isFloatingPoint() && !isFloat();
	}
	

	public ConstantValue<? extends Number> decode() throws TokenFormatException {
		if (decoded != null) return decoded;
		final int DEC = 0;
		final int HEX = 1;
		int type = DEC;
		final String HEX_DIGITS = "0123456789abcdef";

		boolean isReal = false;
		
		//
		// Decode value
		//
		try {
			
			String text = getText().toLowerCase();
			

			
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
				decoded = new ConstantValue<Double>(getInterval(), value);
			} else {
				if (text.endsWith("l")) text = text.substring(0, text.length()-1);
				if (text.endsWith("u")) text = text.substring(0, text.length()-1);
				Long value = Long.decode(text);
				decoded  = new ConstantValue<Long>(getInterval(), value, false);
			}
		} catch (NumberFormatException e) {
			// this should not occur at this stage, because the preprocessor already checked the syntax
			throw new TokenFormatException(this, "not a valid number '" + getText() + "'");
		}
		return decoded;
	}


	
}
