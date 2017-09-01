package org.cakelab.glsl.pp.lexer;


import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.error.ErrorHandling;
import org.cakelab.glsl.pp.lexer.rules.LexerRuleSet;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TEof;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

public class PPLexer extends ErrorHandling implements ILexer {

	private LexerRuleSet rules;
	protected TokenList prepended = new TokenList();
	private LookaheadList lookaheads = new LookaheadList();
	protected Token previous;


	public PPLexer(IScanner scanner, ErrorHandler errorHandler) {
		super(scanner, errorHandler);
	}
	
	@Override
	public void setRules(LexerRuleSet rules) {
		this.rules = rules;
	}
	
	@Override
	public Token lookahead(int n) {
		assert n > 0 : "n is supposed to be larger than 0";
		
		
		//
		// check if lookahead refers to prepended tokens
		//
		if (!prepended.isEmpty()) {
			if (n < prepended.size()) {
				return prepended.get(n-1);
			} else {
				n = n - prepended.size();
			}
		}
		
		
		//
		// Lookup lookahead from already lexed tokens
		// or lex more
		//
		assert rules != null;
		
		Token last = lookaheads.last();
		while (lookaheads.size() < n) {
			if (last instanceof TEof) break;
			last = rules.analyse();
			lookaheads.add(last);
		}
		
		if (lookaheads.size() >= n) {
			return lookaheads.get(n-1);
		} else {
			assert last instanceof TEof : "internal error: last was expected to be EOF";
			return last;
		}
	}

	@Override
	public Token consume(int n) {
		assert n > 0 : "n is supposed to be larger than 0";
		
		if (!prepended.isEmpty()) {
			if (n > prepended.size()) {
				n -= prepended.size();
				prepended.clear();
			} else {
				previous = prepended.get(n-1);
				prepended.removeFirst(n);
				return previous;
			}
		}

		
		if (n > lookaheads.size()) {
			// special case: consuming ahead without checking lookaheads.
			// FIXME: should be illegal
			n -= lookaheads.size();
			lookaheads.clear();
			while (n != 0) {
				if (previous instanceof TEof) break;
				previous = rules.analyse();
				n--;
			}
		} else {
			previous = lookaheads.get(n-1);
		}
		
		return previous;
	}


	@Override
	public boolean eof() {
		return previous instanceof TEof;
	}

	@Override
	public void dismiss() {
		in.dismiss();
		prepended.clear();
		lookaheads.clear();
	}

	public void prepend(TokenList prependingText) {
		prepended.addAll(0, prependingText);
	}

	@Override
	public Token previous() {
		return previous;
	}

	@Override
	public void setVirtualLocation(String sourceIdentifier, int line) {
		in.setVirtualLocation(sourceIdentifier, line);
	}

	@Override
	public void setVirtualLocation(int line) {
		in.setVirtualLocation(line);
	}
	
	
	
	
}
