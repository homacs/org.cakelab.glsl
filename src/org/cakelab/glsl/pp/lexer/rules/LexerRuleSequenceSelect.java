package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.tokens.Token;

public abstract class LexerRuleSequenceSelect extends LexerRule {
	
	private String[] set;
	protected String lastMatch;

	public LexerRuleSequenceSelect(PPState state, String[] set) {
		super(state);
		this.set = set;
	}

	@Override
	public Token analyse() {
		for (String s : set) {
			if (LA_equals(s)) {
				tokenStart();
				consume(s.length());
				return createToken(s);
			}
		}
		return null;
	}



}
