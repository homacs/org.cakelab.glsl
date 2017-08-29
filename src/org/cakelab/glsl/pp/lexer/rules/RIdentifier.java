package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.lexer.Lookahead;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TIdentifier;

public class RIdentifier extends LexerRule {
	
	public RIdentifier(IScanner in, ErrorHandler handler) {
		super(in, handler);
	}
	
	@Override
	public Lookahead lookahead(int offset) {
		super.setLookaheadStart(offset);
		if (match()) {
			StringBuffer identifier = new StringBuffer();
			int c = LA1();
			do {
				identifier.append(consume());
				c = LA1();
			} while(LA1() != IScanner.EOF && (isAlpha(c)||isDigit(c)||c == '_'));
			return createLookahead(new TIdentifier(identifier.toString()));
		} else {
			return null;
		}
	}

	public boolean match() {
		int c = LA1();
		return (isAlpha(c) || c == '_');
	}
}