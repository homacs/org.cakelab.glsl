package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.TokenFormatException;

public class TCharacterConstant extends TCharSequence {

	public TCharacterConstant(Interval interval, String text) {
		super(interval, text);
	}

	public TCharacterConstant(TCharacterConstant that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new TCharacterConstant(this);
	}

	public char decode() throws TokenFormatException {
		String s = super.decode('\'', '\'');
		if (s.length() != 1) throw new TokenFormatException(this, "char constant is supposed to contain 1 character exactly");
		return s.charAt(0);
	}
	
}
