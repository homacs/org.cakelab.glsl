package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.Token;

public abstract class LexerRuleSequenceSelect extends LexerRule {
	
	private String[] set;
	protected String lastMatch;

	public LexerRuleSequenceSelect(IScanner in, ErrorHandler handler, String[] set) {
		super(in, handler);
		this.set = set;
	}

	@Override
	public Token analyse() {
		for (String s : set) {
			if (LA_equals(s)) {
				tokenStart();
				return createToken(s);
			}
		}
		return null;
	}



}
