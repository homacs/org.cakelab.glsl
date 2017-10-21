package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

/**
 * Representing any token which is by the C specification referred to as punctuator. 
 * Those are all operators and separating tokens such as ';' etc. 
 * Basically anything not an identifier, constant value or white space.
 * @author homac
 *
 */
public class TPunctuator extends Token {

	public TPunctuator(Interval interval, String text) {
		super(interval, text);
	}

	public TPunctuator(TPunctuator that) {
		super(that);
	}

	public TPunctuator(String text) {
		super(text);
	}

	@Override
	public Token clone() {
		return new TPunctuator(this);
	}
	
	

}
