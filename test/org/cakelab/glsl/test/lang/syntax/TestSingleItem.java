package org.cakelab.glsl.parser;


public class TestSingleItem extends TestBaseGLSL {

	public static void main(String[] args) {
		assertValid(""
				+ "int simple = codeline;\n");
	}

}
