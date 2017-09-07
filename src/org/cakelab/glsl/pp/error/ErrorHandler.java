package org.cakelab.glsl.pp.error;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.Node;

public interface ErrorHandler {
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

