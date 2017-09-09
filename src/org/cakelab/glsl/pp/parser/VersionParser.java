package org.cakelab.glsl.pp.parser;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.ConstantValue;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.error.TokenFormatException;
import org.cakelab.glsl.pp.tokens.TNumber;

public class VersionParser extends Parser {


	private Interval interval;
	@SuppressWarnings("unused")
	private Preprocessor control;
	
	
	
	public VersionParser(Preprocessor control) {
		super(control.getState());
	}
	
	
	
	@Override
	public boolean parse() {
		boolean result = false;
		if (IDENTIFIER("version")) {
			Location start = token.getStart();
			result = true;
			try {
				while(WHITESPACE());
				if (!NUMBER()) {
					syntaxError(start, "missing version number");
				} else {
					TNumber numTok = ((TNumber)token);
					int number = -1;
					try {
						if (!numTok.isDecimalInteger() || numTok.length() == 0) {
							syntaxError(numTok.getStart(), "version number is a 3 digit decimal integer");
						}
						Expression decoded = numTok.decode();
						if (decoded instanceof ConstantValue) {
							@SuppressWarnings("unchecked")
							ConstantValue<Long> intVal = ((ConstantValue<Long>)decoded);
							number = ((Long) intVal.value().getNativeValue()).intValue();
						}
					} catch (TokenFormatException e) {
						syntaxError(numTok, e.getMessage());
					}
					Location end = numTok.getEnd();
					GLSLVersion.Profile profile = null;
					
					try {
						while(WHITESPACE());
						if (IDENTIFIER("core")) {
							end = token.getEnd();
							profile = GLSLVersion.Profile.CORE;
						} else if (IDENTIFIER("compatibility")) {
							end = token.getEnd();
							profile = GLSLVersion.Profile.COMPATIBILITY;
						} else if (IDENTIFIER("es")) {
							end = token.getEnd();
							profile = GLSLVersion.Profile.ES;
						} else if (IDENTIFIER()) {
							// TODO: too restrictive profile parsing prevents us from being future compatible
							syntaxError(token, "invalid profile identifier '" + token.getText() + "'");
						}
					} catch (Recovery escape) {
						// we would like to keep at least the version number, so we recover here.
						recoverError();
					}
					while(WHITESPACE());
					mandatory_endl();
	
					
					if (state.getGlslVersion() == null) {
						if (state.isSeenCodeLineBeforeVersion()) syntaxWarning(start, "#version directive can not be preceeded by code lines");
						if (number > 0) {
							state.setGlslVersion(new GLSLVersion(new Interval(start, end), number, profile));
						}
					} else {
						syntaxWarning(start, "version redefined");
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
