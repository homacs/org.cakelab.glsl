package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.rules.*;
import org.cakelab.glsl.pp.scanner.IScanner;

public class PPGLSLRuleSet extends LexerRuleSet {

	public PPGLSLRuleSet(IScanner scanner, ErrorHandler handler) {
		super(scanner, handler, 
				new RLineContinuation(scanner, handler),
				new RCrlf(scanner, handler),
				
				new RHashHash(scanner, handler),
				new RHash(scanner, handler),
				
				new REof(scanner, handler),
				
				new RBlankAndTab(scanner, handler),
				new RComment(scanner, handler),
				
				new RIdentifier(scanner, handler),
				new RNumber(scanner, handler),
				new RCharacterConstant(scanner, handler),
				new RStringLiteral(scanner, handler),
				new RPunctuator(scanner, handler)
		);
	}


}
