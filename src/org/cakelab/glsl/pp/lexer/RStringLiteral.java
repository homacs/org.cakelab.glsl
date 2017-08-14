package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;

public class RStringLiteral extends LexerRuleCharSequence {

	public RStringLiteral(IScanner in, ErrorHandler handler) {
		super(in, handler, '"', '"');
	}

}
