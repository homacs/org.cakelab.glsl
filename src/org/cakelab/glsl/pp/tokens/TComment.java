package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TComment extends TWhitespace {

	public TComment(String text) {
		super(text);
	}

	public TComment(TComment that) {
		super(that);
	}

	public TComment(Interval interval, String text) {
		super(interval, text);
	}

	@Override
	public Token clone() {
		return new TComment(this);
	}

	public boolean isMultiLineComment() {
		return getText().startsWith("/*");
	}

	
	
}
