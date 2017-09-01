package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class THash extends TPunctuator {

	public THash(Interval interval, String text) {
		super(interval, text);
	}

	public THash(String text) {
		super(text);
	}

	public THash(THash that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new THash(this);
	}

}
