package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TEof extends Token {

	public TEof(Interval interval) {
		super(interval, "");
	}

	public TEof(TEof that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new TEof(this);
	}

}
