package org.cakelab.glsl.test;

import java.util.Date;

import org.cakelab.glsl.test.lang.syntax.TestGLSL;

public class Test {
	public static void main(String[] args) {
		TestGLSL.test();
		System.out.println(new Date() + " done.");
	}
}
