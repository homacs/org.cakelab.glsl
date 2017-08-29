package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.Token;

public class RHash extends LexerRuleEquals {

	public RHash(IScanner in, ErrorHandler handler) {
		super(in, handler, "#");
	}

	@Override
	protected Token createToken(String match) {
		return new TPunctuator(match);
	}


}
