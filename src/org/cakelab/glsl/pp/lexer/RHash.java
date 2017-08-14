package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.Token;

public class RHash extends LexerRule {

	public RHash(IScanner in, ErrorHandler handler) {
		super(in, handler);
	}

	@Override
	public Token consume() {
		return new TPunctuator(interval(in.location()), "#");
	}

	@Override
	public boolean match() {
		return in.LA_equals('#');
	}

	@Override
	public void skip() {
		in.consume();
	}

}
