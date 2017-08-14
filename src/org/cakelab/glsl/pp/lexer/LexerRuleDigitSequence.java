package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TNumber;
import org.cakelab.glsl.pp.tokens.Token;

public abstract class LexerRuleDigitSequence extends LexerRule {
	
	private char[] digits;

	public LexerRuleDigitSequence(IScanner in, ErrorHandler handler, char[] digits) {
		super(in, handler);
		this.digits = digits;
	}
	

	public LexerRuleDigitSequence(IScanner in, ErrorHandler handler, String digits) {
		this(in, handler, digits.toCharArray());
	}



	public int match(int max) {
		int l = 1;
		for (; l <= max && inSet(in.LA(l)); l++);
		return l-1;
	}

	protected boolean inSet(int c) {
		for (char d : digits) if (c == d) return true;
		return false;
	}

	@Override
	public Token consume() {
		StringBuffer number = new StringBuffer();
		Location start = in.nextLocation();
		while(inSet(in.LA1())) {
			number.append((char)in.consume());
		}
		return new TNumber(interval(start), number.toString());
	}

	@Override
	public boolean match() {
		int len = match(Integer.MAX_VALUE);
		return len > 0;
	}


	@Override
	public void skip() {
		consume();
	}
}