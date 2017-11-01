package org.cakelab.glsl.test.combined;

import java.io.IOException;
import java.util.List;

import org.cakelab.glsl.CombinedAST;
import org.cakelab.glsl.GLSL;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.impl.FileSystemResourceManager;
import org.cakelab.glsl.lang.ast.types.Struct;
import org.cakelab.glsl.test.Test;

public class TestFileSystem {
	
	
	public static void main(String[] args) {
		Test.checkAssertionsOn();
		test();
	}

	
	
	public static void test() {
		testFile("test_files/100.frag");
	}
	
	public static void testFile(String filename) {

		ResourceManager resources = new FileSystemResourceManager();
		
		GLSL glsl = new GLSL(GLSL.getDefaultCompilerFeatures(), resources);
		Resource resource;
		try {
			resource = resources.resolve(filename);
			CombinedAST result = glsl.parse(resource, ShaderType.FRAGMENT_SHADER);

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
