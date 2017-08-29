package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.tokens.Token;

public class Lookahead {
	LexerRule rule;
	Token token;
	
	int offset;
	int length;
	
	public Lookahead(LexerRule rule, int offset, int length, Token token) {
		this.rule = rule;
		this.offset = offset;
		this.token = token;
		this.length = length;
	}

	public int length() {
		return length;
	}
}
