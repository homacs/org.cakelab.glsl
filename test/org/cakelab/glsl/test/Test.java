package org.cakelab.glsl.test;

import java.util.Date;

import org.cakelab.glsl.test.lang.syntax.TestGLSL;
import org.cakelab.glsl.test.pp.syntax.TestPP;

public class Test {
	public static void main(String[] args) {
		TestPP.test();
		TestGLSL.test();
		System.out.println(new Date() + " done.");
	}
}
