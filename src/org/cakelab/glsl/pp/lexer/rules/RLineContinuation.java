package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.ErrorHandlingStrategy;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TLineContinuation;
import org.cakelab.glsl.pp.tokens.Token;

public class RLineContinuation extends LexerRuleEquals {
	
	public RLineContinuation(IScanner in, ErrorHandlingStrategy handler) {
		super(in, handler, TLineContinuation.TEXT_OPTIONS);
	}

	@Override
	protected Token createToken(Interval interval, String match) {
		return new TLineContinuation(interval, match);
	}

	
	


}
