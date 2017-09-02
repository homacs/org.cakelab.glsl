package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.error.ErrorHandlingStrategy;
import org.cakelab.glsl.pp.lexer.rules.LexerRuleSet;
import org.cakelab.glsl.pp.lexer.rules.RBlankAndTab;
import org.cakelab.glsl.pp.lexer.rules.RCharacterConstant;
import org.cakelab.glsl.pp.lexer.rules.RComment;
import org.cakelab.glsl.pp.lexer.rules.RCrlf;
import org.cakelab.glsl.pp.lexer.rules.REof;
import org.cakelab.glsl.pp.lexer.rules.RHash;
import org.cakelab.glsl.pp.lexer.rules.RHashHash;
import org.cakelab.glsl.pp.lexer.rules.RIdentifier;
import org.cakelab.glsl.pp.lexer.rules.RLineContinuation;
import org.cakelab.glsl.pp.lexer.rules.RNumber;
import org.cakelab.glsl.pp.lexer.rules.RPunctuator;
import org.cakelab.glsl.pp.lexer.rules.RStringLiteral;
import org.cakelab.glsl.pp.scanner.IScanner;

public class PPGLSLRuleSet extends LexerRuleSet {

	public PPGLSLRuleSet(IScanner scanner, ErrorHandlingStrategy errorStrategy) {
		super(scanner, errorStrategy, 
				new RLineContinuation(scanner, errorStrategy),
				new RCrlf(scanner, errorStrategy),
				
				new RHashHash(scanner, errorStrategy),
				new RHash(scanner, errorStrategy),
				
				new REof(scanner, errorStrategy),
				
				new RBlankAndTab(scanner, errorStrategy),
				new RComment(scanner, errorStrategy),
				
				new RIdentifier(scanner, errorStrategy),
				new RNumber(scanner, errorStrategy),
				new RCharacterConstant(scanner, errorStrategy),
				new RStringLiteral(scanner, errorStrategy),
				new RPunctuator(scanner, errorStrategy)
		);
	}


}
