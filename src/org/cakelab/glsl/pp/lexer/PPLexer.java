package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.error.ErrorHandling;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.Token;

public class PPLexer extends ErrorHandling {
	private LexerRule[] rules;
	private RCrlf crlf;
	private LexerRuleSet whitespace;
	private REof eof;
	private REndl endl;
	private RHeaderPath headerpath;

	protected Token token = null;
	private RHash hashes;
	private RHashHash hashhashes;
	

	public PPLexer(IScanner in, ErrorHandler handler) {
		super(in, handler);
		
		whitespace = new LexerRuleSet(in, handler, new RWhitespace(in, handler), new RComment(in, handler));
		crlf = new RCrlf(in, handler);
		eof = new REof(in, handler);
		endl = new REndl(in, handler, crlf, eof);
		headerpath = new RHeaderPath(in, handler);
		hashhashes = new RHashHash(in, handler);
		hashes = new RHash(in, handler);
		
		rules = new LexerRule[] {
				new RLineContinuation(in, handler),
				whitespace,
				endl,
				crlf,
				eof,
				new RStringLiteral(in, handler),
				new RCharacterConstant(in, handler),
				headerpath,
				new RPunctuator(in, handler, hashhashes, hashes),
				new RIdentifier(in, handler),
				new RAny(in, handler)
		};
	}
	
	public void skipWhitespace(boolean enableSkipping) {
		whitespace.setSkip(enableSkipping);
	}
	
	public void skipCrlf(boolean enableSkipping) {
		crlf.setSkip(enableSkipping);
	}
	
	public void skipEndl(boolean enableSkipping) {
		endl.setSkip(enableSkipping);
	}
	
	public Token next() {
		Token result = null;
		for (LexerRule r : rules) {
			if (r.match()) {
				if (r.isSkip()) {
					r.skip();
				} else {
					result = r.consume();
					break;
				}
			}
		}
		return result;
	}
	
	
	
}
