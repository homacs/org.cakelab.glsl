package org.cakelab.glsl.pp.lexer;


import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.error.ErrorHandling;
import org.cakelab.glsl.pp.lexer.rules.LexerRuleSet;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TEof;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

public class PullLexer extends ErrorHandling {

	private LexerRuleSet rules;
	private TokenList prepended = new TokenList();
	private LookaheadList lookaheads = new LookaheadList();
	private Token previous;


	public PullLexer(IScanner scanner, ErrorHandler errorHandler) {
		super(scanner, errorHandler);
	}
	
	
	public Token lookahead(int n) {
		
		if (!prepended.isEmpty()) {
			if (n < prepended.size()) {
				return prepended.get(n-1);
			} else {
				n = n - prepended.size();
			}
		}
		
		
		
		Lookahead last = lookaheads.last();
		while (lookaheads.size() < n) {
			if (last.token instanceof TEof) break;
			last = rules.lookahead(last.offset + last.length);
			lookaheads.add(last);
		}
		
		if (lookaheads.size() >= n) {
			return lookaheads.get(n-1).token;
		}
		return null;
	}

	public Token consume(int n) {
		if (!prepended.isEmpty()) {
			if (n > prepended.size()) {
				n -= prepended.size();
				prepended.clear();
			} else {
				previous = prepended.get(prepended.size()-1);
				prepended.removeFirst(n);
				return previous;
			}
		}
		
		while (n != 0 && lookaheads.size() > 0) {
			Lookahead l = lookaheads.popFront();
			previous = consume(l);
			n--;
		}
		return previous;
	}


	private Token consume(Lookahead l) {
		previous = l.token;
		
		Location start = in.nextLocation();
		in.consume(l.length());
		previous.setInterval(new Interval(start, in.location()));
		
		return previous;
	}
	
	
	
	
}
