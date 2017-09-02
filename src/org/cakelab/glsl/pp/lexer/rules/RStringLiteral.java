package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.ErrorHandlingStrategy;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TStringLiteral;
import org.cakelab.glsl.pp.tokens.Token;

public class RStringLiteral extends LexerRuleCharSequence {

	public RStringLiteral(IScanner in, ErrorHandlingStrategy handler) {
		super(in, handler, '"', '"');
	}

	@Override
	protected Token createToken(Interval interval, String text) {
		return new TStringLiteral(interval, text);
	}

}
