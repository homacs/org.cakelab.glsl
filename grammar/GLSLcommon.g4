//
// This grammar is taken from the specification of 
// "The OpenGL Shading Language" version 4.5 
// (revision 6) and accordingly extended by the rules
// of the standard C preprocessor language, taken 
// from the ISO/IEC 9899:201x standard titled 
// "Programming Languages -- C".
//


grammar GLSLcommon;




//
// Order of imported rules equals order of grammars in import statement!
// GLSLtoken must be last!
// 
import GLSLkeyword, GLSLtoken;


//
// Added to resolve conflicts.
// Note: In glslang, field selectors are the user 
// given names of members of a struct. Thus, IDENTIFIERs.
//
glslFieldSelection
	: IDENTIFIER
	;

glslVariableIdentifier
    : IDENTIFIER
    ;

//
// Added to resolve conflicts.
// Note: In glslang, type names are user given type names. 
// Thus, IDENTIFIERs.
//

glslTypeName
	: IDENTIFIER
	;
	

glslFunctionIdentifier
	: IDENTIFIER
	;



glslPrimaryExpression
    : IDENTIFIER
    | glslFloatConstant
    | glslDoubleConstant
    | glslIntegerConstant
    | glslUnsignedIntegerConstant
    | BOOLCONSTANT 
    | LEFT_PAREN glslExpression RIGHT_PAREN 
    ;

glslIntegerConstant
	: (PLUS|DASH)? INTCONSTANT
;  
glslUnsignedIntegerConstant
	: PLUS? UINTCONSTANT
;  
glslFloatConstant
	: (PLUS|DASH)? FLOATCONSTANT
;  
glslDoubleConstant
	: (PLUS|DASH)? DOUBLECONSTANT
;  

//
// Grammar Translation:
// ====================
// Rules function and constructor calls and all referenced 
// rules had to be replaced to resolve mutually left recursion.
//
// The new rules are:
// + Function call:    'postfix_expression function_call_arguments'
// + Constructor call: 'type_specifier     constructor_call_arguments'
//
glslPostfixExpression
    : glslPrimaryExpression 
    | glslTypeSpecifier     glslConstructorCallArguments
    | glslPostfixExpression glslFunctionCallArguments
    | glslPostfixExpression LEFT_BRACKET glslIntegerExpression RIGHT_BRACKET
    | glslPostfixExpression DOT glslFieldSelection
    | glslPostfixExpression INC_OP
    | glslPostfixExpression DEC_OP
    ;

    
glslFunctionCallArguments
	: glslCallArguments
;

glslConstructorCallArguments
	: glslCallArguments
;

glslCallArguments 
	: LEFT_PAREN glslAssignmentExpression (COMMA glslAssignmentExpression)* RIGHT_PAREN 
    | LEFT_PAREN VOID? RIGHT_PAREN 
;


glslIntegerExpression
    : glslExpression 
    ;

glslUnaryExpression
    : glslPostfixExpression 
    | INC_OP glslUnaryExpression 
    | DEC_OP glslUnaryExpression 
    | glslUnaryOperator glslUnaryExpression 
    
    | PPOP_DEFINED ((LEFT_PAREN IDENTIFIER RIGHT_PAREN)|IDENTIFIER) // only available in preprocessor
    ;
// Grammar Note:  No traditional style type casts.

glslUnaryOperator
    : PLUS  
    | DASH  
    | BANG  
    | TILDE 
    ;
// Grammar Note:  No '*' or '&' unary ops.  Pointers are not supported.

glslMultiplicativeExpression
    : glslUnaryExpression 
    | glslMultiplicativeExpression STAR glslUnaryExpression 
    | glslMultiplicativeExpression SLASH glslUnaryExpression 
    | glslMultiplicativeExpression PERCENT glslUnaryExpression 
    ;

glslAdditiveExpression
    : glslMultiplicativeExpression 
    | glslAdditiveExpression PLUS glslMultiplicativeExpression 
    | glslAdditiveExpression DASH glslMultiplicativeExpression 
    ;

glslShiftExpression
    : glslAdditiveExpression 
    | glslShiftExpression LEFT_OP glslAdditiveExpression 
    | glslShiftExpression RIGHT_OP glslAdditiveExpression 
    ;

glslRelationalExpression
    : glslShiftExpression 
    | glslRelationalExpression LEFT_ANGLE glslShiftExpression 
    | glslRelationalExpression RIGHT_ANGLE glslShiftExpression  
    | glslRelationalExpression LE_OP glslShiftExpression  
    | glslRelationalExpression GE_OP glslShiftExpression  
    ;

