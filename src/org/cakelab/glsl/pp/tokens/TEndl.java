package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TEndl extends Token {
	// TODO still in use?
	
	public TEndl(Interval interval, String text) {
		super(interval, text);
	}

	public TEndl(TEndl that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new TEndl(this);
	}

}
