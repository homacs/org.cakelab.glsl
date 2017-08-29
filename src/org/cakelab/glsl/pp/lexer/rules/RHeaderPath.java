package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.lexer.Lookahead;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.THeaderPath;

public class RHeaderPath extends LexerRule {
	public RHeaderPath(IScanner in, ErrorHandler handler) {
		super(in, handler);
	}

	@Override
	public Lookahead lookahead(int offset) {
		super.setLookaheadStart(offset);

		if (match()) {
			StringBuffer text = new StringBuffer();
			consume();
			while(LA1() != '>' && LA1() != IScanner.EOF) {
				text.append(consume());
			}
			if (LA1() == '>') {
				text.append(consume());
			} else {
				syntaxError("missing '>' to end header path");
			}
			return createLookahead(new THeaderPath(text.toString()));
		}
		return null;
	}

	public boolean match() {
		return LA1() == '<';
	}


}
