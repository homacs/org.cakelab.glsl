package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TCharSequence;
import org.cakelab.glsl.pp.tokens.Token;

public abstract class LexerRuleCharSequence extends LexerRule {

	private char startDelimiter;
	private char endDelimiter;
	private RLineContinuation line_continuation;
	private RHexDigits hexdigits;
	private ROctDigits octdigits;

	public LexerRuleCharSequence(IScanner in, ErrorHandler handler, char startDelimiter, char endDelimiter) {
		super(in, handler);
		this.startDelimiter = startDelimiter;
		this.endDelimiter = endDelimiter;
		this.line_continuation = new RLineContinuation(in, handler);
		line_continuation.setSkip(true);
		this.hexdigits = new RHexDigits(in, handler);
	}

	@Override
	public Token consume() {
		Location start = in.nextLocation();
		assert (in.LA1() == (startDelimiter));
		int c = in.consume();
		
		StringBuffer string = new StringBuffer();
		string.append((char)c);
		
		while(!(in.LA_equals(endDelimiter)||in.eof())) {
			if (in.LA1() != '\\') {
				// general case: anything not an escape sequence
					
				if (in.LA1() == '\n') {
					syntaxError("missing terminating " + endDelimiter);
					// it was a string, just terminator missing
					break;
				}
				string.append((char)in.consume());
			} else if (line_continuation.match()) {
				line_continuation.skip();
			} else {
				// special case: escape sequence
				// we do not fully interpret escape sequences here
				// just tracking whether there is a proper number of characters following the '\'

				string.append((char)in.consume());
				c = in.LA1();
				switch(c) {
				case 'u': 
				case 'x':
				{
					string.append((char)in.consume());
					int i = hexdigits.match(4);
					if (i>0) {
						in.consume_to_buffer(i, string);
					} else {
						syntaxError("missing digits to unicode escape sequence");
					}
					break;
				}
				default:
					int i = octdigits.match(3);
					if (i>0) {
						in.consume_to_buffer(i, string);
					} else {
						// any other escape sequence (or non-escape sequence)
						string.append((char)in.consume());
					}
				}
			}
		}
		if (!in.LA_equals(endDelimiter)) syntaxError("missing end delimiter '" + "' in char sequence (string)");
		string.append(endDelimiter);
		return new TCharSequence(interval(start), string.toString());
	}

	@Override
	public boolean match() {
		return (in.LA1() == startDelimiter);
	}

	@Override
	public void skip() {
		consume();
	}

}
