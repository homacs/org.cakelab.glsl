package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.impl.NodeImpl;

public abstract class Token extends NodeImpl {
	protected String text;
	
	public Token(Interval interval, String text) {
		super(interval);
		this.text = text;
	}

	public Token(Token that) {
		super(that);
		this.text = that.text;
	}

	public String getText() {
		return text;
	}

	public int length() {
		return text.length();
	}
	
	
	public abstract Token clone();

	
}
