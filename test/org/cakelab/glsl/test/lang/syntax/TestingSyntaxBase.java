package org.cakelab.glsl.test.lang.syntax;

import org.cakelab.glsl.test.Test;
import org.cakelab.glsl.test.lang.TestingBase;

public abstract class TestingSyntaxBase extends TestingBase implements Test {
	
	protected abstract void assertValid(String code);
	protected abstract void assertInvalid(String code);

	public abstract void setupMultiTest();
	
	public abstract void tearDownMultiTest();

}
