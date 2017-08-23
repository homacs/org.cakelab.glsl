package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;

public class ROctDigits extends LexerRuleDigitSequence {
	// TODO: move to char seq rule
	public ROctDigits(IScanner in, ErrorHandler handler) {
		super(in, handler, "01234567");
	}

}
