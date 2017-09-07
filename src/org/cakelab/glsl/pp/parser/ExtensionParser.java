package org.cakelab.glsl.pp.parser;

import org.cakelab.glsl.GLSLExtension;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.tokens.TIdentifier;
import org.cakelab.glsl.pp.tokens.TPunctuator;

public class ExtensionParser extends Parser {

	private Interval interval;
	@SuppressWarnings("unused")
	private Preprocessor control;
	
	
	
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
				
				GLSLExtension.Behaviour behaviour = null;
				Location end = null;
				if (IDENTIFIER()) {
					TIdentifier ident = (TIdentifier) token;
					end = ident.getEnd();
					if (ident.getText().equals("require")) {
						behaviour = GLSLExtension.Behaviour.REQUIRE;
					} else if (ident.getText().equals("enable")) {
						behaviour = GLSLExtension.Behaviour.ENABLE;
					} else if (ident.getText().equals("warn")) {
						behaviour = GLSLExtension.Behaviour.WARN;
					} else if (ident.getText().equals("disable")) {
						behaviour = GLSLExtension.Behaviour.DISABLE;
					} else {
						syntaxError(ident.getStart(), "extension behaviour has to be one of [require, enable, warn, disable])");
					}
				} else {
					syntaxError(getLexer().lookahead(1).getStart(), "missing extension behaviour (one of [require, enable, warn, disable])");
				}
				while(WHITESPACE());
				mandatory_endl();
				
				if (extensionName != null && behaviour != null) {
					state.getExtensions().add(new GLSLExtension(new Interval(start, end), extensionName.getText(), behaviour));
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
