package org.cakelab.glsl.test.pp.parse;

import org.cakelab.glsl.test.TestProvider;

public class TestPPParsing {

	public static void test(TestProvider tester) {
		tester.test(TestMacros.class);
		tester.test(TestConditionalInclusion.class);
	}
	
	
	

}
