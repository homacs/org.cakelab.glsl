package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.tokens.THash;
import org.cakelab.glsl.pp.tokens.Token;

public class RHash extends LexerRuleEquals {

	public RHash(PPState state) {
		super(state, "#");
	}

	@Override
	protected Token createToken(Interval interval, String match) {
		return new THash(interval, match);
	}


}
