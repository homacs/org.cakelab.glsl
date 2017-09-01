package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.THash;
import org.cakelab.glsl.pp.tokens.Token;

public class RHash extends LexerRuleEquals {

	public RHash(IScanner in, ErrorHandler handler) {
		super(in, handler, "#");
	}

	@Override
	protected Token createToken(Interval interval, String match) {
		return new THash(interval, match);
	}


}
