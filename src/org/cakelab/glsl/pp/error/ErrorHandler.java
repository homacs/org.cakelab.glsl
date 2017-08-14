package org.cakelab.glsl.pp.error;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.Node;

public interface ErrorHandler {
	/**
	 * @param node malicious node
	 * @param string
	 * @return whether to stop processing or not
	 */
	public boolean error(Node node, String message);
	/**
	 * @param expression
	 * @param string
	 * @return whether to stop processing or not
	 */
	public boolean error(Location start, String message);
	/**
	 * @param location
	 * @param string
	 * @return whether to stop processing or not
	 */
	public boolean warning(Location location, String message);
	/**
	 * 
	 * @param interval interval containing the malicious tokens
	 * @param message
	 * @return
	 */
	public boolean warning(Interval interval, String message);
}

