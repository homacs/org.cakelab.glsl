package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TIdentifier;
import org.cakelab.glsl.pp.tokens.Token;

public class RIdentifier extends LexerRule {
	
	public RIdentifier(IScanner in, ErrorHandler handler) {
		super(in, handler);
	}
	
	@Override
	public Token consume() {
		StringBuffer identifier = new StringBuffer();
		Location start = in.nextLocation();
		int c = in.LA1();
		do {
			identifier.append((char)in.consume());
			c = in.LA1();
		} while(isAlpha(c)||isDigit(c)||c == '_');
		return new TIdentifier(interval(start), identifier.toString());
	}

	@Override
	public boolean match() {
		int c = in.LA1();
		return (isAlpha(c) || c == '_');
	}

	@Override
	public void skip() {
		consume();
	}
}