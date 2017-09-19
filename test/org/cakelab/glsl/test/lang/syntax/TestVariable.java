package org.cakelab.glsl.test.lang.syntax;

import org.cakelab.glsl.GLSLParser.GlslBuiltinTypeContext;
import org.cakelab.glsl.GLSLParser.GlslDeclarationContext;
import org.cakelab.glsl.test.lang.TestingBase;

public class TestVariable extends TestingBase {
	
	public static void test() {
		testScalarVariable();
		testScalarVariableList();
		testScalarVariableArrayList();
		testScalarVariableInitialiserList();
		
		testScalarVariableQualifiers();
	}

	private static void testScalarVariable() {
		for (String type : BUILTIN_TYPES) {
			String text = type + " v;";
			assertValid(text, GlslDeclarationContext.class, GlslBuiltinTypeContext.class);
		}

	}

	private static void testScalarVariableList() {
		for (String type : BUILTIN_TYPES) {
			String text = type + " u,v;";
			assertValid(text, GlslDeclarationContext.class, GlslBuiltinTypeContext.class);
		}
	}

	private static void testScalarVariableArrayList() {
		for (String type : BUILTIN_TYPES) {
			String text = type + " u[3],v;";
			assertValid(text, GlslDeclarationContext.class, GlslBuiltinTypeContext.class);
		}
	}

	private static void testScalarVariableInitialiserList() {
		for (String type : BUILTIN_TYPES) {
			String text = type + " u = 2, v = 3;";
			assertValid(text, GlslDeclarationContext.class, GlslBuiltinTypeContext.class);
		}
		
		for (String type : BUILTIN_TYPES) {
			String text = type + " u = {1,2}, v = 3;";
			assertValid(text, GlslDeclarationContext.class, GlslBuiltinTypeContext.class);
		}
		
	}

	private static void testScalarVariableQualifiers() {
		
		assertValid("void a();\n"
				+ "void b();\n"
				+ "subroutine(a, b) void c();");
		
		
		for (String qualifier : TYPE_QUALIFIER_EXAMPLES) {
			for (String type : BUILTIN_TYPES) {
				String text = qualifier + " " + type + " u[3],v;";
				assertValid(text, GlslDeclarationContext.class, GlslBuiltinTypeContext.class);
			}
		}
		
		String qualifier1 = TYPE_QUALIFIER_EXAMPLES[0];
		for (String qualifier2 : TYPE_QUALIFIER_EXAMPLES) {
			for (String type : BUILTIN_TYPES) {
				String text = qualifier1 + " " + qualifier2 + " " + type + " u[3],v;";
				assertValid(text, GlslDeclarationContext.class, GlslBuiltinTypeContext.class);
			}
		}
		
		// test variable qualifier assignment
		qualifier1 = TYPE_QUALIFIER_EXAMPLES[0];
		for (String qualifier2 : TYPE_QUALIFIER_EXAMPLES) {
			// declare variables u and v
			String preamble = "int u,v;\n";
			// assign new qualifiers to u
			String text = preamble + qualifier1 + " " + qualifier2 + " " + " u;";
			assertValid(text, GlslDeclarationContext.class);
			// assign new qualifiers to u and v
			text = preamble + qualifier1 + " " + qualifier2 + " " + " u,v;";
			assertValid(text, GlslDeclarationContext.class);
		}
	}

}
