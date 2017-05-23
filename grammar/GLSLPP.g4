//
// This grammar is taken from the specification of 
// "The OpenGL Shading Language" version 4.5 
// (revision 6) and accordingly extended by the rules
// of the standard C preprocessor language, taken 
// from the ISO/IEC 9899:201x standard titled 
// "Programming Languages -- C".
//


grammar GLSLPP;

import GLSLPPkeyword, GLSLkeyword, GLSLtoken_base, GLSLPPtoken;

/**
 * Main entry point of the preprocessor parser.
 * The preprocessor considers the text to be
 * a set of lines where each line is either a
 * directive or a code text_line.
 */
glslppPreprocessingFile
	: glslppGroup?
	| EOF
;

glslppGroup:
	glslppGroupPart+
;

glslppGroupPart:
	glslppIfSection
	| glslppControlLine
	| glslppTextLine
;

glslppIfSection:
	glslppIfGroup  glslppElifGroups? glslppElseGroup? glslppEndifLine
;

glslppIfGroup:
	HASH IF glslConstantExpression  CRLF  glslppGroup?
	| HASH IFDEF glslppIdentifier  CRLF  glslppGroup?
	| HASH IFNDEF glslppIdentifier  CRLF  glslppGroup?
;

glslppElifGroups:
	glslppElifGroup+
;

glslppElifGroup: 
	HASH ELIF glslConstantExpression  CRLF  glslppGroup?
;

glslppElseGroup:
	HASH ELSE CRLF glslppGroup?
;

glslppEndifLine: 
	HASH ENDIF CRLF
;

glslppControlLine
	: HASH INCLUDE glslppTokens  CRLF
	| HASH DEFINE glslppIdentifier  glslppReplacementList  CRLF
	| HASH DEFINE IDENTIFIER_LEFT_PAREN  glslppIdentifierList?  RIGHT_PAREN glslppReplacementList  CRLF
	| HASH DEFINE IDENTIFIER_LEFT_PAREN  DOTS  RIGHT_PAREN glslppReplacementList  CRLF
	| HASH DEFINE IDENTIFIER_LEFT_PAREN  glslppIdentifierList COMMA DOTS  RIGHT_PAREN glslppReplacementList  CRLF
	| HASH UNDEF glslppIdentifier  CRLF
	| HASH LINE glslppTokens  CRLF
	| HASH ERROR glslppTokens? CRLF
	| HASH PRAGMA glslppTokens? CRLF
	| HASH EXTENSION glslppIdentifier COLON glslppExtensionBehaviour CRLF
	| HASH VERSION INTCONSTANT glslppProfile CRLF
	| HASH CRLF                 /* empty directive */
	| HASH glslppNonDirective   /* ignored directive */
;

glslppExtensionBehaviour
	: 'require'
	| 'enable'
	| 'warn'
	| 'disable'
	;

glslppProfile
	: CORE
	| COMPATIBILITY
	| ES 
	;

glslppIdentifierList
	: glslppIdentifier (COMMA glslppIdentifier)*
;

/** Any line not starting with # */
glslppTextLine
	: ~HASH ~CRLF* CRLF
	| CRLF
;

glslppNonDirective
	: ~(INCLUDE | DEFINE | UNDEF | LINE | ERROR | PRAGMA | EXTENSION | VERSION) glslppTokens? CRLF
;

glslppReplacementList
	: glslppTokens?
;

glslppTokens:
	glslppPreprocessingToken+
;

glslppPreprocessingToken
	: glslppHeaderName
	| glslppIdentifier
	| glslppNumber
	| glslppCharacterConstant
	| glslppStringLiteral
	| glslppPunctuator
	| glslppUnspecifiedToken /* each non-white-space character that cannot be one of the above */
;

glslppCharacterConstant
	: CHARACTER_CONSTANT
	| PREFIXED_CHARACTER_CONSTANT
;

glslppStringLiteral
	: STRING_LITERAL
	| PREFIXED_STRING_LITERAL
;

glslppHeaderName
	: STD_HEADER_NAME
	| STRING_LITERAL
;


//////////////////////////////////////////////
//    B A S I C S
//////////////////////////////////////////////




glslppIdentifier : IDENTIFIER
;

glslppNumber
	: INTCONSTANT
	| UINTCONSTANT
	| DOUBLECONSTANT
	| FLOATCONSTANT
;

glslppSign: (PLUS|DASH)?;

glslppPunctuator
	: HASH
	| PPOP_CONCAT
	| LEFT_BRACKET 
	| RIGHT_BRACKET 
	| LEFT_PAREN 
	| RIGHT_PAREN 
	| LEFT_BRACE 
	| RIGHT_BRACE 
	| DOT 
	| INC_OP 
	| DEC_OP 
	| AMPERSAND 
	| STAR 
	| PLUS 
	| DASH 
	| TILDE 
	| BANG
	| SLASH 
	| PERCENT 
	| LEFT_OP 
	| RIGHT_OP 
	| LEFT_ANGLE RIGHT_ANGLE 
	| LE_OP 
	| GE_OP 
	| EQ_OP 
	| NE_OP 
	| CARET 
	| VERTICAL_BAR 
	| AND_OP 
	| OR_OP
	| QUESTION 
	| COLON 
	| SEMICOLON 
	| DOTS
	| EQUAL 
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
	| COMMA 
;

/**
 * All tokens, which are not specific preprocessing tokens
 * but part of glsl (i.e. used in macros).
 */
