package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.PPHelper;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.Token;

public abstract class LexerRule extends PPHelper {
	private IScanner in;
	private Location start;
	
	public LexerRule(PPState state) {
		super(state);
	}
	
	
	public final Token analyse(IScanner in) {
		this.in = in;
		return analyse();
	}
	
	protected abstract Token analyse();
	
	protected IScanner getScanner() {
		return in;
	}

	protected void syntaxError(String message) {
		try {
			super.syntaxError(in.location(), message);
		} catch (Recovery e) {
			throw new Error("internal error: lexer is not supposed to receive recovery exceptions");
		}
	}

	
	protected Location tokenStart() {
		return this.start = in.nextLocation();
	}
	
	protected Interval interval(Location start) {
		return new Interval(start, in.location());
	}
	
	protected final Token createToken(String text) {
		return createToken(interval(start), text);
	}
	
	protected abstract Token createToken(Interval interval, String text);

	protected int LA(int i) {
		return in.lookahead(i);
	}
	
	protected int LA1() {
		return in.lookahead(1);
	}
	

	protected boolean LA_equals(int n, String s) {
		return in.LA_equals(n, s);
	}

	protected boolean LA_equals(String s) {
		return in.LA_equals(s);
	}

	protected boolean LA_equals(int n, char c) {
		return in.LA_equals(n, c);
	}
	
	protected boolean LA_equals(char c) {
		return in.LA_equals(c);
	}

	
	/**
	 * checks whether the EOF token has been read already.
	 * @return
	 */
	protected boolean eof() {
		return in.eof();
	}
	
	protected void consume(int n) {
		in.consume(n);
	}
	
	/** Does not call consume on scanner. Advances internal lookahead position of this rule only. */
	protected char consumeChar() {
		int result = LA1();
		assert result != IScanner.EOF;
		in.consume();
		return (char)result;
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
