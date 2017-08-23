package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

/**
 * Single characters, mostly operators and such.
 * @author homac
 *
 */
public class TAtom extends Token {
	
	public TAtom(Interval interval, String text) {
		super(interval, text);
	}

	public TAtom(Interval interval, char text) {
		super(interval, String.valueOf(text));
	}

	public TAtom(TAtom that) {
		super(that);
	}

	public char getChar() {
		return super.text.charAt(0);
	}

	@Override
	public Token clone() {
		return new TAtom(this);
	}

}
