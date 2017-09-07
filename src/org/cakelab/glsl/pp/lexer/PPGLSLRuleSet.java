package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.PPState;
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
import org.cakelab.glsl.pp.lexer.rules.RUnknownToken;

public class PPGLSLRuleSet extends LexerRuleSet {

	public PPGLSLRuleSet(PPState state) {
		super(state, 
				new RLineContinuation(state),
				new RCrlf(state),
				
				new RHashHash(state),
				new RHash(state),
				
				new REof(state),
				
				new RBlankAndTab(state),
				new RComment(state),
				
				new RIdentifier(state),
				new RNumber(state),
				new RCharacterConstant(state),
				new RStringLiteral(state),
				new RPunctuator(state),
				
				new RUnknownToken(state) // this accepts all tokens, not recognised by the above rules
		);
	}


}
