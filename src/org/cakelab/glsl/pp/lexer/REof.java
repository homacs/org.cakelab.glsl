package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TEof;
import org.cakelab.glsl.pp.tokens.Token;

public class REof extends LexerRule {
	
	public REof(IScanner in, ErrorHandler handler) {
		super(in, handler);
	}

	@Override
	public Token consume() {
		
		in.consume();
		return new TEof(interval(in.location()));
	}

	@Override
	public boolean match() {
		return in.LA1() == IScanner.EOF;
	}

	@Override
	public void skip() {
		in.consume();
	}


}