package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TAtom extends Token {
	
	public TAtom(Interval interval, String text) {
		super(interval, text);
	}

	public char getChar() {
		return super.text.charAt(0);
	}

}
