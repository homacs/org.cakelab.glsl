package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.impl.NodeImpl;
import org.cakelab.glsl.pp.tokens.TokenList;

public class Pragma extends NodeImpl {

	protected TokenList tokens;


	public Pragma(Interval interval, TokenList tokens) {
		super(interval);
		this.tokens = new TokenList();
	}

	public TokenList getTokens() {
		return tokens;
	}

	public void setTokens(TokenList tokens) {
		this.tokens = tokens;
	}

}
