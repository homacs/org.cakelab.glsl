package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.lexer.Lookahead;
import org.cakelab.glsl.pp.scanner.IScanner;

public class LexerRuleSet extends LexerRule {
	protected LexerRule[] ruleSet;
	
	public LexerRuleSet(IScanner in, ErrorHandler handler, LexerRule ... ruleSet) {
		super(in, handler);
		this.ruleSet = ruleSet;
	}

	@Override
	public Lookahead lookahead(int offset) {
		Lookahead result = null;
		for (LexerRule r : ruleSet) {
			result = r.lookahead(offset);
			if (result != null) break;
		}
		return result;
	}


}
