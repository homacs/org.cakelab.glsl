package org.cakelab.glsl.lang.lexer;

import java.util.ArrayList;
import java.util.HashMap;

import org.cakelab.glsl.GLSLErrorHandler;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.lang.lexer.tokens.PPOutputToken;
import org.cakelab.glsl.pp.LocationMap;
import org.cakelab.glsl.pp.PPHelper;
import org.cakelab.glsl.pp.PPOutputSink;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

/**
 * Creates an ANTLR compliant PPOutputToken initialised with type INVALID_TOKEN.
 * 
 * Type will be assigned by the ANTLR token stream during language parsing.
 * 
 * @author homac
 *
 */
public class GLSL_ANTLR_PPOutputBuffer extends PPHelper implements PPOutputSink {


	/** refers to the position of the last written character in the output stream */
	int pos;
	ArrayList<PPOutputToken> tokens = new ArrayList<PPOutputToken>();
	private ResourceManager resources;
	private HashMap<String,PPTokenSource> cachedTokenSources = new HashMap<String,PPTokenSource>();
	private LocationMap locations = new LocationMap();
	
	public GLSL_ANTLR_PPOutputBuffer(ResourceManager resources) {
		this.resources = resources;
		pos = -1;
	}
	
	
	public ArrayList<PPOutputToken> getTokens() {
		return tokens;
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
		PPOutputToken oToken = convert(index, start, t);
		tokens.add(oToken);
		pos += t.length();
		locations.report(t, pos);
	}
	
	private PPOutputToken convert(int index, int start, Token t) {
		PPTokenSource source = getTokenSource(t.getStart().getSourceIdentifier());
		int stop = start + t.length() - 1;
		int type = PPOutputToken.INVALID_TYPE;
		return new PPOutputToken(index, source, start, stop, type, t);
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


	public PPTokenSource[] getUsedTokenSources() {
		return cachedTokenSources.values().toArray(new PPTokenSource[0]);
	}



	public PPTokenSource getInputSource() {
		return getTokenSource(state.getInputResource().getIdentifier());
	}


	@Override
	public void init(PPState state) {
		setState(state);
	}


	public GLSLVersion getVersion() {
		return state.getGlslVersion();
	}


	public GLSLErrorHandler getGLSLErrorHandler() {
		ErrorHandler handler = state.getErrorHandler();
		if (handler instanceof GLSLErrorHandler) {
			return (GLSLErrorHandler) handler;
		} else {
			return null;
		}
	}


	
}
