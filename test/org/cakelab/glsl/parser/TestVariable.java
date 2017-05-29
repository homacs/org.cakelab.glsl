package org.cakelab.glsl.parser;

import org.cakelab.glsl.parser.GLSLParser.GlslBuiltinTypeContext;
import org.cakelab.glsl.parser.GLSLParser.GlslSingleDeclarationContext;

public class TestVariable extends TestBaseGLSL {
	
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
			assertValid(text, GlslSingleDeclarationContext.class, GlslBuiltinTypeContext.class);
		}

	}

	private static void testScalarVariableList() {
		for (String type : BUILTIN_TYPES) {
			String text = type + " u,v;";
			assertValid(text, GlslSingleDeclarationContext.class, GlslBuiltinTypeContext.class);
		}
	}

	private static void testScalarVariableArrayList() {
		for (String type : BUILTIN_TYPES) {
			String text = type + " u[3],v;";
			assertValid(text, GlslSingleDeclarationContext.class, GlslBuiltinTypeContext.class);
		}
	}

	private static void testScalarVariableInitialiserList() {
		for (String type : BUILTIN_TYPES) {
			String text = type + " u = 2, v = 3;";
			assertValid(text, GlslSingleDeclarationContext.class, GlslBuiltinTypeContext.class);
		}
		
		for (String type : BUILTIN_TYPES) {
			String text = type + " u = {1,2}, v = 3;";
			assertValid(text, GlslSingleDeclarationContext.class, GlslBuiltinTypeContext.class);
		}
		
	}

	private static void testScalarVariableQualifiers() {
		
		assertValid("void a(); void b(); subroutine(a, b) void c();");
		
		
		for (String qualifier : TYPE_QUALIFIER_EXAMPLES) {
			for (String type : BUILTIN_TYPES) {
				String text = qualifier + " " + type + " u[3],v;";
				assertValid(text, GlslSingleDeclarationContext.class, GlslBuiltinTypeContext.class);
			}
		}
		
		String qualifier1 = TYPE_QUALIFIER_EXAMPLES[0];
		for (String qualifier2 : TYPE_QUALIFIER_EXAMPLES) {
			for (String type : BUILTIN_TYPES) {
				String text = qualifier1 + " " + qualifier2 + " " + type + " u[3],v;";
				assertValid(text, GlslSingleDeclarationContext.class, GlslBuiltinTypeContext.class);
			}
		}
	}

}