glslEqualityExpression
    : glslRelationalExpression 
    | glslEqualityExpression EQ_OP glslRelationalExpression  
    | glslEqualityExpression NE_OP glslRelationalExpression 
    ;

glslAndExpression
    : glslEqualityExpression 
    | glslAndExpression AMPERSAND glslEqualityExpression 
    ;

glslExclusiveOrExpression
    : glslAndExpression 
    | glslExclusiveOrExpression CARET glslAndExpression 
    ;

glslInclusiveOrExpression
    : glslExclusiveOrExpression 
    | glslInclusiveOrExpression VERTICAL_BAR glslExclusiveOrExpression 
    ;

glslLogicalAndExpression
    : glslInclusiveOrExpression 
    | glslLogicalAndExpression AND_OP glslInclusiveOrExpression 
    ;

glslLogicalXorExpression
    : glslLogicalAndExpression 
    | glslLogicalXorExpression XOR_OP glslLogicalAndExpression  
    ;

glslLogicalOrExpression
    : glslLogicalXorExpression 
    | glslLogicalOrExpression OR_OP glslLogicalXorExpression  
    ;

glslConditionalExpression
    : glslLogicalOrExpression 
    | glslLogicalOrExpression QUESTION 
      glslExpression COLON glslAssignmentExpression 
    ;

glslAssignmentExpression
    : glslConditionalExpression 
    | glslUnaryExpression glslAssignmentOperator glslAssignmentExpression 
    ;

glslAssignmentOperator
    : EQUAL 
    | MUL_ASSIGN 
    | DIV_ASSIGN 
    | MOD_ASSIGN 
    | ADD_ASSIGN 
    | SUB_ASSIGN 
    | LEFT_ASSIGN 
    | RIGHT_ASSIGN 
    | AND_ASSIGN 
    | XOR_ASSIGN 
    | OR_ASSIGN 
    ;

glslExpression
    : glslAssignmentExpression 
    | glslExpression COMMA glslAssignmentExpression 
    ;

glslConstantExpression
    : glslConditionalExpression 
    ;


////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////


glslFunctionNameList
    : glslFunctionName (COMMA glslFunctionName)*
    ;
    
glslFunctionName
	: {validator.isfunc(_ctx)}? IDENTIFIER
	;

glslTypeSpecifier
    : glslTypeSpecifierNonarray glslArrayDimensionsList?
    ;

glslArrayDimensionsList
    : glslArrayDimension+
    ;

glslArrayDimension
	: LEFT_BRACKET glslConstantExpression? RIGHT_BRACKET
	;



glslTypeSpecifierNonarray
    : glslBuiltinType 
    | glslStructSpecifier 
    | glslTypeName 
    ;

