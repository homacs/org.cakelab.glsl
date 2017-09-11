package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashMap;

public class GLSLTokenTable_V_110 extends GLSLTokenTable {

	public GLSLTokenTable_V_110() {
		super(110);
		language = new HashMap<String, Integer>();
		
		
		// LANGUAGE ELEMENTS
		addKeyword(GLSLLanguageTokens.ATTRIBUTE);
		addKeyword(GLSLLanguageTokens.CONST);
		addKeyword(GLSLLanguageTokens.UNIFORM);
		addKeyword(GLSLLanguageTokens.VARYING);
		
		addKeyword(GLSLLanguageTokens.BREAK);
		addKeyword(GLSLLanguageTokens.CONTINUE);
		addKeyword(GLSLLanguageTokens.DO);
		addKeyword(GLSLLanguageTokens.FOR);
		addKeyword(GLSLLanguageTokens.WHILE);
		
		addKeyword(GLSLLanguageTokens.IF);
		addKeyword(GLSLLanguageTokens.ELSE);

		addKeyword(GLSLLanguageTokens.IN);
		addKeyword(GLSLLanguageTokens.OUT);
		addKeyword(GLSLLanguageTokens.INOUT);
		
		addBuiltinType(GLSLLanguageTokens.FLOAT);
		addBuiltinType(GLSLLanguageTokens.INT);
		addBuiltinType(GLSLLanguageTokens.VOID);
		addBuiltinType(GLSLLanguageTokens.BOOL);
		addKeyword(GLSLLanguageTokens.TRUE);
		addKeyword(GLSLLanguageTokens.FALSE);

		addKeyword(GLSLLanguageTokens.DISCARD);
		addKeyword(GLSLLanguageTokens.RETURN);

		addBuiltinType(GLSLLanguageTokens.MAT2);
		addBuiltinType(GLSLLanguageTokens.MAT3);
		addBuiltinType(GLSLLanguageTokens.MAT4);
		
		addBuiltinType(GLSLLanguageTokens.VEC2);
		addBuiltinType(GLSLLanguageTokens.VEC3);
		addBuiltinType(GLSLLanguageTokens.VEC4);
		addBuiltinType(GLSLLanguageTokens.IVEC2);
		addBuiltinType(GLSLLanguageTokens.IVEC3);
		addBuiltinType(GLSLLanguageTokens.IVEC4);
		addBuiltinType(GLSLLanguageTokens.BVEC2);
		addBuiltinType(GLSLLanguageTokens.BVEC3);
		addBuiltinType(GLSLLanguageTokens.BVEC4);

		addBuiltinType(GLSLLanguageTokens.SAMPLER1D);
		addBuiltinType(GLSLLanguageTokens.SAMPLER2D);
		addBuiltinType(GLSLLanguageTokens.SAMPLER3D);
		addBuiltinType(GLSLLanguageTokens.SAMPLERCUBE);
		addBuiltinType(GLSLLanguageTokens.SAMPLER1DSHADOW);
		addBuiltinType(GLSLLanguageTokens.SAMPLER2DSHADOW);

		addKeyword(GLSLLanguageTokens.STRUCT);

		
		//
		// keywords, that have been reserved but not yet included in the language
		//
		addReservedKeyword(GLSLLanguageTokens.ASM);

		addReservedKeyword(GLSLLanguageTokens.CLASS);
		addReservedKeyword(GLSLLanguageTokens.UNION);
		addReservedKeyword(GLSLLanguageTokens.ENUM);
		addReservedKeyword(GLSLLanguageTokens.TYPEDEF);
		addReservedKeyword(GLSLLanguageTokens.TEMPLATE);
		addReservedKeyword(GLSLLanguageTokens.THIS);
		addReservedKeyword(GLSLLanguageTokens.PACKAGED);

		addReservedKeyword(GLSLLanguageTokens.GOTO);
		addReservedKeyword(GLSLLanguageTokens.SWITCH);
		addReservedKeyword(GLSLLanguageTokens.DEFAULT);
		
		addReservedKeyword(GLSLLanguageTokens.INLINE);
		addReservedKeyword(GLSLLanguageTokens.NOINLINE);
		addReservedKeyword(GLSLLanguageTokens.VOLATILE);
		addReservedKeyword(GLSLLanguageTokens.PUBLIC);
		addReservedKeyword(GLSLLanguageTokens.STATIC);
		addReservedKeyword(GLSLLanguageTokens.EXTERN);
		addReservedKeyword(GLSLLanguageTokens.EXTERNAL);
		addReservedKeyword(GLSLLanguageTokens.INTERFACE);
				
		addReservedKeyword(GLSLLanguageTokens.LONG);
		addReservedKeyword(GLSLLanguageTokens.SHORT);
		addReservedKeyword(GLSLLanguageTokens.DOUBLE);
		addReservedKeyword(GLSLLanguageTokens.HALF);
		addReservedKeyword(GLSLLanguageTokens.FIXED);
		addReservedKeyword(GLSLLanguageTokens.UNSIGNED);
		addReservedKeyword(GLSLLanguageTokens.SUPERP);

		addReservedKeyword(GLSLLanguageTokens.INPUT);
		addReservedKeyword(GLSLLanguageTokens.OUTPUT);
				
		addReservedKeyword(GLSLLanguageTokens.HVEC2);
		addReservedKeyword(GLSLLanguageTokens.HVEC3);
		addReservedKeyword(GLSLLanguageTokens.HVEC4);
		addReservedKeyword(GLSLLanguageTokens.DVEC2);
		addReservedKeyword(GLSLLanguageTokens.DVEC3);
		addReservedKeyword(GLSLLanguageTokens.DVEC4);
		addReservedKeyword(GLSLLanguageTokens.FVEC2);
		addReservedKeyword(GLSLLanguageTokens.FVEC3);
		addReservedKeyword(GLSLLanguageTokens.FVEC4);
		
		addReservedKeyword(GLSLLanguageTokens.SAMPLER2DRECT);
		addReservedKeyword(GLSLLanguageTokens.SAMPLER3DRECT);
		addReservedKeyword(GLSLLanguageTokens.SAMPLER2DRECTSHADOW);
		
		addReservedKeyword(GLSLLanguageTokens.SIZEOF);
		addReservedKeyword(GLSLLanguageTokens.CAST);
		
		addReservedKeyword(GLSLLanguageTokens.NAMESPACE);
		addReservedKeyword(GLSLLanguageTokens.USING);
				
	}

}
