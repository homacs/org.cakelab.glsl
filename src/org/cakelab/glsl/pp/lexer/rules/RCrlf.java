package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.ErrorHandlingStrategy;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TCrlf;
import org.cakelab.glsl.pp.tokens.Token;

public class RCrlf extends LexerRuleEquals {
	
	public RCrlf(IScanner in, ErrorHandlingStrategy handler) {
		super(in, handler, TCrlf.TEXT_OPTIONS);
	}

	@Override
	protected Token createToken(Interval interval, String match) {
		return new TCrlf(interval, match);
	}

}