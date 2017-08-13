package org.cakelab.glsl.test.combined;

import java.io.IOException;
import java.util.List;

import org.cakelab.glsl.CombinedAST;
import org.cakelab.glsl.GLSL;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.impl.StandardFileManager;
import org.cakelab.glsl.lang.ast.Struct;

public class TestGLSL {
	public static void main(String[] args) {
		test();
	}
	
	
	public static void test() {
		ResourceManager resources = new StandardFileManager();
		GLSL glsl = new GLSL(resources);
		Resource resource;
		try {
			resource = resources.resolve("test_files/100.frag");
			CombinedAST result = glsl.parse(resource);

			List<Struct> structs = result.getStructs();
			if (structs.isEmpty()) {
				System.out.println("no structs found");
			} else {
				for (Struct s : structs) {
					System.out.println("found struct " + s.getName() + ".");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
