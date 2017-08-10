package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.impl.NodeImpl;

public class Token extends NodeImpl {
	protected String text;
	
	public Token(Interval interval, String text) {
		super(interval);
		this.text = text;
	}

	public String getText() {
		return text;
	}
	
	
	
}
