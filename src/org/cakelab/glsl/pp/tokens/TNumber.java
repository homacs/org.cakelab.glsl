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

	
	
	
}
