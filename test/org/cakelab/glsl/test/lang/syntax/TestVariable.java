package org.cakelab.glsl.test.lang.syntax;


public abstract class TestVariable extends TestingSyntaxBase {
	
	public void test() {
		testScalarVariable();
		testScalarVariableList();
		testScalarVariableArrayList();
		testScalarVariableInitialiserList();
		
		testScalarVariableQualifiers();
	}

	public void testScalarVariable() {
		for (String type : BUILTIN_TYPES) {
			String text = type + " v;";
			assertValid(text);
		}
	}

	public void testScalarVariableList() {
		for (String type : BUILTIN_TYPES) {
			String text = type + " u,v;";
			assertValid(text);
		}
	}

	public void testScalarVariableArrayList() {
		for (String type : BUILTIN_TYPES) {
			String text = type + " u[3],v;";
			assertValid(text);
		}
	}

	public void testScalarVariableInitialiserList() {
		for (String type : BUILTIN_TYPES) {
			String text = type + " u = 2, v = 3;";
			assertValid(text);
		}
		
		for (String type : BUILTIN_TYPES) {
			String text = type + " u = {1,2}, v = 3;";
			assertValid(text);
		}
		
	}

	public void testScalarVariableQualifiers() {
		
		assertValid("void a();\n"
				+ "void b();\n"
				+ "subroutine(a, b) void c();");
		
		
		for (String qualifier : TYPE_QUALIFIER_EXAMPLES) {
			for (String type : BUILTIN_TYPES) {
				String text = qualifier + " " + type + " u[3],v;";
				assertValid(text);
			}
		}
		
		String qualifier1 = TYPE_QUALIFIER_EXAMPLES[0];
		for (String qualifier2 : TYPE_QUALIFIER_EXAMPLES) {
			for (String type : BUILTIN_TYPES) {
				String text = qualifier1 + " " + qualifier2 + " " + type + " u[3],v;";
				assertValid(text);
			}
		}
		
		// test variable qualifier assignment
		qualifier1 = TYPE_QUALIFIER_EXAMPLES[0];
		for (String qualifier2 : TYPE_QUALIFIER_EXAMPLES) {
			// declare variables u and v
			String preamble = "int u,v;\n";
			// assign new qualifiers to u
			String text = preamble + qualifier1 + " " + qualifier2 + " " + " u;";
			assertValid(text);
			// assign new qualifiers to u and v
			text = preamble + qualifier1 + " " + qualifier2 + " " + " u,v;";
			assertValid(text);
		}
	}

}
