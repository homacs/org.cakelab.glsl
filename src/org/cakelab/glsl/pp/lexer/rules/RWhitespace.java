package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TWhitespace;
import org.cakelab.glsl.pp.tokens.Token;

public class RWhitespace extends LexerRule {
	char[] set = new char[]{'\t', ' '};
	
	public RWhitespace(IScanner in, ErrorHandler handler) {
		super(in, handler);
	}
	
	@Override
	public Token consume() {
		StringBuffer whites = new StringBuffer();
		Location start = in.nextLocation();
		while(match()) {
			whites.append((char)in.consume());
		}
		return new TWhitespace(interval(start), whites.toString());
	}

	@Override
	public boolean match() {
		for (char c : set) {
			if (in.LA1() == c) return true;
		}
		return false;
	}

	@Override
	public void skip() {
		consume();
	}
}