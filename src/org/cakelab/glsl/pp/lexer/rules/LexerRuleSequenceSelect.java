package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.lexer.Lookahead;
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
	public Lookahead lookahead(int offset) {
		super.setLookaheadStart(offset);
		for (String s : set) {
			if (LA_equals(s)) {
				return createLookahead(createToken(s));
			}
		}
		return null;
	}

	protected abstract Token createToken(String s);



}
