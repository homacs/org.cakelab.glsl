package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.tokens.Token;

public abstract class LexerRuleEquals extends LexerRule {
	private String[] options;
	
	public LexerRuleEquals(PPState state, String[] options) {
		super(state);
		this.options = options;
	}

	public LexerRuleEquals(PPState state, String option) {
		super(state);
		this.options = new String[]{option};
	}

	@Override
	protected Token analyse() {
		for (String o : options) {
			if (LA_equals(o)) {
				tokenStart();
				consume(o.length());
				return createToken(o);
			}
		}
		return null;
	}

}
