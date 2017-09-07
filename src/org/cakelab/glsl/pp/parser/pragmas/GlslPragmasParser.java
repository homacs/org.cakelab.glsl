package org.cakelab.glsl.pp.parser.pragmas;

import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.GLSLPragma;
import org.cakelab.glsl.pp.ast.Pragma;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.tokens.TIdentifier;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

/**
 * Parses all pragmas which were not recognised by any 
 * other pragma parser.
 * 
 * @author homac
 *
 */
public class GlslPragmasParser extends PragmaParser {

	@SuppressWarnings("unused")
	private Preprocessor control;
	private Pragma result;
	
	
	
	public GlslPragmasParser(Preprocessor control) {
		super(control);
	}
	
	@Override
	public boolean parse() throws Recovery {
		result = null;
		boolean success = false;
		
		Token start = getLexer().lookahead(1);
		TokenList tokens = new TokenList();
		if (IDENTIFIER("STDGL")) {
			success = true;
			tokens.add(token);
		} else if (IDENTIFIER("optimize") || IDENTIFIER("debug")) {
			success = true;
			tokens.add(token);
			while(WHITESPACE());
			parse_option_parameters((TIdentifier) token, tokens);
		}

		if (success) {
			//
			// to keep future compatibility we accept any (unexpected) trailing tokens as well
			//
			while(WHITESPACE())
			while(null != (token = preprocessing_token(true))) {
				tokens.add(token);
				while(WHITESPACE());
			}
		
			result = new GLSLPragma(interval(start, getLexer().previous()), tokens);
		}
		return success;
	}





	private void parse_option_parameters(TIdentifier name, TokenList tokens) throws Recovery {
		if (PUNCTUATOR('(')) {
			tokens.add(token);
			while(WHITESPACE());
			if (IDENTIFIER("on") || IDENTIFIER("off")) {
				tokens.add(token);
			} else {
				syntaxError(getLexer().lookahead(1), "unknown parameter " + getLexer().lookahead(1).getText() + " to pragma " + name.getText());
			}
			while(WHITESPACE());
			mandatory(TPunctuator.class, ")");
		} else {
			syntaxError(name, "missing parameter to pragma " + name.getText());
		}
	}

	public Pragma getPragma() {
		return result;
	}
	

	
}
