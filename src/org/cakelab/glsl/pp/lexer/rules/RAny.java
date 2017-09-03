package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TAny;
import org.cakelab.glsl.pp.tokens.Token;

public class RAny extends LexerRule {

	public RAny(PPState state) {
		super(state);
	}

	@Override
	public Token analyse() {

		if (LA1() != IScanner.EOF) {
			tokenStart();
			char c = (char) consumeChar();
			return createToken(String.valueOf(c));
		} else {
			return null;
		}
	}

	@Override
	protected Token createToken(Interval interval, String text) {
		return new TAny(interval, text);
	}

}
