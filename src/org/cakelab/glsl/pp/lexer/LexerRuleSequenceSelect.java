package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;

public abstract class LexerRuleSequenceSelect extends LexerRule {
	
	private String[] set;
	protected String lastMatch;

	public LexerRuleSequenceSelect(IScanner in, ErrorHandler handler, String[] set) {
		super(in, handler);
		this.set = set;
	}

	@Override
	public boolean match() {
		for (String s : set) {
			if (in.LA_equals(s)) {
				lastMatch = s;
				return true;
			}
		}
		return false;
	}

	@Override
	public void skip() {
		in.consume(lastMatch.length());
	}


}
