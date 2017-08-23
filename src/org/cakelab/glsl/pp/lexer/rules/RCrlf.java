package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TWhitespace;
import org.cakelab.glsl.pp.tokens.Token;

public class RCrlf extends LexerRuleEquals {
	
	public RCrlf(IScanner in, ErrorHandler handler) {
		super(in, handler, new String[]{"\n","\r\n"});
	}

	@Override
	protected Token createToken(Interval interval, String match) {
		return new TWhitespace(interval, match);
	}

}