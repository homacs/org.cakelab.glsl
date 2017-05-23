package org.cakelab.glsl;

import java.io.File;

public class TestAllTestFiles extends TestBaseCommon {

	public static void main(String[] args) {
		File folder = new File("test_files");
		
		for (File f : folder.listFiles()) {
			if (f.isFile() && !f.isDirectory()) {
				test(f);
			}
		}
	}

	private static void test(File f) {
		// TODO Auto-generated method stub
		
	}


}
