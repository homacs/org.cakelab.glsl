package org.cakelab.glsl.pp.parser;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.tokens.Token;

public class ErrorParser extends Parser {

	@SuppressWarnings("unused")
	private Preprocessor control;
	
	
	
	public ErrorParser(Preprocessor control) {
		super(control.getState());
	}
	
	
	
	@Override
	public boolean parse() {
		if (IDENTIFIER("error")) {
			Location loc = token.getStart();
			StringBuffer message = new StringBuffer("#error");
			for (Token t : read_remaining_line()) {
				message.append(t.getText());
			}
			try {
				syntaxError(line_start(loc), message.toString());
			} catch (Recovery escape) {
				// no recovery necessary
			}
			return true;
		} else {
			return false;
		}
	}
	

	
}
