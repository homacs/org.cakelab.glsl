package org.cakelab.glsl;

import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.error.SyntaxError;

public interface GLSLErrorHandler {

	void setResourceManager(ResourceManager resources);
	
	/**
	 * @param node malicious node
	 * @param message
	 * @exception SyntaxError Throw it, if you wish the parser to immediately stop parsing
	 */
	public void error(Node node, String message) throws SyntaxError;
	/**
	 * @param expression
	 * @param message
	 * @exception SyntaxError Throw it, if you wish the parser to immediately stop parsing
	 */
	public void error(Location start, String message) throws SyntaxError;
	
	/**
	 * @param location
	 * @param message
	 * @exception SyntaxError Throw it, if you wish the parser to immediately stop parsing
	 */
	public void warning(Location location, String message) throws SyntaxError;
	/**
	 * 
	 * @param interval interval containing the malicious tokens
	 * @param message
	 * @exception SyntaxError Throw it, if you wish the parser to immediately stop parsing
	 */
	public void warning(Interval interval, String message) throws SyntaxError;

}
