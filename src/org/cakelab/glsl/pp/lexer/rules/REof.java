package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TEof;
import org.cakelab.glsl.pp.tokens.Token;

public class REof extends LexerRule {
	
	public REof(IScanner in, ErrorHandler handler) {
		super(in, handler);
	}

	@Override
	public Token analyse() {
		if (LA1() == IScanner.EOF) {
			tokenStart();
			consume(1);
			return createToken(null);
		}
		return null;
	}

	@Override
	protected Token createToken(Interval interval, String text) {
		return new TEof(interval);
	}


}