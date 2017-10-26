package org.cakelab.glsl.pp.parser;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.tokens.TNumber;

public class LineParser extends Parser {

	// TODO support GL_ARB_shading_language_include properly, #line parser has to change
	//      accept header path (StringLiteral) as source identifier.
 
	
	
	@SuppressWarnings("unused")
	private Preprocessor control;
	
	
	
	public LineParser(Preprocessor control) {
		super(control.getState());
	}
	
	
	
	@Override
	public boolean parse() {
		boolean result = false;
		if (IDENTIFIER("line")) {
			Location start = token.getStart();
			result = true;
			while(WHITESPACE());
			int line = -1;
			try {
				if (NUMBER()) {
					TNumber numTok = (TNumber) token;
					try {
						if (!numTok.isDecimalInteger()) throw new NumberFormatException("not decimal integer");
						line = Integer.valueOf(token.getText());
						if (line < 0) throw new NumberFormatException("signed integer");
					} catch (NumberFormatException e) {
						syntaxError(numTok.getStart(), "not a valid line number. Positive decimal integer allowed only");
						return result;
					}
				} else {
					syntaxError(start, "missing line number in line directive");
					return result;
				}
				while(WHITESPACE());
				int id = -1;
				if (NUMBER()) {
					TNumber numTok = (TNumber) token;
					try {
						if (!numTok.isDecimalInteger()) throw new NumberFormatException("not decimal integer");
						id = Integer.valueOf(token.getText());
						if (id < 0) throw new NumberFormatException("signed integer");
					} catch (NumberFormatException e) {
						syntaxError(numTok.getStart(), "not a valid source identifier. Positive integer allowed only");
						return result;
					}
				}
				while(WHITESPACE());
				if (mandatory_endl()) {
					if (id >= 0) {
						getLexer().setVirtualLocation(Integer.toString(id), line);
					} else {
						getLexer().setVirtualLocation(line);
					}
				}
			} catch (Recovery escape) {
				recoverError();
			}
		}
		return result;	}
	

	
}
