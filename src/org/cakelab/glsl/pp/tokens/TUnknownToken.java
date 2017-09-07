package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

/** Unspecified sequence of characters */
public class TUnknownToken extends TWhitespace {
	
	public TUnknownToken(String text) {
		super(text);
	}

	public TUnknownToken(TUnknownToken that) {
		super(that);
	}

	public TUnknownToken(Interval interval, String text) {
		super(interval, text);
	}

	@Override
	public Token clone() {
		return new TUnknownToken(this);
	}

	
	
}
