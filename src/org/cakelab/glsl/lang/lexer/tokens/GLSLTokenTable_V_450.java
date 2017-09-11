package org.cakelab.glsl.lang.lexer.tokens;

public class GLSLTokenTable_V_450 extends GLSLTokenTable {

	
	public GLSLTokenTable_V_450() {
		super(450);
		

		// LANGUAGE ELEMENTS
		addKeyword(GLSLLanguageTokens.ATTRIBUTE);
		addKeyword(GLSLLanguageTokens.CONST);
		addKeyword(GLSLLanguageTokens.UNIFORM);
		addKeyword(GLSLLanguageTokens.VARYING);
		addKeyword(GLSLLanguageTokens.BUFFER);
		addKeyword(GLSLLanguageTokens.SHARED);

		addKeyword(GLSLLanguageTokens.COHERENT);
		addKeyword(GLSLLanguageTokens.VOLATILE);
		addKeyword(GLSLLanguageTokens.RESTRICT);
		addKeyword(GLSLLanguageTokens.READONLY);
		addKeyword(GLSLLanguageTokens.WRITEONLY);
		
		addBuiltinType(GLSLLanguageTokens.ATOMIC_UINT);

		addKeyword(GLSLLanguageTokens.LAYOUT);
		
		addKeyword(GLSLLanguageTokens.CENTROID);
		addKeyword(GLSLLanguageTokens.FLAT);
		addKeyword(GLSLLanguageTokens.SMOOTH);
		addKeyword(GLSLLanguageTokens.NOPERSPECTIVE);
		
		addKeyword(GLSLLanguageTokens.PATCH);
		addKeyword(GLSLLanguageTokens.SAMPLE);
		
		addKeyword(GLSLLanguageTokens.BREAK);
		addKeyword(GLSLLanguageTokens.CONTINUE);
		addKeyword(GLSLLanguageTokens.DO);
		addKeyword(GLSLLanguageTokens.FOR);
		addKeyword(GLSLLanguageTokens.WHILE);
		addKeyword(GLSLLanguageTokens.SWITCH);
		addKeyword(GLSLLanguageTokens.CASE);
		addKeyword(GLSLLanguageTokens.DEFAULT);
		
		addKeyword(GLSLLanguageTokens.IF);
		addKeyword(GLSLLanguageTokens.ELSE);
		
		addKeyword(GLSLLanguageTokens.SUBROUTINE);
		
		addKeyword(GLSLLanguageTokens.IN);
		addKeyword(GLSLLanguageTokens.OUT);
		addKeyword(GLSLLanguageTokens.INOUT);
		
		addBuiltinType(GLSLLanguageTokens.FLOAT);
		addBuiltinType(GLSLLanguageTokens.DOUBLE);
		addBuiltinType(GLSLLanguageTokens.INT);
		addBuiltinType(GLSLLanguageTokens.VOID);
		addBuiltinType(GLSLLanguageTokens.BOOL);
		addKeyword(GLSLLanguageTokens.TRUE);
		addKeyword(GLSLLanguageTokens.FALSE);

		addKeyword(GLSLLanguageTokens.INVARIANT);
		addKeyword(GLSLLanguageTokens.PRECISE);
		
		addKeyword(GLSLLanguageTokens.DISCARD);
		addKeyword(GLSLLanguageTokens.RETURN);

		addBuiltinType(GLSLLanguageTokens.MAT2);
		addBuiltinType(GLSLLanguageTokens.MAT3);
		addBuiltinType(GLSLLanguageTokens.MAT4);
		addBuiltinType(GLSLLanguageTokens.DMAT2);
		addBuiltinType(GLSLLanguageTokens.DMAT3);
		addBuiltinType(GLSLLanguageTokens.DMAT4);
		
		addBuiltinType(GLSLLanguageTokens.MAT2X2);
		addBuiltinType(GLSLLanguageTokens.MAT2X3);
		addBuiltinType(GLSLLanguageTokens.MAT2X4);
		addBuiltinType(GLSLLanguageTokens.DMAT2X2);
		addBuiltinType(GLSLLanguageTokens.DMAT2X3);
		addBuiltinType(GLSLLanguageTokens.DMAT2X4);

		addBuiltinType(GLSLLanguageTokens.MAT3X2);
		addBuiltinType(GLSLLanguageTokens.MAT3X3);
		addBuiltinType(GLSLLanguageTokens.MAT3X4);
		addBuiltinType(GLSLLanguageTokens.DMAT3X2);
		addBuiltinType(GLSLLanguageTokens.DMAT3X3);
		addBuiltinType(GLSLLanguageTokens.DMAT3X4);
		
		addBuiltinType(GLSLLanguageTokens.MAT4X2);
		addBuiltinType(GLSLLanguageTokens.MAT4X3);
		addBuiltinType(GLSLLanguageTokens.MAT4X4);
		addBuiltinType(GLSLLanguageTokens.DMAT4X2);
		addBuiltinType(GLSLLanguageTokens.DMAT4X3);
		addBuiltinType(GLSLLanguageTokens.DMAT4X4);
		
		addBuiltinType(GLSLLanguageTokens.VEC2);
		addBuiltinType(GLSLLanguageTokens.VEC3);
		addBuiltinType(GLSLLanguageTokens.VEC4);
		addBuiltinType(GLSLLanguageTokens.IVEC2);
		addBuiltinType(GLSLLanguageTokens.IVEC3);
		addBuiltinType(GLSLLanguageTokens.IVEC4);
		addBuiltinType(GLSLLanguageTokens.BVEC2);
		addBuiltinType(GLSLLanguageTokens.BVEC3);
		addBuiltinType(GLSLLanguageTokens.BVEC4);
		addBuiltinType(GLSLLanguageTokens.DVEC2);
		addBuiltinType(GLSLLanguageTokens.DVEC3);
		addBuiltinType(GLSLLanguageTokens.DVEC4);
		
		addBuiltinType(GLSLLanguageTokens.UINT);
		addBuiltinType(GLSLLanguageTokens.UVEC2);
		addBuiltinType(GLSLLanguageTokens.UVEC3);
		addBuiltinType(GLSLLanguageTokens.UVEC4);
		
		addKeyword(GLSLLanguageTokens.LOWP);
		addKeyword(GLSLLanguageTokens.MEDIUMP);
		addKeyword(GLSLLanguageTokens.HIGHP);
		addKeyword(GLSLLanguageTokens.PRECISION);
		
		addBuiltinType(GLSLLanguageTokens.SAMPLER1D);
		addBuiltinType(GLSLLanguageTokens.SAMPLER2D);
		addBuiltinType(GLSLLanguageTokens.SAMPLER3D);
		addBuiltinType(GLSLLanguageTokens.SAMPLERCUBE);
		
		addBuiltinType(GLSLLanguageTokens.SAMPLER1DSHADOW);
		addBuiltinType(GLSLLanguageTokens.SAMPLER2DSHADOW);
		addBuiltinType(GLSLLanguageTokens.SAMPLERCUBESHADOW);
		
		addBuiltinType(GLSLLanguageTokens.SAMPLER1DARRAY);
		addBuiltinType(GLSLLanguageTokens.SAMPLER2DARRAY);
		
		addBuiltinType(GLSLLanguageTokens.SAMPLER1DARRAYSHADOW);
		addBuiltinType(GLSLLanguageTokens.SAMPLER2DARRAYSHADOW);
		
		addBuiltinType(GLSLLanguageTokens.ISAMPLER1D);
		addBuiltinType(GLSLLanguageTokens.ISAMPLER2D);
		addBuiltinType(GLSLLanguageTokens.ISAMPLER3D);
		addBuiltinType(GLSLLanguageTokens.ISAMPLERCUBE);
		
		addBuiltinType(GLSLLanguageTokens.ISAMPLER1DARRAY);
		addBuiltinType(GLSLLanguageTokens.ISAMPLER2DARRAY);
		
		addBuiltinType(GLSLLanguageTokens.USAMPLER1D);
		addBuiltinType(GLSLLanguageTokens.USAMPLER2D);
		addBuiltinType(GLSLLanguageTokens.USAMPLER3D);
		addBuiltinType(GLSLLanguageTokens.USAMPLERCUBE);
		
		addBuiltinType(GLSLLanguageTokens.USAMPLER1DARRAY);
		addBuiltinType(GLSLLanguageTokens.USAMPLER2DARRAY);
		
		addBuiltinType(GLSLLanguageTokens.SAMPLER2DRECT);
		addBuiltinType(GLSLLanguageTokens.SAMPLER2DRECTSHADOW);
		addBuiltinType(GLSLLanguageTokens.ISAMPLER2DRECT);
		addBuiltinType(GLSLLanguageTokens.USAMPLER2DRECT);
		
		addBuiltinType(GLSLLanguageTokens.SAMPLERBUFFER);
		addBuiltinType(GLSLLanguageTokens.ISAMPLERBUFFER);
		addBuiltinType(GLSLLanguageTokens.USAMPLERBUFFER);
		
		addBuiltinType(GLSLLanguageTokens.SAMPLER2DMS);
		addBuiltinType(GLSLLanguageTokens.ISAMPLER2DMS);
		addBuiltinType(GLSLLanguageTokens.USAMPLER2DMS);
		
		addBuiltinType(GLSLLanguageTokens.SAMPLER2DMSARRAY);
		addBuiltinType(GLSLLanguageTokens.ISAMPLER2DMSARRAY);
		addBuiltinType(GLSLLanguageTokens.USAMPLER2DMSARRAY);
		
		addBuiltinType(GLSLLanguageTokens.SAMPLERCUBEARRAY);
		addBuiltinType(GLSLLanguageTokens.SAMPLERCUBEARRAYSHADOW);
		addBuiltinType(GLSLLanguageTokens.ISAMPLERCUBEARRAY);
		addBuiltinType(GLSLLanguageTokens.USAMPLERCUBEARRAY);
		
		addBuiltinType(GLSLLanguageTokens.IMAGE1D);
		addBuiltinType(GLSLLanguageTokens.IIMAGE1D);
		addBuiltinType(GLSLLanguageTokens.UIMAGE1D);
		
		addBuiltinType(GLSLLanguageTokens.IMAGE2D);
		addBuiltinType(GLSLLanguageTokens.IIMAGE2D);
		addBuiltinType(GLSLLanguageTokens.UIMAGE2D);
		
		addBuiltinType(GLSLLanguageTokens.IMAGE3D);
		addBuiltinType(GLSLLanguageTokens.IIMAGE3D);
		addBuiltinType(GLSLLanguageTokens.UIMAGE3D);
		
		addBuiltinType(GLSLLanguageTokens.IMAGE2DRECT);
		addBuiltinType(GLSLLanguageTokens.IIMAGE2DRECT);
		addBuiltinType(GLSLLanguageTokens.UIMAGE2DRECT);
		
		addBuiltinType(GLSLLanguageTokens.IMAGECUBE);
		addBuiltinType(GLSLLanguageTokens.IIMAGECUBE);
		addBuiltinType(GLSLLanguageTokens.UIMAGECUBE);
		
		addBuiltinType(GLSLLanguageTokens.IMAGEBUFFER);
		addBuiltinType(GLSLLanguageTokens.IIMAGEBUFFER);
		addBuiltinType(GLSLLanguageTokens.UIMAGEBUFFER);
		
		addBuiltinType(GLSLLanguageTokens.IMAGE1DARRAY);
		addBuiltinType(GLSLLanguageTokens.IIMAGE1DARRAY);
		addBuiltinType(GLSLLanguageTokens.UIMAGE1DARRAY);
		
		addBuiltinType(GLSLLanguageTokens.IMAGE2DARRAY);
		addBuiltinType(GLSLLanguageTokens.IIMAGE2DARRAY);
		addBuiltinType(GLSLLanguageTokens.UIMAGE2DARRAY);
		
		addBuiltinType(GLSLLanguageTokens.IMAGECUBEARRAY);
		addBuiltinType(GLSLLanguageTokens.IIMAGECUBEARRAY);
		addBuiltinType(GLSLLanguageTokens.UIMAGECUBEARRAY);
		
		addBuiltinType(GLSLLanguageTokens.IMAGE2DMS);
		addBuiltinType(GLSLLanguageTokens.IIMAGE2DMS);
		addBuiltinType(GLSLLanguageTokens.UIMAGE2DMS);
		
		addBuiltinType(GLSLLanguageTokens.IMAGE2DMSARRAY);
		addBuiltinType(GLSLLanguageTokens.IIMAGE2DMSARRAY);
		addBuiltinType(GLSLLanguageTokens.UIMAGE2DMSARRAY);
		
		addKeyword(GLSLLanguageTokens.STRUCT);

		
		// reserved keywords
		addReservedKeyword(GLSLLanguageTokens.COMMON);
		addReservedKeyword(GLSLLanguageTokens.PARTITION);
		addReservedKeyword(GLSLLanguageTokens.ACTIVE);
		
		addReservedKeyword(GLSLLanguageTokens.ASM);
		addReservedKeyword(GLSLLanguageTokens.CLASS);
		addReservedKeyword(GLSLLanguageTokens.UNION);
		addReservedKeyword(GLSLLanguageTokens.ENUM);
		addReservedKeyword(GLSLLanguageTokens.TYPEDEF);
		addReservedKeyword(GLSLLanguageTokens.TEMPLATE);
		addReservedKeyword(GLSLLanguageTokens.THIS);
		addReservedKeyword(GLSLLanguageTokens.RESOURCE);
		addReservedKeyword(GLSLLanguageTokens.GOTO);
		addReservedKeyword(GLSLLanguageTokens.INLINE);
		addReservedKeyword(GLSLLanguageTokens.NOINLINE);
		addReservedKeyword(GLSLLanguageTokens.PUBLIC);
		addReservedKeyword(GLSLLanguageTokens.STATIC);
		addReservedKeyword(GLSLLanguageTokens.EXTERN);
		addReservedKeyword(GLSLLanguageTokens.EXTERNAL);
		addReservedKeyword(GLSLLanguageTokens.INTERFACE);
				
		addReservedKeyword(GLSLLanguageTokens.LONG);
		addReservedKeyword(GLSLLanguageTokens.SHORT);
		addReservedKeyword(GLSLLanguageTokens.HALF);
		addReservedKeyword(GLSLLanguageTokens.FIXED);
		addReservedKeyword(GLSLLanguageTokens.UNSIGNED);
		addReservedKeyword(GLSLLanguageTokens.SUPERP);
		addReservedKeyword(GLSLLanguageTokens.INPUT);
		addReservedKeyword(GLSLLanguageTokens.OUTPUT);
				
		addReservedKeyword(GLSLLanguageTokens.SIZEOF);
		addReservedKeyword(GLSLLanguageTokens.CAST);
		addReservedKeyword(GLSLLanguageTokens.NAMESPACE);
		addReservedKeyword(GLSLLanguageTokens.USING);
				
		addReservedKeyword(GLSLLanguageTokens.HVEC2);
		addReservedKeyword(GLSLLanguageTokens.HVEC3);
		addReservedKeyword(GLSLLanguageTokens.HVEC4);
		addReservedKeyword(GLSLLanguageTokens.FVEC2);
		addReservedKeyword(GLSLLanguageTokens.FVEC3);
		addReservedKeyword(GLSLLanguageTokens.FVEC4);
		addReservedKeyword(GLSLLanguageTokens.SAMPLER3DRECT);
		addReservedKeyword(GLSLLanguageTokens.FILTER);
		

	}

}