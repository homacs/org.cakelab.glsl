package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.THeaderPath;
import org.cakelab.glsl.pp.tokens.Token;

public class RHeaderPath extends LexerRule {
	public RHeaderPath(IScanner in, ErrorHandler handler) {
		super(in, handler);
	}

	@Override
	public Token analyse() {
		if (match()) {
			tokenStart();
			StringBuffer text = new StringBuffer();
			consumeChar();
			while(LA1() != '>' && LA1() != IScanner.EOF) {
				text.append(consumeChar());
			}
			if (LA1() == '>') {
				text.append(consumeChar());
			} else {
				syntaxError("missing '>' to end header path");
			}
			return createToken(text.toString());
		}
		return null;
	}

	public boolean match() {
		return LA1() == '<';
	}

	@Override
	protected Token createToken(Interval interval, String text) {
		return new THeaderPath(interval, text);
	}


}
