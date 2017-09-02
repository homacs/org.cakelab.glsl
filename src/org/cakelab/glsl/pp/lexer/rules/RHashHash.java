package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.ErrorHandlingStrategy;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.Token;

public class RHashHash extends LexerRuleEquals {

	public RHashHash(IScanner in, ErrorHandlingStrategy handler) {
		super(in, handler, "##");
	}

	@Override
	protected Token createToken(Interval interval, String match) {
		return new TPunctuator(interval, match);
	}



}