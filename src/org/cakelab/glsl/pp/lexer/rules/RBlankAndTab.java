package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.tokens.TWhitespace;
import org.cakelab.glsl.pp.tokens.Token;

public class RBlankAndTab extends LexerRuleEquals {
	char[] set = new char[]{'\t', ' '};
	
	public RBlankAndTab(PPState state) {
		super(state, new String[]{"\t", " "});
	}

	@Override
	protected Token createToken(Interval interval, String text) {
		return new TWhitespace(interval, text);
	}
	
}