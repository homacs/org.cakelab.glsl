package org.cakelab.glsl.test.pp.parse;

import org.cakelab.glsl.test.Test;

public class TestPPParsing {

	public static void main(String[] args) {
		Test.checkAssertionsOn();
		test();
	}

	public static void test() {
		TestMacros.test();
		TestConditionalInclusion.test();
	}
	
	
	

}
