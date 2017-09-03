package org.cakelab.glsl.pp.lexer.rules;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.Token;

public class RPunctuator extends LexerRuleSequenceSelect {

	final static String[] punctuators = {
			"[",
			"]",
			"(",
			")",
			"{",
			"}",
			"...", ".",
			"--", "->", "-=", "-",
			"++", "+", "+=", 
			"&=", "&&","&", 
			"*=", "*",
			"~", 
			"!=", "!",
			"/=","/",
			"%>", "%:%:", "%:", "%=","%",
			"<<=", "<<","<:","<=","<%","<",
			">>=", ">>",">=", ">",
			"==",
			"^=", "^^", "^",
			"|=","||", "|",
			"?",
			":>",":",
			";",
			",",
			"=",
			/* # ## see RHash and RHashHash */ 
	};
	
	
	public RPunctuator(PPState state) {
		super(state, punctuators);
	}


	@Override
	protected Token createToken(Interval interval, String text) {
		return new TPunctuator(interval, text);
	}

	
	
	
}
