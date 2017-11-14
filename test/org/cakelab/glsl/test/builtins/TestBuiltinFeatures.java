package org.cakelab.glsl.test.builtins;

import org.cakelab.glsl.test.TestProvider;

public class TestBuiltinFeatures {
	public static void test(TestProvider tester) {
		tester.test(TestGLSLTokenTable.class);
		tester.test(TestBuiltinSymbols.class);
		tester.test(TestExtensionLoading.class);
	}
}
