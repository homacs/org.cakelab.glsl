package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TCharSequence extends Token {

	public TCharSequence(Interval interval, String text) {
		super(interval, text);
	}

	public TCharSequence(TCharSequence that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new TCharSequence(this);
	}

}
