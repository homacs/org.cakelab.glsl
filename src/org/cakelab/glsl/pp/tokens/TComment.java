package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TComment extends TWhitespace {

	public TComment(Interval interval, String text) {
		super(interval, text);
	}

	public TComment(TComment that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new TComment(this);
	}

	
	
}
