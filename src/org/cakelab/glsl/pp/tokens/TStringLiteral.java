package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TStringLiteral extends TCharSequence {

	public TStringLiteral(Interval interval, String text) {
		super(interval, text);
	}

	public TStringLiteral(TStringLiteral that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new TStringLiteral(this);
	}

}
