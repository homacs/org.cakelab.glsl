package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

/**
 * '<' char-sequence '>'
 * @author homac
 *
 */
public class THeaderPath extends Token {

	public THeaderPath(Interval interval, String text) {
		super(interval, text);
	}

	public THeaderPath(THeaderPath that) {
		super(that);
	}

	public THeaderPath(String text) {
		super(text);
	}

	public String getPath() {
		if (text.charAt(text.length()-1) == '>') {
			return text.substring(1, text.length()-1);
		} else {
			// error recovery
			return text.substring(1, text.length());
		}
	}

	@Override
	public Token clone() {
		return new THeaderPath(this);
	}

}
