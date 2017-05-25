package org.cakelab.glsl;

import java.util.Date;

import org.cakelab.glsl.parser.TestGLSL;
import org.cakelab.glsl.pp.TestGLSLPP;

public class Test {
	public static void main(String[] args) {
		TestGLSL.test();
		TestGLSLPP.test();
		System.out.println(new Date() + " done.");
	}
}
