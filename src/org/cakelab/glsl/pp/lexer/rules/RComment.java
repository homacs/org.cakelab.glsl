package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.lexer.Lookahead;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TComment;

public class RComment extends LexerRule {
	private static final String ML_START = "/*";
	private static final String SL_START = "//";
	private RLineContinuation line_continuation;
	public RComment(IScanner in, ErrorHandler handler) {
		super(in, handler);
		line_continuation = new RLineContinuation(in, handler);
	}
	
	@Override
	public Lookahead lookahead(int offset) {
		super.setLookaheadStart(offset);
		StringBuffer comment = null;
		if (LA_equals(ML_START)) {
			
			comment = new StringBuffer(ML_START);
			consume(ML_START.length());
			while (LA1() != IScanner.EOF && !LA_equals("*/")) {
				if (skip(line_continuation)) continue;
				else comment.append((char)consume());
			}
			if (LA1() == IScanner.EOF) {
				syntaxError("missing '*/' to end the comment");
			} else {
				consume(2);
				comment.append("*/");
			}
		} else if (LA_equals(SL_START)) {
			comment = new StringBuffer(SL_START);
			consume(SL_START.length());
			while (LA1() != IScanner.EOF && !LA_equals('\n')) {
				if (skip(line_continuation)) continue;
				else comment.append((char)consume());
			}
		} else {
			return null;
		}
		return createLookahead(new TComment(comment.toString()));
	}

}