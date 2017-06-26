package org.cakelab.glsl.pp;

import org.cakelab.glsl.Location;

@SuppressWarnings("serial")
public class SyntaxError extends Error {

	public SyntaxError(Location location, String message) {
		super(location.toString() + ": " + message);
	}

}
