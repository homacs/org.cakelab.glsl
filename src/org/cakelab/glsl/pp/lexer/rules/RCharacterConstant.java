package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.ErrorHandlingStrategy;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TCharacterConstant;
import org.cakelab.glsl.pp.tokens.Token;

public class RCharacterConstant extends LexerRuleCharSequence {

	public RCharacterConstant(IScanner in, ErrorHandlingStrategy handler) {
		super(in, handler, '\'', '\'');
	}

	@Override
	protected Token createToken(Interval interval, String text) {
		return new TCharacterConstant(interval, text);
	}

}