glslppUnspecifiedToken:
	~(
		STRING_LITERAL
		| STD_HEADER_NAME
		| IDENTIFIER
		| INTCONSTANT
		| UINTCONSTANT
		| DOUBLECONSTANT
		| FLOATCONSTANT
		| CHARACTER_CONSTANT
		| PREFIXED_CHARACTER_CONSTANT
		| PREFIXED_STRING_LITERAL
		| HASH
		| PPOP_CONCAT
		| LEFT_BRACKET 
		| RIGHT_BRACKET 
		| LEFT_PAREN 
		| RIGHT_PAREN 
		| LEFT_BRACE 
		| RIGHT_BRACE 
		| DOT 
		| INC_OP 
		| DEC_OP 
		| AMPERSAND 
		| STAR 
		| PLUS 
		| DASH 
		| TILDE 
		| BANG
		| SLASH 
		| PERCENT 
		| LEFT_OP 
		| RIGHT_OP 
		| LEFT_ANGLE
		| LE_OP 
		| GE_OP 
		| EQ_OP 
		| NE_OP 
		| CARET 
		| VERTICAL_BAR 
		| AND_OP 
		| OR_OP
		| QUESTION 
		| COLON 
		| SEMICOLON 
		| DOTS
		| EQUAL 
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
		| COMMA
		| WHITESPACE
		| CRLF
	)
;



////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////   
////                     Everything below are rules copied from GLSL.g4 .
////
////                      The preprocessor needs to support 'constant
////                      expressions' for the conditions in #if etc. 
////                      This is the only purpose.
////                      Problem is, that the preprocessor needs CRLF
////                      to be recognised, while the GLSL parser needs
////                      it to be invisible.
////                      Unfortunately, I can't find a way to turn
////                      off certain lexer rules, otherwise I could 
////                      have just imported GLSL.g4 to do it.
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////

// START OF COMMON SECTION

//
// This section (upto END OF COMMON SECTION) is shared between
// preprocessor and glsl language parser.
//




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
	

glslPrimaryExpression
    : glslVariableIdentifier
    | glslIntegerConstant
    | glslUnsignedIntegerConstant
    | glslFloatConstant
    | glslDoubleConstant
    | BOOLCONSTANT 
    | LEFT_PAREN glslExpression RIGHT_PAREN 
    ;

glslIntegerConstant
	: INTCONSTANT
;  
glslUnsignedIntegerConstant
	: UINTCONSTANT
;  
glslFloatConstant
	: FLOATCONSTANT
;  
glslDoubleConstant
	: DOUBLECONSTANT
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
    | glslPostfixExpression LEFT_BRACKET glslIntegerExpression RIGHT_BRACKET 
	| glslPostfixExpression glslFunctionCallArguments
    | glslTypeSpecifier     glslConstructorCallArguments
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
	: LEFT_PAREN glslAssignmentExpression (COMMA glslAssignmentExpression)+ RIGHT_PAREN 
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


glslTypeNameList
    : glslTypeName 
    | glslTypeNameList COMMA glslTypeName 
    ;

glslTypeSpecifier
    : glslTypeSpecifierNonarray 
    | glslTypeSpecifierNonarray glslArraySpecifier 
    ;

glslArraySpecifier
    : LEFT_BRACKET RIGHT_BRACKET 
    | LEFT_BRACKET glslConstantExpression RIGHT_BRACKET 
    | glslArraySpecifier LEFT_BRACKET RIGHT_BRACKET 
    | glslArraySpecifier LEFT_BRACKET glslConstantExpression RIGHT_BRACKET 
    ;

glslTypeSpecifierNonarray
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
    | glslStructSpecifier 
    | glslTypeName 
    ;



glslStructSpecifier
    : STRUCT IDENTIFIER LEFT_BRACE  glslStructDeclarationList RIGHT_BRACE 
    | STRUCT LEFT_BRACE  glslStructDeclarationList RIGHT_BRACE 
    ;

glslStructDeclarationList
    : glslStructDeclaration 
    | glslStructDeclarationList glslStructDeclaration 
    ;

glslStructDeclaration
    : glslTypeSpecifier glslStructDeclaratorList SEMICOLON 
    | glslTypeQualifier glslTypeSpecifier glslStructDeclaratorList SEMICOLON 
    ;

glslStructDeclaratorList
    : glslStructDeclarator 
    | glslStructDeclaratorList COMMA glslStructDeclarator 
    ;

glslStructDeclarator
    : IDENTIFIER 
    | IDENTIFIER glslArraySpecifier 
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
    : glslLayoutQualifierId 
    | glslLayoutQualifierIdList COMMA glslLayoutQualifierId 
	;
	
glslLayoutQualifierId
    : IDENTIFIER 
    | IDENTIFIER EQUAL glslConstantExpression 
    | SHARED 
    ;

glslPreciseQualifier
    : PRECISE 
    ;

glslTypeQualifier
    : glslSingleTypeQualifier 
    | glslTypeQualifier glslSingleTypeQualifier 
    ;

glslSingleTypeQualifier
    : glslStorageQualifier 
    | glslLayoutQualifier 
    | glslPrecisionQualifier 
    | glslInterpolationQualifier 
    | glslInvariantQualifier 
    | glslPreciseQualifier 
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
    | SUBROUTINE 
    | SUBROUTINE LEFT_PAREN glslTypeNameList RIGHT_PAREN 
    ;

glslPrecisionQualifier
    : HIGH_PRECISION 
    | MEDIUM_PRECISION 
    | LOW_PRECISION 
    ;





// END OF COMMON SECTION

/////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////

