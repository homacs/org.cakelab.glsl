package org.cakelab.glsl.test;

import java.io.File;

import org.cakelab.glsl.test.lang.TestingTools;

public class TestAllTestFiles extends TestingTools {

	public static void main(String[] args) {
		Test.checkAssertionsOn();
		File folder = new File("test_files");
		
		for (File f : folder.listFiles()) {
			if (f.isFile() && !f.isDirectory()) {
				test(f);
			}
		}
	}

	private static void test(File f) {
		// TODO [5] implement testing of test files
		
	}


}
