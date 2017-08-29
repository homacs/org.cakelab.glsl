package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TWhitespace extends Token {

	public TWhitespace(String text) {
		super(text);
	}

	public TWhitespace(TWhitespace that) {
		super(that);
	}

	public TWhitespace(Interval interval, String string) {
		super(interval, string);
	}

	@Override
	public Token clone() {
		return new TWhitespace(this);
	}
	
}
