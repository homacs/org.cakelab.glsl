package org.cakelab.glsl.pp.parser;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.GLSLVersion.Profile;
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
					
					while(WHITESPACE());
					if (IDENTIFIER("core")) {
						end = token.getEnd();
						profile = GLSLVersion.Profile.core;
					} else if (IDENTIFIER("compatibility")) {
						end = token.getEnd();
						profile = GLSLVersion.Profile.compatibility;
					} else if (IDENTIFIER("es")) {
						end = token.getEnd();
						profile = GLSLVersion.Profile.es;
					} else if (IDENTIFIER()) {
						// TODO: too restrictive profile parsing prevents us from being future compatible
						try {
							syntaxError(token, "invalid profile identifier '" + token.getText() + "'");
						} catch (Recovery e) {
							// validation will assign a proper profile later
						}
					}
					
					while(WHITESPACE());
					mandatory_endl();
	
					
					if (state.getGlslVersion() == null) {
						if (state.isSeenCodeLine()) syntaxWarning(start, "#version directive can not be preceeded by code lines");
						if (number > 0) {
							GLSLVersion glslVersion = validate(new GLSLVersion(new Interval(start, end), number, profile));
							state.setGlslVersion(glslVersion);
						}
						// in any case, we have seen a code line now.
						state.setSeenCodeLine(true);
					} else if (state.isForcedVersion()) {
						syntaxWarning(start, "#version ignored due to forced version (see method (setForcedVersion())");
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
	

	private GLSLVersion validate(GLSLVersion glslVersion) throws Recovery {
		int number = glslVersion.number;
		Profile profile = glslVersion.profile;
		if (number < 150 && profile != null) {
			try {
				syntaxError(glslVersion, "profile only supported for versions starting at 1.50");
			} catch (Recovery e) {
				profile = null;
			}
		}
		switch (number) {
		case 100:
		case 300:
		case 310:
			if (profile != null && profile != Profile.es) {
				try {
					syntaxError(glslVersion, "profile for version '" + number + "' has to be 'es' and not '" + profile + "'.");
				} catch (Recovery e) {
				}
			}
			// always 'es'
			glslVersion.profile = Profile.es;
			break;
		case 110:
		case 120:
		case 130:
		case 140:
			glslVersion.profile = Profile.core;
			break;
		case 150:
		case 330:
		case 400:
		case 410:
		case 420:
		case 430:
		case 440:
		case 450:
		case 460:
			if (profile == null) {
				glslVersion.profile = Profile.core;
			} else if (profile != Profile.core && profile != Profile.compatibility){
				try {
					syntaxError(glslVersion, "profile for version '" + number + "' has to be either 'core' or 'compatibility' and not '" + profile + "'.");
				} catch (Recovery e) {
					glslVersion.profile = Profile.core;
				}
			}
			break;
		default:
			syntaxError(glslVersion, "version " + glslVersion.number + "' not supported");
		}
		return glslVersion;
	}



	public Interval getInterval() {
		return interval;
	}

	
}
