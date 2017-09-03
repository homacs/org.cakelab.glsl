package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.tokens.TLineContinuation;
import org.cakelab.glsl.pp.tokens.Token;

public class RLineContinuation extends LexerRuleEquals {
	
	public RLineContinuation(PPState state) {
		super(state, TLineContinuation.TEXT_OPTIONS);
	}

	@Override
	protected Token createToken(Interval interval, String match) {
		return new TLineContinuation(interval, match);
	}

	
	


}
