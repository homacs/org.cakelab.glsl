package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.Token;

public abstract class LexerRuleEquals extends LexerRule {
	private String[] options;
	
	public LexerRuleEquals(IScanner in, ErrorHandler handler, String[] options) {
		super(in, handler);
		this.options = options;
	}

	public LexerRuleEquals(IScanner in, ErrorHandler handler, String option) {
		super(in, handler);
		this.options = new String[]{option};
	}

	@Override
	public Token analyse() {
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
