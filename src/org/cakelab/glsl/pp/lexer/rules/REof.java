package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.lexer.Lookahead;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TEof;

public class REof extends LexerRule {
	
	public REof(IScanner in, ErrorHandler handler) {
		super(in, handler);
	}

	@Override
	public Lookahead lookahead(int offset) {
		super.setLookaheadStart(offset);
		if (LA1() == IScanner.EOF) {
			consume();
			return createLookahead(new TEof());
		}
		return null;
	}


}