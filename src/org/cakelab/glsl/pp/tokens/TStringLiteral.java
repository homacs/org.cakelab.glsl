package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.TokenFormatException;

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

	
	public String decode() throws TokenFormatException {
		return decode('"','"');
	}
	
	
}
