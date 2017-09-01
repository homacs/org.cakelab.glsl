package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TDots extends TPunctuator {

	public static String TEXT = "...";

	public TDots() {
		super(TEXT);
	}
	
	public TDots(Interval interval) {
		super(interval, TEXT);
	}
	
	
	public TDots(TDots that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new TDots(this);
	}

}
