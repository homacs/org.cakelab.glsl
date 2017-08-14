package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;

public class REndl extends LexerRuleSet {
	
	public REndl(IScanner in, ErrorHandler handler, RCrlf crlf, REof eof) {
		super(in, handler, crlf, eof);
	}


}