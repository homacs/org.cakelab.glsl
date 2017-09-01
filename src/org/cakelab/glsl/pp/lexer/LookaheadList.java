package org.cakelab.glsl.pp.lexer;

import java.util.Vector;

import org.cakelab.glsl.pp.tokens.Token;

public class LookaheadList {
	private Vector<Token> lookaheads = new Vector<Token>();

	public Token last() {
		if (lookaheads.isEmpty()) return null;
		return lookaheads.lastElement();
	}

	public int size() {
		return lookaheads.size();
	}

	public void add(Token token) {
		lookaheads.add(token);
	}

	public Token get(int i) {
		return lookaheads.get(i);
	}

	public Token popFront() {
		Token result = lookaheads.get(0);
		lookaheads.remove(0);
		return result;
	}

	public void clear() {
		lookaheads.clear();
	}
}
