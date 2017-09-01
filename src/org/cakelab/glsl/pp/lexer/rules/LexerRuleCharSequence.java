package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.Token;

public abstract class LexerRuleCharSequence extends LexerRule {

	private char startDelimiter;
	private char endDelimiter;

	public LexerRuleCharSequence(IScanner in, ErrorHandler handler, char startDelimiter, char endDelimiter) {
		super(in, handler);
		this.startDelimiter = startDelimiter;
		this.endDelimiter = endDelimiter;
	}

	@Override
	public Token analyse() {
		if (LA1() == (startDelimiter)) {
			tokenStart();
			int c = consumeChar();
			
			StringBuffer string = new StringBuffer();
			string.append(c);
			
			while(!(LA_equals(endDelimiter)||eof())) {
				if (LA1() != '\\') {
					// general case: anything not an escape sequence
						
					if (LA1() == '\n') {
						// it was a string, just terminator missing
						break;
					}
					string.append(consumeChar());
				} else {
					// special case: escape sequence
					// just don't interpret next char as end delimiter
					string.append(consumeChar());
					string.append(consumeChar());
				}
			}
			if (!LA_equals(endDelimiter)) syntaxError("missing end delimiter '" + "' in char sequence (string)");
			string.append(endDelimiter);
			return createToken(string.toString());
		} else {
			return null;
		}
	}

}
