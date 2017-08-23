package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TPunctuator extends Token {

	public TPunctuator(Interval interval, String text) {
		super(interval, text);
	}

	public TPunctuator(TPunctuator that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new TPunctuator(this);
	}
	
	

}
