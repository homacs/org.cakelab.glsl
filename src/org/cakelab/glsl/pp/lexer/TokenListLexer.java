package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.rules.LexerRuleSet;
import org.cakelab.glsl.pp.tokens.TEof;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

public class TokenListLexer extends PPLexer {

	private TEof EOF;
	
	
	public TokenListLexer(TokenList tokens, ErrorHandler errorHandler) {
		super(null, errorHandler);
		
		assert (tokens.size() > 0);
		
		prepended.addAll(tokens);
		Location end = prepended.get(prepended.size()-1).getEnd().clone();
		end.setColumn(end.getColumn()+1);
		
		this.EOF = new TEof(new Interval(end, end));
	}

	@Override
	public void setRules(LexerRuleSet rules) {
		throw new Error("internal error: not supported");
	}

	@Override
	public Token lookahead(int n) {
		if (n <= prepended.size()) {
			return prepended.get(n-1);
		} else {
			return EOF;
		}
	}

	@Override
	public Token consume(int n) {
		if (n > prepended.size()) {
			prepended.clear();
			previous = EOF;
		} else {
			previous = prepended.get(n-1);
			prepended.removeFirst(n);
		}
		return previous;
	}


	@Override
	public void setVirtualLocation(String sourceIdentifier, int line) {
		throw new Error("internal error: not supported");
	}

	@Override
	public void setVirtualLocation(int line) {
		throw new Error("internal error: not supported");
	}

	@Override
	public void dismiss() {
		prepended.clear();
	}

	
	

}
