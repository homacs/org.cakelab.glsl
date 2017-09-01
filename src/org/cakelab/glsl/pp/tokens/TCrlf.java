package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

public class TCrlf extends TWhitespace {
	public static String[] TEXT_OPTIONS = new String[] {"\r\n", "\n"};
	
	public TCrlf(Interval interval, String text) {
		super(interval, text);
	}

	public TCrlf(String text) {
		super(text);
	}

	public TCrlf(TCrlf that) {
		super(that);
	}

	@Override
	public Token clone() {
		return new TCrlf(this);
	}

}
