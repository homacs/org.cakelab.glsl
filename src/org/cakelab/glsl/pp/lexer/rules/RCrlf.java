package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.tokens.TCrlf;
import org.cakelab.glsl.pp.tokens.Token;

public class RCrlf extends LexerRuleEquals {
	
	public RCrlf(PPState state) {
		super(state, TCrlf.TEXT_OPTIONS);
	}

	@Override
	protected Token createToken(Interval interval, String match) {
		return new TCrlf(interval, match);
	}

}