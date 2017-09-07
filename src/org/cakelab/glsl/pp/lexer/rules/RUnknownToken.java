package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TUnknownToken;
import org.cakelab.glsl.pp.tokens.Token;

public class RUnknownToken extends LexerRule {

	public RUnknownToken(PPState state) {
		super(state);
	}

	@Override
	public Token analyse() {
		int item = LA1();
		if (item != IScanner.EOF) {
			tokenStart();
			
			String text;
			try {
				text = String.valueOf((char)item);
			} catch (Throwable e) {
				// cannot be represented in the current character set
				text = "";
			}
			
			TUnknownToken token = (TUnknownToken) createToken(text);
			try {
				syntaxError(token, "illegal token '" + token.getText() + "' (int: " + item + ")");
			} catch (Recovery ignore) {
			}
			return token;
		} else {
			return null;
		}
	}

	@Override
	protected Token createToken(Interval interval, String text) {
		return new TUnknownToken(interval, text);
	}

}
