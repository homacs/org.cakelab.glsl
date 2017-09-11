package org.cakelab.glsl.lang.lexer.tokens;

public class GLSL_ES_TokenTable_V_100 extends GLSLTokenTable {
	
	public GLSL_ES_TokenTable_V_100() {
		super(100);
		//
		// Keywords
		//
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
	
		addKeyword(GLSLLanguageTokens.LOWP);
		addKeyword(GLSLLanguageTokens.MEDIUMP);
		addKeyword(GLSLLanguageTokens.HIGHP);
		addKeyword(GLSLLanguageTokens.PRECISION);
		addKeyword(GLSLLanguageTokens.INVARIANT);

		
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

		addBuiltinType(GLSLLanguageTokens.SAMPLER2D);
		addBuiltinType(GLSLLanguageTokens.SAMPLERCUBE);

		addKeyword(GLSLLanguageTokens.STRUCT);
	
		
		//
		// Reserved keywords
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
		addReservedKeyword(GLSLLanguageTokens.FLAT);
				
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
		
		addReservedKeyword(GLSLLanguageTokens.SAMPLER1D);
		addReservedKeyword(GLSLLanguageTokens.SAMPLER3D);
		
		addReservedKeyword(GLSLLanguageTokens.SAMPLER1DSHADOW);
		addReservedKeyword(GLSLLanguageTokens.SAMPLER3DSHADOW);
		
		addReservedKeyword(GLSLLanguageTokens.SAMPLER2DRECT);
		addReservedKeyword(GLSLLanguageTokens.SAMPLER3DRECT);
		addReservedKeyword(GLSLLanguageTokens.SAMPLER2DRECTSHADOW);
	
		addReservedKeyword(GLSLLanguageTokens.SIZEOF);
		addReservedKeyword(GLSLLanguageTokens.CAST);
		
		addReservedKeyword(GLSLLanguageTokens.NAMESPACE);
		addReservedKeyword(GLSLLanguageTokens.USING);
		
	}

}