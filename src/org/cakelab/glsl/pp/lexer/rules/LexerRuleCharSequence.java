package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.lexer.Lookahead;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TCharSequence;

public abstract class LexerRuleCharSequence extends LexerRule {

	private char startDelimiter;
	private char endDelimiter;

	public LexerRuleCharSequence(IScanner in, ErrorHandler handler, char startDelimiter, char endDelimiter) {
		super(in, handler);
		this.startDelimiter = startDelimiter;
		this.endDelimiter = endDelimiter;
	}

	@Override
	public Lookahead lookahead(int n) {
		super.setLookaheadStart(n);
		assert (LA1() == (startDelimiter));
		int c = consume();
		
		StringBuffer string = new StringBuffer();
		string.append((char)c);
		
		while(!(LA_equals(endDelimiter)||eof())) {
			if (LA1() != '\\') {
				// general case: anything not an escape sequence
					
				if (LA1() == '\n') {
					// it was a string, just terminator missing
					break;
				}
				string.append((char)consume());
			} else {
				// special case: escape sequence
				// just don't interpret next char as end delimiter
				string.append((char)consume());
				string.append((char)consume());
			}
		}
		if (!LA_equals(endDelimiter)) syntaxError("missing end delimiter '" + "' in char sequence (string)");
		string.append(endDelimiter);
		return createLookahead(new TCharSequence(string.toString()));
	}

}
