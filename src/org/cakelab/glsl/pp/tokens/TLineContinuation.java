package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TLineContinuation extends TWhitespace {

	public TLineContinuation(String text) {
		super(text);
	}

	public TLineContinuation(TLineContinuation that) {
		super(that);
	}

	public TLineContinuation(Interval interval, String text) {
		super(interval, text);
	}

	@Override
	public Token clone() {
		return new TLineContinuation(this);
	}
	

}
