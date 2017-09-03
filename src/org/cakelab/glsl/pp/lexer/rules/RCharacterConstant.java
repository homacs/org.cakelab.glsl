package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.tokens.TCharacterConstant;
import org.cakelab.glsl.pp.tokens.Token;

public class RCharacterConstant extends LexerRuleCharSequence {

	public RCharacterConstant(PPState state) {
		super(state, '\'', '\'');
	}

	@Override
	protected Token createToken(Interval interval, String text) {
		return new TCharacterConstant(interval, text);
	}

}
