package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.tokens.TLineContinuation;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.Token;

public class RLineContinuation extends LexerRuleEquals {
	
	public RLineContinuation(IScanner in, ErrorHandler handler) {
		super(in, handler, new String[] { "\\\r\n", "\\\n"});
	}

	@Override
	protected Token createToken(Interval interval, String match) {
		return new TLineContinuation(interval, match);
	}



}
