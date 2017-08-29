package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TWhitespace;
import org.cakelab.glsl.pp.tokens.Token;

public class RBlankAndTab extends LexerRuleSequenceSelect {
	char[] set = new char[]{'\t', ' '};
	
	public RBlankAndTab(IScanner in, ErrorHandler handler) {
		super(in, handler, new String[]{"\t", " "});
	}

	@Override
	protected Token createToken(String text) {
		return new TWhitespace(text);
	}
	
}