package org.cakelab.glsl;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cakelab.glsl.pp.error.ErrorHandler;

public interface GLSLErrorHandler extends ErrorHandler, ANTLRErrorListener {

	// TODO: refactor -> GLSLErrorHandler and GLSLErrorHandlerImpl
	
	
	void setLocations(TokenStream tokens);

	void error(ParseTree node, String message);

}
