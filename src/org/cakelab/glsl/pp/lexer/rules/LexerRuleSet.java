package org.cakelab.glsl.pp.lexer.rules;

import java.util.Arrays;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.Token;

/**
 * A lexer rule set combines and manages a set of {@link LexerRule}s.
 * 
 * <p>
 * An instance of {@link LexerRuleSet} is created with a given set of lexer rules.
 * The set of rules can be extended by the method {@link #prependRule(LexerRule)}.
 * Its implementation of the method {@link #analyse()} delegates the call
 * to all lexers in the given order, until a matching token was found.
 * </p>
 * 
 * @author homac
 *
 */
public class LexerRuleSet extends LexerRule {
	protected LexerRule[] ruleSet;
	
	public LexerRuleSet(PPState state, LexerRule ... ruleSet) {
		super(state);
		this.ruleSet = ruleSet;
	}

	
	
	@Override
	protected Token analyse() {
		Token result = null;
		IScanner scanner = getScanner();
		for (LexerRule r : ruleSet) {
			result = r.analyse(scanner);
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
