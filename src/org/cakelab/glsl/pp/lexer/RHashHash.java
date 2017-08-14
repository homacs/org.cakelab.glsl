package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.Token;

public class RHashHash extends LexerRule {

	public RHashHash(IScanner in, ErrorHandler handler) {
		super(in, handler);
	}

	@Override
	public Token consume() {
		in.consume();
		Location start = in.location();
		in.consume();
		return new TPunctuator(interval(start), "##");
	}

	@Override
	public boolean match() {
		return in.LA_equals("##");
	}

	@Override
	public void skip() {
		in.consume(2);
	}

}
