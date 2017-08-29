package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.Token;

public class RPunctuator extends LexerRuleSequenceSelect {

	final static String[] punctuators = {"[","]","(",")","{","}",".","->",
			"++", "--", "&", "*", "+", "-", "~", "!",
			"/","%","<<",">>","<",">","<=",">=","==","!=","^","|","&&","||",
			"?",":",";","...",
			"=","*=","/=", "%=", "+=", "-=", "<<=", ">>=", "&=", "^=", "|=",
			/* # ## see blow */ ",",
			"<:", ":>", "<%", "%>", "%:", "%:%:"};
	
	
	public RPunctuator(IScanner in, ErrorHandler handler) {
		super(in, handler, punctuators);
	}


	@Override
	protected Token createToken(String text) {
		return new TPunctuator(text);
	}

	
	
	
}
