package org.cakelab.glsl.pp.parser;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.PPExtensionDirective;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.tokens.TIdentifier;
import org.cakelab.glsl.pp.tokens.TPunctuator;

public class ExtensionParser extends Parser {

	// TODO to support disabling extensions in user level code, #extension directives need change
	//     - either execute and record extension directives in preprocessor and then replay and execute in language level parser
	//     - or turn preprocessor in a pull lexer and enable disable accordingly only once.
	
	
	private Interval interval;
	@SuppressWarnings("unused")
	private Preprocessor control;
	private PPExtensionDirective directive;
	
	
	
	public ExtensionParser(Preprocessor control) {
		super(control.getState());
	}
	
	
	
	@Override
	public boolean parse() {
		boolean result = false;
		if (IDENTIFIER("extension")) {
			Location start = token.getStart();
			result = true;
			while(WHITESPACE());
			TIdentifier extensionName = null;
			try {
				if (!IDENTIFIER()) {
					syntaxError(start, "missing extension name");
				} else {
					extensionName = (TIdentifier)token;
					while(WHITESPACE());
					mandatory(TPunctuator.class, ":");
					while(WHITESPACE());
					
					PPExtensionDirective.Behaviour behaviour = null;
					Location end = null;
					if (IDENTIFIER()) {
						TIdentifier ident = (TIdentifier) token;
						end = ident.getEnd();
						if (ident.getText().equals("require")) {
							behaviour = PPExtensionDirective.Behaviour.REQUIRE;
						} else if (ident.getText().equals("enable")) {
							behaviour = PPExtensionDirective.Behaviour.ENABLE;
						} else if (ident.getText().equals("warn")) {
							behaviour = PPExtensionDirective.Behaviour.WARN;
						} else if (ident.getText().equals("disable")) {
							behaviour = PPExtensionDirective.Behaviour.DISABLE;
						} else {
							syntaxError(ident.getStart(), "extension behaviour has to be one of [require, enable, warn, disable])");
						}
					} else {
						syntaxError(getLexer().lookahead(1).getStart(), "missing extension behaviour (one of [require, enable, warn, disable])");
					}
					while(WHITESPACE());
					mandatory_endl();
					
					if (extensionName != null && behaviour != null) {
						this.directive = new PPExtensionDirective(new Interval(start, end), extensionName.getText(), behaviour);
						state.addExtensionDirective(directive);
					}
					
				}
			} catch (Recovery escape) {
				recoverError();
			}
		}
		return result;
	}
	

	public Interval getInterval() {
		return interval;
	}

	
}
