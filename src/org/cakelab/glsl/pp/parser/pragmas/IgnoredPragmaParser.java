package org.cakelab.glsl.pp.parser.pragmas;

import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Pragma;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

/**
 * Parses all pragmas which were not recognised by any 
 * other pragma parser.
 * 
 * @author homac
 *
 */
public class IgnoredPragmaParser extends PragmaParser {

	@SuppressWarnings("unused")
	private Preprocessor control;
	private Pragma result;
	
	
	
	public IgnoredPragmaParser(Preprocessor control) {
		super(control);
	}
	
	@Override
	public boolean parse() {
		result = null;
		while(WHITESPACE());
		Token start = getLexer().lookahead(1);
		TokenList tokens = new TokenList();
		while((token = preprocessing_token(true)) != null) {
			tokens.add(token);
			while(WHITESPACE());
		}
		this.result = new Pragma(interval(start, getLexer().previous()), tokens);
		return true;
	}





	public Pragma getPragma() {
		return result;
	}
	

	
}
