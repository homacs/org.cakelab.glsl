package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashMap;

public class GLSLTokenTable_V_130 extends GLSLTokenTable {

	public GLSLTokenTable_V_130() {
		super(110);
		language = new HashMap<String, Integer>();
		
		
		// LANGUAGE ELEMENTS
		addKeyword(GLSLLanguageTokens.ATTRIBUTE);
		addKeyword(GLSLLanguageTokens.CONST);
		addKeyword(GLSLLanguageTokens.UNIFORM);
		addKeyword(GLSLLanguageTokens.VARYING);
		
		addKeyword(GLSLLanguageTokens.CENTROID);
		addKeyword(GLSLLanguageTokens.FLAT);
		addKeyword(GLSLLanguageTokens.SMOOTH);
		addKeyword(GLSLLanguageTokens.NOPERSPECTIVE);
		
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
		
		addBuiltinType(GLSLLanguageTokens.ISAMPLER2D);
		addBuiltinType(GLSLLanguageTokens.ISAMPLER3D);
		addBuiltinType(GLSLLanguageTokens.ISAMPLERCUBE);

		addBuiltinType(GLSLLanguageTokens.ISAMPLER2DARRAY);

		addBuiltinType(GLSLLanguageTokens.USAMPLER2D);
		addBuiltinType(GLSLLanguageTokens.USAMPLER3D);
		addBuiltinType(GLSLLanguageTokens.USAMPLERCUBE);

		addBuiltinType(GLSLLanguageTokens.USAMPLER2DARRAY);

		addKeyword(GLSLLanguageTokens.STRUCT);

		
		//
		// keywords, that have been reserved but not yet included in the language
		//
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
		addReservedKeyword(GLSLLanguageTokens.PACKAGED);

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
		
		addReservedKeyword(GLSLLanguageTokens.SAMPLER2DRECT);
		addReservedKeyword(GLSLLanguageTokens.SAMPLER3DRECT);
		addReservedKeyword(GLSLLanguageTokens.SAMPLER2DRECTSHADOW);

		addReservedKeyword(GLSLLanguageTokens.SAMPLERBUFFER);
		
		addReservedKeyword(GLSLLanguageTokens.FILTER);

		addReservedKeyword(GLSLLanguageTokens.IMAGE1D);
		addReservedKeyword(GLSLLanguageTokens.IMAGE2D);
		addReservedKeyword(GLSLLanguageTokens.IMAGE3D);
		addReservedKeyword(GLSLLanguageTokens.IMAGECUBE);
		
		addReservedKeyword(GLSLLanguageTokens.IIMAGE1D);
		addReservedKeyword(GLSLLanguageTokens.IIMAGE2D);
		addReservedKeyword(GLSLLanguageTokens.IIMAGE3D);
		addReservedKeyword(GLSLLanguageTokens.IIMAGECUBE);
		
		addReservedKeyword(GLSLLanguageTokens.UIMAGE1D);
		addReservedKeyword(GLSLLanguageTokens.UIMAGE2D);
		addReservedKeyword(GLSLLanguageTokens.UIMAGE3D);
		addReservedKeyword(GLSLLanguageTokens.UIMAGECUBE);
		
		addReservedKeyword(GLSLLanguageTokens.IMAGE1DARRAY);
		addReservedKeyword(GLSLLanguageTokens.IMAGE2DARRAY);
		
		addReservedKeyword(GLSLLanguageTokens.IIMAGE1DARRAY);
		addReservedKeyword(GLSLLanguageTokens.IIMAGE2DARRAY);
		addReservedKeyword(GLSLLanguageTokens.UIMAGE1DARRAY);
		addReservedKeyword(GLSLLanguageTokens.UIMAGE2DARRAY);
		
		addReservedKeyword(GLSLLanguageTokens.IMAGE1DSHADOW);
		addReservedKeyword(GLSLLanguageTokens.IMAGE2DSHADOW);
		
		addReservedKeyword(GLSLLanguageTokens.IMAGE1DARRAYSHADOW);
		addReservedKeyword(GLSLLanguageTokens.IMAGE2DARRAYSHADOW);
		
		addReservedKeyword(GLSLLanguageTokens.IMAGEBUFFER);
		addReservedKeyword(GLSLLanguageTokens.IIMAGEBUFFER);
		addReservedKeyword(GLSLLanguageTokens.UIMAGEBUFFER);
		
		addReservedKeyword(GLSLLanguageTokens.SIZEOF);
		addReservedKeyword(GLSLLanguageTokens.CAST);
		
		addReservedKeyword(GLSLLanguageTokens.NAMESPACE);
		addReservedKeyword(GLSLLanguageTokens.USING);
				
		addReservedKeyword(GLSLLanguageTokens.ROW_MAJOR);
	}

}
