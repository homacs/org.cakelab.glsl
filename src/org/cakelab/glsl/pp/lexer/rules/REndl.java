package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TEndl;
import org.cakelab.glsl.pp.tokens.Token;

public class REndl extends LexerRuleSet {
	
	public REndl(IScanner in, ErrorHandler handler, RCrlf crlf, REof eof) {
		super(in, handler, crlf, eof);
	}

	@Override
	public Token analyse() {
		Token t = super.analyse();
		return new TEndl(t.getInterval(), t.getText());
	}


}