glslBuiltinType
    : VOID 
    | FLOAT 
    | DOUBLE 
    | INT 
    | UINT 
    | BOOL 
    | VEC2 
    | VEC3 
    | VEC4 
    | DVEC2 
    | DVEC3 
    | DVEC4 
    | BVEC2 
    | BVEC3 
    | BVEC4 
    | IVEC2 
    | IVEC3 
    | IVEC4 
    | UVEC2 
    | UVEC3 
    | UVEC4 
    | MAT2 
    | MAT3 
    | MAT4 
    | MAT2X2 
    | MAT2X3 
    | MAT2X4 
    | MAT3X2 
    | MAT3X3 
    | MAT3X4 
    | MAT4X2 
    | MAT4X3 
    | MAT4X4 
    | DMAT2 
    | DMAT3 
    | DMAT4 
    | DMAT2X2 
    | DMAT2X3 
    | DMAT2X4 
    | DMAT3X2 
    | DMAT3X3 
    | DMAT3X4 
    | DMAT4X2 
    | DMAT4X3 
    | DMAT4X4 
    | ATOMIC_UINT 
    | SAMPLER1D 
    | SAMPLER2D 
    | SAMPLER3D 
    | SAMPLERCUBE 
    | SAMPLER1DSHADOW 
    | SAMPLER2DSHADOW 
    | SAMPLERCUBESHADOW 
    | SAMPLER1DARRAY 
    | SAMPLER2DARRAY 
    | SAMPLER1DARRAYSHADOW 
    | SAMPLER2DARRAYSHADOW 
    | SAMPLERCUBEARRAY 
    | SAMPLERCUBEARRAYSHADOW 
    | ISAMPLER1D 
    | ISAMPLER2D 
    | ISAMPLER3D 
    | ISAMPLERCUBE 
    | ISAMPLER1DARRAY 
    | ISAMPLER2DARRAY 
    | ISAMPLERCUBEARRAY 
    | USAMPLER1D 
    | USAMPLER2D 
    | USAMPLER3D 
    | USAMPLERCUBE 
    | USAMPLER1DARRAY 
    | USAMPLER2DARRAY 
    | USAMPLERCUBEARRAY 
    | SAMPLER2DRECT 
    | SAMPLER2DRECTSHADOW 
    | ISAMPLER2DRECT 
    | USAMPLER2DRECT 
    | SAMPLERBUFFER 
    | ISAMPLERBUFFER 
    | USAMPLERBUFFER 
    | SAMPLER2DMS 
    | ISAMPLER2DMS 
    | USAMPLER2DMS 
    | SAMPLER2DMSARRAY 
    | ISAMPLER2DMSARRAY 
    | USAMPLER2DMSARRAY 
    | IMAGE1D 
    | IIMAGE1D 
    | UIMAGE1D 
    | IMAGE2D 
    | IIMAGE2D 
    | UIMAGE2D 
    | IMAGE3D 
    | IIMAGE3D 
    | UIMAGE3D 
    | IMAGE2DRECT 
    | IIMAGE2DRECT 
    | UIMAGE2DRECT 
    | IMAGECUBE 
    | IIMAGECUBE 
    | UIMAGECUBE 
    | IMAGEBUFFER 
    | IIMAGEBUFFER 
    | UIMAGEBUFFER 
    | IMAGE1DARRAY 
    | IIMAGE1DARRAY 
    | UIMAGE1DARRAY 
    | IMAGE2DARRAY 
    | IIMAGE2DARRAY 
    | UIMAGE2DARRAY 
    | IMAGECUBEARRAY 
    | IIMAGECUBEARRAY 
    | UIMAGECUBEARRAY 
    | IMAGE2DMS 
    | IIMAGE2DMS 
    | UIMAGE2DMS 
    | IMAGE2DMSARRAY 
    | IIMAGE2DMSARRAY 
    | UIMAGE2DMSARRAY 
    | SAMPLEREXTERNALOES 
    ;



glslStructSpecifier
    : STRUCT            LEFT_BRACE  glslStructMemberList RIGHT_BRACE 
    | STRUCT IDENTIFIER LEFT_BRACE  glslStructMemberList RIGHT_BRACE {validator.addDeclaredStruct(_localctx);}
    ;

glslStructMemberList
    : glslStructMemberGroup+
    ;

/**
 * A line like
 * int a,b,c;
 * with type(int) and members a, b and c.
 */
glslStructMemberGroup
    : glslTypeQualifier? glslTypeSpecifier glslStructMemberDeclaratorList SEMICOLON 
    ;

glslStructMemberDeclaratorList
    : glslStructMemberDeclarator (COMMA glslStructMemberDeclarator)*
    ;

glslStructMemberDeclarator
    : IDENTIFIER glslArrayDimensionsList?
    ;



glslTypeQualifier
    : glslSingleTypeQualifier+
    ;

glslSingleTypeQualifier
    : glslStorageQualifier 
    | glslLayoutQualifier 
    | glslPrecisionQualifier 
    | glslInterpolationQualifier 
    | glslInvariantQualifier 
    | glslPreciseQualifier 
    ;

glslInvariantQualifier
    : INVARIANT 
    ;

glslInterpolationQualifier
    : SMOOTH 
    | FLAT 
    | NOPERSPECTIVE 
    ;

glslLayoutQualifier
    : LAYOUT LEFT_PAREN glslLayoutQualifierIdList RIGHT_PAREN 
    ;

glslLayoutQualifierIdList
    : glslLayoutQualifierId (COMMA glslLayoutQualifierId)*
	;
	
glslLayoutQualifierId
    : IDENTIFIER 
    | IDENTIFIER EQUAL glslConstantExpression 
    | SHARED 
    ;

glslPreciseQualifier
    : PRECISE 
    ;

glslStorageQualifier
    : CONST 
    | ATTRIBUTE 
    | VARYING 
    | INOUT 
    | IN 
    | OUT 
    | CENTROID 
    | PATCH 
    | SAMPLE 
    | UNIFORM 
    | BUFFER 
    | SHARED 
    | COHERENT 
    | VOLATILE 
    | RESTRICT 
    | READONLY 
    | WRITEONLY 
    | SUBROUTINE LEFT_PAREN glslFunctionNameList RIGHT_PAREN 
    | SUBROUTINE 
    ;

glslPrecisionQualifier
    : HIGH_PRECISION 
    | MEDIUM_PRECISION 
    | LOW_PRECISION 
    ;


