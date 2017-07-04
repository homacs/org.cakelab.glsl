package org.cakelab.glsl.test;

import java.util.Date;

import org.cakelab.glsl.test.lang.syntax.TestGLSLSyntax;
import org.cakelab.glsl.test.pp.parse.TestPPParsing;
import org.cakelab.glsl.test.pp.syntax.TestPPSyntax;

public class Test {
	public static void main(String[] args) {
		System.out.println(new Date() + " testing preprocessor syntax checking.");
		TestPPSyntax.test();
		
		System.out.println(new Date() + " testing preprocessor parse results.");
		TestPPParsing.test();
		
		
		
		System.out.println(new Date() + " testing language parser syntax checking.");
		TestGLSLSyntax.test();
		System.out.println(new Date() + " done.");
	}
}
