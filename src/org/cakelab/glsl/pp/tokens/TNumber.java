package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TNumber extends Token {
	
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

	public boolean isDecimalInteger() {
		return !isFloatingPoint() && !isOctal() && !isHexadecimal();
	}

	private boolean isOctal() {
		return text.startsWith("0");
	}

	public boolean isFloatingPoint() {
		return text.contains(".") || text.endsWith("f") || text.endsWith("F");
	}

	public boolean isHexadecimal() {
		return text.startsWith("0x") || text.startsWith("0X");
	}

	
	
	
}
