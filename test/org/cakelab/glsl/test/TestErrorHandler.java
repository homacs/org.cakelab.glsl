package org.cakelab.glsl.test;

import org.cakelab.glsl.GLSLErrorHandler;

public interface TestErrorHandler extends GLSLErrorHandler {

	boolean hasError();

	String getMessage();

	void reset();

}
