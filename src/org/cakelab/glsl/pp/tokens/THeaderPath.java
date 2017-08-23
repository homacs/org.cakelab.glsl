package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class THeaderPath extends Token {

	public THeaderPath(Interval interval, String text) {
		super(interval, text);
	}

	public THeaderPath(THeaderPath that) {
		super(that);
	}

	public String getPath() {
		if (text.charAt(text.length()-1) == '>') {
			// error recovery
			return text.substring(1, text.length()-2);
		} else {
			return text.substring(1, text.length()-1);
		}
	}

	@Override
	public Token clone() {
		return new THeaderPath(this);
	}

}
