package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.error.ErrorHandling;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.Token;

public abstract class LexerRule extends ErrorHandling {
	private IScanner in;
	protected int offset;
	private int start;
	
	
	
	public LexerRule(IScanner in, ErrorHandler handler) {
		super(in, handler);
		this.in = in;
	}
	
	protected void setLookaheadStart(int offset) {
		this.offset = offset;
		this.start = offset;
	}
	
	protected Lookahead createLookahead(Token t) {
		Lookahead l = new Lookahead(this, start, offset-start, t);
		return l;
	}
	
	public abstract Lookahead lookahead(int offset);
	
	
	protected boolean eof() {
		return LA(offset) == IScanner.EOF;
	}

	protected int LA(int i) {
		return in.lookahead(i+offset);
	}
	
	protected int LA1() {
		return in.lookahead(1+offset);
	}
	

	protected boolean LA_equals(int n, String s) {
		return in.LA_equals(n+offset, s);
	}

	protected boolean LA_equals(String s) {
		return in.LA_equals(offset, s);
	}

	protected boolean LA_equals(int n, char c) {
		return in.LA_equals(n+offset, c);
	}
	
	protected boolean LA_equals(char c) {
		return in.LA_equals(offset, c);
	}

	protected char consume(int n) {
		int result = LA(n);
		assert result != IScanner.EOF;
		offset += n;
		return (char)result;
	}
	
	/** Does not call consume on scanner. Advances internal lookahead position of this rule only. */
	protected char consume() {
		int result = LA1();
		assert result != IScanner.EOF;
		offset += 1;
		return (char)result;
	}
	
	protected boolean skip(LexerRule rule) {
		Lookahead l = rule.lookahead(offset);
		if (l != null) {
			consume(l.length());
			return true;
		} else {
			return false;
		}
	}

	
	protected boolean isEndl(int c) {
		return c == '\n' || c == IScanner.EOF;
	}

	protected boolean isDigit(int c) {
		if (c == IScanner.EOF) return false;
		return '0' <= c && c <= '9';
	}

	protected boolean isAlpha(int c) {
		if (c == IScanner.EOF) return false;
		return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
	}
	
	protected boolean isWhite(int c) {
		if (c == IScanner.EOF) return false;
		else return c == ' ' || c == '\t' || c == '\r';
	}

	protected boolean inSet(int c, char[] set) {
		for (char d : set) if (c == d) return true;
		return false;
	}
	
	protected boolean isHexDigit(int c) {
		return isDigit(c) || ('a' < c && c < 'g') || ('A' < c && c < 'G');
	}
	
}
