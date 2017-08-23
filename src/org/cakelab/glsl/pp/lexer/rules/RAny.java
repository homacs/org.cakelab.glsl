package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TAny;
import org.cakelab.glsl.pp.tokens.Token;

public class RAny extends LexerRule {

	public RAny(IScanner in, ErrorHandler handler) {
		super(in, handler);
	}

	@Override
	public Token consume() {
		char c = (char) in.consume();
		return new TAny(interval(in.location()), String.valueOf(c));
	}

	@Override
	public boolean match() {
		return in.LA1() != IScanner.EOF;
	}

	@Override
	public void skip() {
		in.consume();
	}

}
