package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TLineContinuation;
import org.cakelab.glsl.pp.tokens.Token;

public class RLineContinuation extends LexerRuleEquals {
	
	public RLineContinuation(IScanner in, ErrorHandler handler) {
		super(in, handler, new String[] { "\\\r\n", "\\\n"});
	}

	@Override
	protected Token createToken(String match) {
		return new TLineContinuation(match);
	}

	
	


}
