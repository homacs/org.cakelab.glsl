package org.cakelab.glsl;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cakelab.glsl.pp.LocationMap;
import org.cakelab.glsl.pp.error.ErrorHandler;

public interface GLSLErrorHandlerInterface extends ErrorHandler, ANTLRErrorListener {

	// TODO: refactor -> GLSLErrorHandler and GLSLErrorHandlerImpl
	
	
	void setResourceManager(ResourceManager resources);

	void setLocations(TokenStream tokens, LocationMap locations);

	void error(ParseTree node, String message);

}
