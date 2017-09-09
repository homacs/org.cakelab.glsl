package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.lexer.LexerRule;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TComment;
import org.cakelab.glsl.pp.tokens.Token;

public class RComment extends LexerRule {
	private static final String ML_START = "/*";
	private static final String SL_START = "//";
	private RLineContinuation line_continuation;
	public RComment(PPState state) {
		super(state);
		line_continuation = new RLineContinuation(state);
	}
	
	@Override
	public Token analyse() {
		StringBuffer comment = null;
		IScanner scanner = getScanner();
		if (LA_equals(ML_START)) {
			tokenStart();
			comment = new StringBuffer(ML_START);
			consume(ML_START.length());
			while (LA1() != IScanner.EOF && !LA_equals("*/")) {
				if (line_continuation.analyse(scanner) != null) continue;
				else comment.append((char)consumeChar());
			}
			if (LA1() == IScanner.EOF) {
				syntaxError("missing '*/' to end the comment");
			} else {
				consume(2);
				comment.append("*/");
			}
		} else if (LA_equals(SL_START)) {
			tokenStart();
			comment = new StringBuffer(SL_START);
			consume(SL_START.length());
			while (LA1() != IScanner.EOF && !LA_equals('\n')) {
				if (line_continuation.analyse(scanner) != null) continue;
				else comment.append((char)consumeChar());
			}
		} else {
			return null;
		}
		return createToken(comment.toString());
	}

	@Override
	protected Token createToken(Interval interval, String text) {
		return new TComment(interval, text);
	}


}