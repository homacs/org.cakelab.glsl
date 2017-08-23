package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Location;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.Token;

public abstract class LexerRuleEquals extends LexerRule {
	private String[] options;
	private String lastMatch = null;
	
	public LexerRuleEquals(IScanner in, ErrorHandler handler, String[] options) {
		super(in, handler);
		this.options = options;
	}

	@Override
	public Token consume() {
		Location start = in.nextLocation();
		in.consume(lastMatch.length());
		Token token = createToken(new Interval(start, in.location()), lastMatch);
		lastMatch = null;
		return token;
	}

	protected abstract Token createToken(Interval interval, String match);

	@Override
	public boolean match() {
		for (String o : options) {
			if (in.LA_equals(o)) {
				lastMatch = o;
				return true;
			}
		}
		return false;
	}

	@Override
	public void skip() {
		assert(lastMatch != null);
		in.consume(lastMatch.length());
		lastMatch = null;
	}


}
