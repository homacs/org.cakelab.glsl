package org.cakelab.glsl.test;

import java.util.Date;

import org.cakelab.glsl.test.builtins.TestBuiltinFeatures;
import org.cakelab.glsl.test.combined.TestCombined;
import org.cakelab.glsl.test.lang.syntax.TestGLSLSyntax;
import org.cakelab.glsl.test.pp.parse.TestPPParsing;
import org.cakelab.glsl.test.pp.syntax.TestPPSyntax;

public class TestAll {
	
	public static void checkAssertionsOn() {
		boolean on = false;
		assert on = true;
		if (!on) throw new AssertionError("requires assertions to be on");
	}
	
	public static void test(TestProvider tester) {
		long start = System.currentTimeMillis();
		
		checkAssertionsOn();
		
		
		System.out.println(new Date() + " testing preprocessor syntax checking.");
		TestPPSyntax.test(tester);
		
		System.out.println(new Date() + " testing preprocessor parse results.");
		TestPPParsing.test(tester);
		
		System.out.println(new Date() + " testing language parser syntax checking.");
		TestGLSLSyntax.test(tester);
		
		System.out.println(new Date() + " testing builtin features.");
		TestBuiltinFeatures.test(tester);
		
		System.out.println(new Date() + " testing all combined.");
		TestCombined.test(tester);
		
		System.out.println(new Date() + " done.");
		
		long end = System.currentTimeMillis();
		System.out.println((end - start) + " ms");
	}
}
