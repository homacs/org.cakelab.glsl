package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.lexer.Lookahead;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TAny;

public class RAny extends LexerRule {

	public RAny(IScanner in, ErrorHandler handler) {
		super(in, handler);
	}

	@Override
	public Lookahead lookahead(int offset) {
		super.setLookaheadStart(offset);

		if (!eof()) {
			char c = (char) consume();
			return createLookahead(new TAny(String.valueOf(c)));
		} else {
			return null;
		}
	}

}
