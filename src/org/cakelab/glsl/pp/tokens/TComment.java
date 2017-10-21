package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;

/** Token containing any kind of C-style comment */
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

	/**
	 * 
	 * @return true if text starts with "//"
	 */
	public boolean isSingleLineComment() {
		return getText().startsWith("//");
	}
	
	/**
	 * 
	 * @return true if text starts with "/*"
	 */
	public boolean isMultiLineComment() {
		return getText().startsWith("/*");
	}

	/**
	 * 
	 * @return true if text starts with "/**"
	 */
	public boolean isJavaDocComment() {
		return getText().startsWith("/**");
	}
	
	
}
