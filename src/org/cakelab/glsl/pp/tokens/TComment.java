package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TComment extends TWhitespace {

	public TComment(Interval interval, String text) {
		super(interval, text);
	}

}
