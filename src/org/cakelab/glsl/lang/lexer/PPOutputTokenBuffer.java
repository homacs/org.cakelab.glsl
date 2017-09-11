package org.cakelab.glsl.lang.lexer;

import java.util.ArrayList;
import java.util.HashMap;

import org.cakelab.glsl.GLSLParser;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.lang.lexer.tokens.GLSLTokenTable;
import org.cakelab.glsl.lang.lexer.tokens.PPOutputToken;
import org.cakelab.glsl.pp.LocationMap;
import org.cakelab.glsl.pp.PPHelper;
import org.cakelab.glsl.pp.PPOutputSink;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.error.TokenFormatException;
import org.cakelab.glsl.pp.tokens.TIdentifier;
import org.cakelab.glsl.pp.tokens.TNumber;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.TWhitespace;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

public class PPOutputTokenBuffer extends PPHelper implements PPOutputSink, PPState.Listener {


	int pos;
	ArrayList<PPOutputToken> tokens = new ArrayList<PPOutputToken>();
	private ResourceManager resources;
	private HashMap<String,PPTokenSource> cachedTokenSources = new HashMap<String,PPTokenSource>();
	private GLSLTokenTable tokenTable;
	private LocationMap locations = new LocationMap();
	
	public PPOutputTokenBuffer(ResourceManager resources) {
		this.resources = resources;
		pos = -1;
		this.tokenTable = GLSLTokenTable.getDefault();
	}
	
	
	@Override
	public void init(PPState state) {
		reportModifiedVersion(state.getGlslVersion());
		
		state.addListener(this);
		setState(state);
	}

	
	public ArrayList<PPOutputToken> getTokens() {
		return tokens;
	}
	

	public void setKeywords(GLSLTokenTable keywords) {
		this.tokenTable = keywords;
	}
	

	public LocationMap getLocations() {
		return locations;
	}
	

	@Override
	public void print(TokenList tokens) {
		for (Token token : tokens) {
			print(token);
		}
	}

	@Override
	public void print(Token t) {
		int index = tokens.size();
		int start = pos +1;
		if (!(t instanceof TWhitespace)) {
			PPOutputToken oToken = convert(index, start, t);
			tokens.add(oToken);
		}
		
		pos += t.length();
		
		locations.report(t, pos);

	}
	
	private PPOutputToken convert(int index, int start, Token t) {
		PPTokenSource source = getTokenSource(t.getStart().getSourceIdentifier());
		int stop = start + t.length() - 1;
		int type = getType(t);
		return new PPOutputToken(index, source, start, stop, type, t);
	}

	private int getType(Token t) {
		if (t instanceof TWhitespace) {
			// TWhitespace is base of TCrlf, TLineContinuation, TComment and TUnknownToken
			throw new InternalError("preprocessor is supposed to remove all whitespace tokens");
		} else if (t instanceof TIdentifier) {
			String ident = t.getText();
			if (tokenTable.isLanguageKeyword(ident)) {
				return tokenTable.mapLanguageKeyword(ident);
			} else if (tokenTable.isBuiltinType(ident)) {
				return tokenTable.mapBuiltintType(ident);
			} else if (tokenTable.isReservedKeyword(ident)) {
				// TODO: warn in case of reserved keywords?
				return GLSLParser.IDENTIFIER;
			} else {
				return GLSLParser.IDENTIFIER;
			}
		} else if (t instanceof TPunctuator && tokenTable.isPunctuator(t.getText())) {
			return tokenTable.getPunctuator(t.getText());
		} else if (t instanceof TNumber) {
			TNumber number = (TNumber)t;
			validate(number);

			if (number.isUnsignedInteger()) {
				return GLSLParser.UINTCONSTANT;
			} else if (number.isInteger()) {
				return GLSLParser.INTCONSTANT;
			} else if (number.isFloat()) {
				return GLSLParser.FLOATCONSTANT;
			} else if (number.isDouble()) {
				return GLSLParser.DOUBLECONSTANT;
			} else {
				throw new Error("internal error: constant number type recognition failed");
			}
		} else {
			throw new Error("internal error: token '" + t.getText() + "' should have not been forwarded as language token output");
		}
	}

	
	private void validate(TNumber number) {
		try {
			number.decode();
		} catch (TokenFormatException e) {
			try {
				syntaxError(number, e.getMessage());
			} catch (Recovery ignore) {
			}
		}
		
	}


	private PPTokenSource getTokenSource(String id) {
		PPTokenSource source = cachedTokenSources.get(id);
		if (source == null) {
			Resource resource = resources.getResourceById(id);
			if (resource != null) {
				source = new PPTokenSource(resource);
			} else {
				// TODO: needs a way to validate it (maybe a special URL)
				source = new PPTokenSource(id);
			}
			cachedTokenSources.put(id, source);
		}
		return source;
	}


	@Override
	public void reportModifiedVersion(GLSLVersion version) {
		if (version != null) {
			tokenTable = GLSLTokenTable.get(version.number);
		} else {
			tokenTable = GLSLTokenTable.getDefault();
		}
	}


	public PPTokenSource[] getSources() {
		return cachedTokenSources.values().toArray(new PPTokenSource[0]);
	}



	public PPTokenSource getInputSource() {
		return getTokenSource(state.getInputResource().getIdentifier());
	}


	
}
