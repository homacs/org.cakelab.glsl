package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TIdentifier;
import org.cakelab.glsl.pp.tokens.Token;

public class RIdentifier extends LexerRule {
	
	public RIdentifier(PPState state) {
		super(state);
	}
	
	@Override
	public Token analyse() {
		if (match()) {
			tokenStart();
			StringBuffer identifier = new StringBuffer();
			int c = LA1();
			do {
				identifier.append(consumeChar());
				c = LA1();
			} while(LA1() != IScanner.EOF && (isAlpha(c)||isDigit(c)||c == '_'));
			return createToken(identifier.toString());
		} else {
			return null;
		}
	}

	public boolean match() {
		int c = LA1();
		return (isAlpha(c) || c == '_');
	}

	@Override
	protected Token createToken(Interval interval, String text) {
		return new TIdentifier(interval, text);
	}
}