package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TLineContinuation extends TWhitespace {

	public TLineContinuation(Interval interval, String text) {
		super(interval, text);
	}

	public TLineContinuation(TLineContinuation that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new TLineContinuation(this);
	}
	

}
