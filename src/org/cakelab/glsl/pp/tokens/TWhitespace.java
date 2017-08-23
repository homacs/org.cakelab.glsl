package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TWhitespace extends Token {

	public TWhitespace(Interval interval, String text) {
		super(interval, text);
	}

	public TWhitespace(TWhitespace that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new TWhitespace(this);
	}
	
}
