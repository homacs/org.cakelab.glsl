package org.cakelab.glsl.lang.lexer.tokens;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenSource;
import org.cakelab.glsl.lang.lexer.PPTokenSource;
import org.cakelab.glsl.pp.tokens.Token;

public class PPOutputToken implements org.antlr.v4.runtime.Token {

	private int start;
	private int end;
	private Token token;
	private int type;
	private int index;
	private PPTokenSource source;
	

	public PPOutputToken(int index, PPTokenSource source, int start, int end, int type, Token token) {
		this.index = index;
		this.source = source;
		this.start = start;
		this.end = end;
		this.type = type;
		this.token = token;
	}

	@Override
	public String getText() {
		return token.getText();
	}

	@Override
	public int getType() {
		return type;
	}

	@Override
	public int getLine() {
		return token.getStart().getLine();
	}

	@Override
	public int getCharPositionInLine() {
		return token.getStart().getColumn();
	}

	@Override
	public int getChannel() {
		throw new Error("impl");
	}

	@Override
	public int getTokenIndex() {
		return index;
	}

	@Override
	public int getStartIndex() {
		return start;
	}

	@Override
	public int getStopIndex() {
		return end;
	}

	@Override
	public TokenSource getTokenSource() {
		return source;
	}

	@Override
	public CharStream getInputStream() {
		throw new Error("not supported");
	}

	public Token getPPToken() {
		return token;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}