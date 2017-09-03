package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.Token;

public class RHashHash extends LexerRuleEquals {

	public RHashHash(PPState state) {
		super(state, "##");
	}

	@Override
	protected Token createToken(Interval interval, String match) {
		return new TPunctuator(interval, match);
	}



}
