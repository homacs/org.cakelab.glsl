package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TComment;
import org.cakelab.glsl.pp.tokens.Token;

public class RComment extends LexerRule {
	private RLineContinuation line_continuation;
	private static final String ML_START = "/*";
	private static final String SL_START = "//";
	
	public RComment(IScanner in, ErrorHandler handler) {
		super(in, handler);
		line_continuation = new RLineContinuation(in, handler);
		line_continuation.setSkip(true);
	}
	
	@Override
	public Token consume() {
		StringBuffer comment = null;
		Location start = in.nextLocation();
		if (in.LA_equals(ML_START)) {
			
			comment = new StringBuffer(ML_START);
			in.consume(ML_START.length());
			while (in.LA1() != IScanner.EOF && !in.LA_equals("*/")) {
				if (line_continuation.match()) line_continuation.skip();
				else comment.append((char)in.consume());
			}
			if (in.LA1() == IScanner.EOF) {
				syntaxError("missing '*/' to end the comment");
			} else {
				in.consume(2);
				comment.append("*/");
			}
		} else if (in.LA_equals(SL_START)) {
			comment = new StringBuffer(SL_START);
			in.consume(SL_START.length());
			while (in.LA1() != IScanner.EOF && !in.LA_equals('\n')) {
				if (line_continuation.match()) line_continuation.skip();
				else comment.append((char)in.consume());
			}
		} else {
			return null;
		}
		return new TComment(interval(start), comment.toString());
	}

	@Override
	public boolean match() {
		return (in.LA_equals(ML_START)) || (in.LA_equals(SL_START));
	}

	@Override
	public void skip() {
		consume();
	}
}