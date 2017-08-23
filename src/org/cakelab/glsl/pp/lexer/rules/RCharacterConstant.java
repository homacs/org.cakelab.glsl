package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;

public class RCharacterConstant extends LexerRuleCharSequence {

	public RCharacterConstant(IScanner in, ErrorHandler handler) {
		super(in, handler, '\'', '\'');
	}

}
