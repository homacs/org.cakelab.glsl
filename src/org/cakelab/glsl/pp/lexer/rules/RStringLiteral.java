package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.tokens.TStringLiteral;
import org.cakelab.glsl.pp.tokens.Token;

public class RStringLiteral extends LexerRuleCharSequence {

	public RStringLiteral(PPState state) {
		super(state, '"', '"');
	}

	@Override
	protected Token createToken(Interval interval, String text) {
		return new TStringLiteral(interval, text);
	}

}
