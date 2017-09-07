package org.cakelab.glsl.pp.parser.pragmas;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Pragma;
import org.cakelab.glsl.pp.parser.Parser;
import org.cakelab.glsl.pp.tokens.Token;



/**
 * Pragma parser is supposed to interpret all preprocessing tokens
 * between <code>#pragma</code> and <code>CRLF</code> or <code>EOF</code> 
 * and create a result of type Pragma containing at least 
 * the processed tokens.
 * 
 * @author homac
 *
 */
public abstract class PragmaParser extends Parser {

	@SuppressWarnings("unused")
	private Preprocessor control;
	
	
	
	public PragmaParser(Preprocessor control) {
		super(control.getState());
	}
	

	public abstract Pragma getPragma();
	
	protected Interval interval(Token first, Token last) {
		return new Interval(first.getStart(), last.getEnd());
	}


	
}
