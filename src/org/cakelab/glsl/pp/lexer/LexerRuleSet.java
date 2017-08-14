package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.Token;

public class LexerRuleSet extends LexerRule {
	protected LexerRule[] ruleSet;
	private LexerRule lastMatch;
	
	public LexerRuleSet(IScanner in, ErrorHandler handler, LexerRule ... ruleSet) {
		super(in, handler);
	}

	@Override
	public Token consume() {
		Token result = lastMatch.consume();
		lastMatch = null;
		return result;
	}

	@Override
	public boolean match() {
		lastMatch = null;
		if (enabled) {
			for (LexerRule r : ruleSet) {
				if (r.match()) {
					lastMatch = r;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void skip() {
		lastMatch.skip();
		lastMatch = null;
	}

	

}
