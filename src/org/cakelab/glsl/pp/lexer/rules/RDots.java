package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TDots;
import org.cakelab.glsl.pp.tokens.Token;

public class RDots extends LexerRuleEquals {
	
	public RDots(IScanner in, ErrorHandler handler) {
		super(in, handler, TDots.TEXT);
	}

	@Override
	protected Token createToken(Interval interval, String match) {
		return new TDots(interval);
	}

}
