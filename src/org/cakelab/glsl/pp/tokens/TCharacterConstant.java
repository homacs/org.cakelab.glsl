package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TCharacterConstant extends TCharSequence {

	public TCharacterConstant(Interval interval, String text) {
		super(interval, text);
	}

	public TCharacterConstant(TCharacterConstant that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new TCharacterConstant(this);
	}

	
}
