package org.cakelab.glsl.pp.lexer;


import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.PPHelper;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.error.ErrorRecoveryHandler;
import org.cakelab.glsl.pp.error.StandardErrorHandler;
import org.cakelab.glsl.pp.lexer.rules.LexerRuleSet;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TEof;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

public class PPLexer extends PPHelper implements ILexer, ErrorRecoveryHandler {

	
	private LexerRuleSet rules;
	protected TokenList prepended = new TokenList();
	private TokenList lookaheads = new TokenList();
	protected Token previous;
	private IScanner in;


	public PPLexer(IScanner scanner, PPState state) {
		super(state);
		this.in = scanner;
		this.rules = new PPGLSLRuleSet(state);
	}
	

	public PPLexer(IScanner scanner) {
		this(scanner, new PPState(new StandardErrorHandler(), null));
		getState().setErrorRecoveryHandler(this);
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
			if (n <= prepended.size()) {
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
			last = rules.analyse(in);
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
		assert (!eof());
		if (!prepended.isEmpty()) {
			if (n > prepended.size()) {
				n -= prepended.size();
				prepended.clear();
				// fall through to lookahead list below
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
				previous = rules.analyse(in);
				n--;
			}
		} else {
			previous = lookaheads.get(n-1);
			lookaheads.removeFirst(n);
		}
		
		return previous;
	}


	@Override
	public boolean eof() {
		return previous instanceof TEof;
	}

	@Override
	public void dismiss() {
		Location l = in.location();
		TEof eofTok = new TEof(new Interval(l,l));
		in.dismiss();
		prepended.clear();
		lookaheads.clear();
		prepended.add(eofTok);
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


	@Override
	public LexerRuleSet getRules() {
		return rules;
	}


	public IScanner getScanner() {
		return in;
	}


	@Override
	public void recoverError() {
		// does no recovery
	}


	@Override
	public void recoverWarning() {
		// does no recovery
	}
	
	
	
}
