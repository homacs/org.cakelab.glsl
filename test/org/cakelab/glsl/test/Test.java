package org.cakelab.glsl.test;

import java.util.Date;

import org.cakelab.glsl.test.builtins.TestBuiltinFeatures;
import org.cakelab.glsl.test.combined.TestCombined;
import org.cakelab.glsl.test.lang.syntax.TestGLSLSyntax;
import org.cakelab.glsl.test.pp.parse.TestPPParsing;
import org.cakelab.glsl.test.pp.syntax.TestPPSyntax;

public class Test {
	
	public static void checkAssertionsOn() {
		boolean on = false;
		assert on = true;
		if (!on) throw new AssertionError("requires assertions to be on");
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		checkAssertionsOn();
		
		
		System.out.println(new Date() + " testing preprocessor syntax checking.");
		TestPPSyntax.test();
		
		System.out.println(new Date() + " testing preprocessor parse results.");
		TestPPParsing.test();
		
		System.out.println(new Date() + " testing language parser syntax checking.");
		TestGLSLSyntax.test();
		
		System.out.println(new Date() + " testing builtin features.");
		TestBuiltinFeatures.test();
		
		System.out.println(new Date() + " testing all combined.");
		TestCombined.test();
		
		System.out.println(new Date() + " done.");
		
		long end = System.currentTimeMillis();
		System.out.println((end - start) + " ms");
	}
}
