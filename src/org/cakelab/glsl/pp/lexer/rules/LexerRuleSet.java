package org.cakelab.glsl.pp.lexer.rules;

import java.util.Arrays;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.tokens.Token;

public class LexerRuleSet extends LexerRule {
	protected LexerRule[] ruleSet;
	
	public LexerRuleSet(PPState state, LexerRule ... ruleSet) {
		super(state);
		this.ruleSet = ruleSet;
	}

	
	
	@Override
	protected Token analyse() {
		Token result = null;
		for (LexerRule r : ruleSet) {
			result = r.analyse(getScanner());
			if (result != null) break;
		}
		return result;
	}

	@Override
	protected Token createToken(Interval interval, String text) {
		throw new Error("internal error: lexer rule set has to delegate lexical analysis");
	}

	public void prependRule(LexerRule rule) {
		ruleSet = Arrays.copyOf(ruleSet, ruleSet.length+1);
		ruleSet[0] = rule;
	}



	

}
