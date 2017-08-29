package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

/** Unspecified sequence of characters */
public class TAny extends Token {
	
	public TAny(String text) {
		super(text);
	}

	public TAny(TAny that) {
		super(that);
	}

	public TAny(Interval interval, String text) {
		super(interval, text);
	}

	@Override
	public Token clone() {
		return new TAny(this);
	}

	
	
}
