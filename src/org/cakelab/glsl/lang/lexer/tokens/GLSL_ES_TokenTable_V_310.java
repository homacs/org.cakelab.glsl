package org.cakelab.glsl.lang.lexer.tokens;

public class GLSL_ES_TokenTable_V_310 extends GLSLTokenTable {

	protected GLSL_ES_TokenTable_V_310() {
		super(300);
		//
		// Keywords
		//
		addKeyword(GLSLLanguageTokens.CONST);
		addKeyword(GLSLLanguageTokens.UNIFORM);
		addKeyword(GLSLLanguageTokens.BUFFER);
		addKeyword(GLSLLanguageTokens.SHARED);

		addKeyword(GLSLLanguageTokens.COHERENT);
		addKeyword(GLSLLanguageTokens.VOLATILE);
		addKeyword(GLSLLanguageTokens.RESTRICT);
		addKeyword(GLSLLanguageTokens.READONLY);
		addKeyword(GLSLLanguageTokens.WRITEONLY);

		addKeyword(GLSLLanguageTokens.ATOMIC_UINT);

		addKeyword(GLSLLanguageTokens.LAYOUT);
		
		addKeyword(GLSLLanguageTokens.CENTROID);
		addKeyword(GLSLLanguageTokens.FLAT);
		addKeyword(GLSLLanguageTokens.SMOOTH);
		
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
	
		addKeyword(GLSLLanguageTokens.IN);
		addKeyword(GLSLLanguageTokens.OUT);
		addKeyword(GLSLLanguageTokens.INOUT);
		
		addBuiltinType(GLSLLanguageTokens.FLOAT);
		addBuiltinType(GLSLLanguageTokens.INT);
		addBuiltinType(GLSLLanguageTokens.VOID);
		addBuiltinType(GLSLLanguageTokens.BOOL);
		addKeyword(GLSLLanguageTokens.TRUE);
		addKeyword(GLSLLanguageTokens.FALSE);
	
		addKeyword(GLSLLanguageTokens.INVARIANT);
		
		addKeyword(GLSLLanguageTokens.DISCARD);
		addKeyword(GLSLLanguageTokens.RETURN);
		

		addBuiltinType(GLSLLanguageTokens.MAT2);
		addBuiltinType(GLSLLanguageTokens.MAT3);
		addBuiltinType(GLSLLanguageTokens.MAT4);
		
		addBuiltinType(GLSLLanguageTokens.MAT2X2);
		addBuiltinType(GLSLLanguageTokens.MAT2X3);
		addBuiltinType(GLSLLanguageTokens.MAT2X4);
		
		addBuiltinType(GLSLLanguageTokens.MAT3X2);
		addBuiltinType(GLSLLanguageTokens.MAT3X3);
		addBuiltinType(GLSLLanguageTokens.MAT3X4);
		
		addBuiltinType(GLSLLanguageTokens.MAT4X2);
		addBuiltinType(GLSLLanguageTokens.MAT4X3);
		addBuiltinType(GLSLLanguageTokens.MAT4X4);
		
		addBuiltinType(GLSLLanguageTokens.VEC2);
		addBuiltinType(GLSLLanguageTokens.VEC3);
		addBuiltinType(GLSLLanguageTokens.VEC4);
		addBuiltinType(GLSLLanguageTokens.IVEC2);
		addBuiltinType(GLSLLanguageTokens.IVEC3);
		addBuiltinType(GLSLLanguageTokens.IVEC4);
		addBuiltinType(GLSLLanguageTokens.BVEC2);
		addBuiltinType(GLSLLanguageTokens.BVEC3);
		addBuiltinType(GLSLLanguageTokens.BVEC4);

		
		addBuiltinType(GLSLLanguageTokens.UINT);
		addBuiltinType(GLSLLanguageTokens.UVEC2);
		addBuiltinType(GLSLLanguageTokens.UVEC3);
		addBuiltinType(GLSLLanguageTokens.UVEC4);
		
		addKeyword(GLSLLanguageTokens.LOWP);
		addKeyword(GLSLLanguageTokens.MEDIUMP);
		addKeyword(GLSLLanguageTokens.HIGHP);
		addKeyword(GLSLLanguageTokens.PRECISION);

		
		addBuiltinType(GLSLLanguageTokens.SAMPLER2D);
		addBuiltinType(GLSLLanguageTokens.SAMPLER3D);
		addBuiltinType(GLSLLanguageTokens.SAMPLERCUBE);

		addBuiltinType(GLSLLanguageTokens.SAMPLER2DSHADOW);
		addBuiltinType(GLSLLanguageTokens.SAMPLERCUBESHADOW);

		addBuiltinType(GLSLLanguageTokens.SAMPLER2DARRAY);
		
		addBuiltinType(GLSLLanguageTokens.SAMPLER2DARRAYSHADOW);
		
		addBuiltinType(GLSLLanguageTokens.ISAMPLER2D);
		addBuiltinType(GLSLLanguageTokens.ISAMPLER3D);
		addBuiltinType(GLSLLanguageTokens.ISAMPLERCUBE);

		addBuiltinType(GLSLLanguageTokens.ISAMPLER2DARRAY);

		addBuiltinType(GLSLLanguageTokens.USAMPLER2D);
		addBuiltinType(GLSLLanguageTokens.USAMPLER3D);
		addBuiltinType(GLSLLanguageTokens.USAMPLERCUBE);

		addBuiltinType(GLSLLanguageTokens.USAMPLER2DARRAY);

		addBuiltinType(GLSLLanguageTokens.SAMPLER2DMS);
		addBuiltinType(GLSLLanguageTokens.ISAMPLER2DMS);
		addBuiltinType(GLSLLanguageTokens.USAMPLER2DMS);
		
		addBuiltinType(GLSLLanguageTokens.IMAGE2DARRAY);
		addBuiltinType(GLSLLanguageTokens.IIMAGE2DARRAY);
		addBuiltinType(GLSLLanguageTokens.UIMAGE2DARRAY);

		addBuiltinType(GLSLLanguageTokens.IMAGE2D);
		addBuiltinType(GLSLLanguageTokens.IIMAGE2D);
		addBuiltinType(GLSLLanguageTokens.UIMAGE2D);

		addBuiltinType(GLSLLanguageTokens.IMAGE3D);
		addBuiltinType(GLSLLanguageTokens.IIMAGE3D);
		addBuiltinType(GLSLLanguageTokens.UIMAGE3D);

		addBuiltinType(GLSLLanguageTokens.IMAGECUBE);
		addBuiltinType(GLSLLanguageTokens.IIMAGECUBE);
		addBuiltinType(GLSLLanguageTokens.UIMAGECUBE);
		    
		addKeyword(GLSLLanguageTokens.STRUCT);

		
		//
		// Reserved keywords
		//

		addReservedKeyword(GLSLLanguageTokens.ATTRIBUTE);
		addReservedKeyword(GLSLLanguageTokens.VARYING);
		
		addReservedKeyword(GLSLLanguageTokens.RESOURCE);

		addReservedKeyword(GLSLLanguageTokens.NOPERSPECTIVE);

		addReservedKeyword(GLSLLanguageTokens.PATCH);
		addReservedKeyword(GLSLLanguageTokens.SAMPLE);

		addReservedKeyword(GLSLLanguageTokens.SUBROUTINE);

		addReservedKeyword(GLSLLanguageTokens.PRECISE);

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

		addReservedKeyword(GLSLLanguageTokens.GOTO);
		
		
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
		
		addReservedKeyword(GLSLLanguageTokens.SAMPLER3DRECT);

		addReservedKeyword(GLSLLanguageTokens.FILTER);

		addReservedKeyword(GLSLLanguageTokens.IMAGE1D);

		addReservedKeyword(GLSLLanguageTokens.IIMAGE1D);

		addReservedKeyword(GLSLLanguageTokens.UIMAGE1D);

		addReservedKeyword(GLSLLanguageTokens.IMAGE1DARRAY);
		
		addReservedKeyword(GLSLLanguageTokens.IIMAGE1DARRAY);
		addReservedKeyword(GLSLLanguageTokens.UIMAGE1DARRAY);

		addReservedKeyword(GLSLLanguageTokens.IMAGEBUFFER);
		addReservedKeyword(GLSLLanguageTokens.IIMAGEBUFFER);
		addReservedKeyword(GLSLLanguageTokens.UIMAGEBUFFER);

		addReservedKeyword(GLSLLanguageTokens.SAMPLER1D);
		addReservedKeyword(GLSLLanguageTokens.SAMPLER1DSHADOW);
		addReservedKeyword(GLSLLanguageTokens.SAMPLER1DARRAY);
		addReservedKeyword(GLSLLanguageTokens.SAMPLER1DARRAYSHADOW);
		
		addReservedKeyword(GLSLLanguageTokens.ISAMPLER1D);
		addReservedKeyword(GLSLLanguageTokens.ISAMPLER1DARRAY);
		addReservedKeyword(GLSLLanguageTokens.USAMPLER1D);
		addReservedKeyword(GLSLLanguageTokens.USAMPLER1DARRAY);
		
		addReservedKeyword(GLSLLanguageTokens.SAMPLER2DRECT);
		addReservedKeyword(GLSLLanguageTokens.SAMPLER2DRECTSHADOW);
		addReservedKeyword(GLSLLanguageTokens.ISAMPLER2DRECT);
		addReservedKeyword(GLSLLanguageTokens.USAMPLER2DRECT);
		
		addReservedKeyword(GLSLLanguageTokens.SAMPLERBUFFER);
		addReservedKeyword(GLSLLanguageTokens.ISAMPLERBUFFER);
		addReservedKeyword(GLSLLanguageTokens.USAMPLERBUFFER);
		
		addReservedKeyword(GLSLLanguageTokens.SAMPLER2DMSARRAY);
		addReservedKeyword(GLSLLanguageTokens.ISAMPLER2DMSARRAY);
		addReservedKeyword(GLSLLanguageTokens.USAMPLER2DMSARRAY);
		
		addReservedKeyword(GLSLLanguageTokens.SIZEOF);
		addReservedKeyword(GLSLLanguageTokens.CAST);
		
		addReservedKeyword(GLSLLanguageTokens.NAMESPACE);
		addReservedKeyword(GLSLLanguageTokens.USING);

		addReservedKeyword(GLSLLanguageTokens.DMAT2);
		addReservedKeyword(GLSLLanguageTokens.DMAT3);
		addReservedKeyword(GLSLLanguageTokens.DMAT4);
		
		addReservedKeyword(GLSLLanguageTokens.DMAT2X2);
		addReservedKeyword(GLSLLanguageTokens.DMAT2X3);
		addReservedKeyword(GLSLLanguageTokens.DMAT2X4);
		
		addReservedKeyword(GLSLLanguageTokens.DMAT3X2);
		addReservedKeyword(GLSLLanguageTokens.DMAT3X3);
		addReservedKeyword(GLSLLanguageTokens.DMAT3X4);
		
		addReservedKeyword(GLSLLanguageTokens.DMAT4X2);
		addReservedKeyword(GLSLLanguageTokens.DMAT4X3);
		addReservedKeyword(GLSLLanguageTokens.DMAT4X4);
		
		addReservedKeyword(GLSLLanguageTokens.SAMPLERCUBEARRAY);
		addReservedKeyword(GLSLLanguageTokens.SAMPLERCUBEARRAYSHADOW);
		addReservedKeyword(GLSLLanguageTokens.ISAMPLERCUBEARRAY);

		addReservedKeyword(GLSLLanguageTokens.USAMPLERCUBEARRAY);
		
		addReservedKeyword(GLSLLanguageTokens.IMAGE2DRECT);
		addReservedKeyword(GLSLLanguageTokens.IIMAGE2DRECT);
		addReservedKeyword(GLSLLanguageTokens.UIMAGE2DRECT);

		addReservedKeyword(GLSLLanguageTokens.IMAGECUBEARRAY);
		addReservedKeyword(GLSLLanguageTokens.IIMAGECUBEARRAY);
		addReservedKeyword(GLSLLanguageTokens.UIMAGECUBEARRAY);
		
		addReservedKeyword(GLSLLanguageTokens.IMAGE2DMS);
		addReservedKeyword(GLSLLanguageTokens.IIMAGE2DMS);
		addReservedKeyword(GLSLLanguageTokens.UIMAGE2DMS);

		addReservedKeyword(GLSLLanguageTokens.IMAGE2DMSARRAY);
		addReservedKeyword(GLSLLanguageTokens.IIMAGE2DMSARRAY);
		addReservedKeyword(GLSLLanguageTokens.UIMAGE2DMSARRAY);
	}

}
