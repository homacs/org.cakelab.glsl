package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TIdentifier extends Token {
	
	public TIdentifier(Interval interval, String text) {
		super(interval, text);
	}

	public TIdentifier(TIdentifier that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new TIdentifier(this);
	}

}
