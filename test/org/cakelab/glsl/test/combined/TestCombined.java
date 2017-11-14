package org.cakelab.glsl.test.combined;

import org.cakelab.glsl.test.TestProvider;
import org.cakelab.glsl.test.combined.extensions.TestExtensions;

public class TestCombined {
	public static void test(TestProvider tester) {
		tester.test(TestExtensions.class);
	}
}
