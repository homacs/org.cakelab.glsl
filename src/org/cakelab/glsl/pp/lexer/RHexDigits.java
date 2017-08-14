package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;

public class RHexDigits extends LexerRuleDigitSequence {
	// TODO: move to char seq rule

	public RHexDigits(IScanner in, ErrorHandler handler) {
		super(in, handler, "0123456789abcdefABCDEF");
	}

}
