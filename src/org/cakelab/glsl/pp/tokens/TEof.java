package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

/**
 * Token representing the end of an input stream.
 * 
 * @author homac
 *
 */
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
