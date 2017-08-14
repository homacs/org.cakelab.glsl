package org.cakelab.glsl.pp.lexer;

import org.cakelab.glsl.Location;
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
	private RHash hash;
	private RHashHash hashhash;
	
	
	
	public RPunctuator(IScanner in, ErrorHandler handler, RHashHash hashhash, RHash hash) {
		super(in, handler, punctuators);
		this.hashhash = hashhash;
		this.hash = hash;
	}

	@Override
	public Token consume() {
		Location start = in.nextLocation();
		in.consume(lastMatch.length());
		Token token = new TPunctuator(interval(start), lastMatch);
		lastMatch = null;
		return token;
	}

	@Override
	public boolean match() {
		if (super.match()) {
			return true;
		} else if (hashhash.match()) {
			lastMatch = "##";
			return true;
		} else if (hash.match()) {
			lastMatch = "#";
			return true;
		} else {
			return false;
		}
	}

	
	
	
}
