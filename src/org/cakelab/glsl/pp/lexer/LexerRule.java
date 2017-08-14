package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.error.ErrorHandling;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.Token;

public abstract class LexerRule extends ErrorHandling {
	protected boolean enabled;
	protected boolean skip;
	protected IScanner in;
	
	public LexerRule(IScanner in, ErrorHandler handler) {
		super(in, handler);
		this.in = in;
		this.enabled = true;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public void setSkip(boolean skip) {
		this.enabled = skip;
	}

	public boolean isSkip() {
		return skip;
	}

	public boolean isEnabled() {
		return enabled;
	}
	
	public Token optional() {
		if (enabled && match()) {
			if (skip) {
				skip();
			} else {
				return consume();
			}
		}
		return null;
	}

	public abstract Token consume();

	public abstract boolean match();

	public abstract void skip();
	
	
	protected Interval interval(Location start) {
		return new Interval(start, in.location());
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


}
