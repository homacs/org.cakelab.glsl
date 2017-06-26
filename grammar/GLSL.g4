//
// This grammar is derived from the reference implementation of
// a GLSL parser published by the Khronos Group (see 
// copyright notice below).
//
// This grammar is slightly modified: 
//    All code snippets for semantic analysis have been removed 
//    a header for ANTLR4 has been added,
//    rule names have been renamed (see renaming below),
//    rules have been simplified according to ANTLR4 capabilities,
//    and the following rules have been modified to comply with 
//    ANTLR4:
//    + postfix_expression (aka. glslPostfixExpression)
//
// Renaming of Rule Names:
//    Original rule names have been converted in CamelCase format
//    underscores have been removed.
//    'glsl' has been added as common prefix for all rules
//


// FOLLOWING IS THE COPYRIGHT NOTICE OF THE AUTHORS OF THE ORIGINAL
// RULE SET (see glslang-raw-unmodified.y).
//
//Copyright (C) 2002-2005  3Dlabs Inc. Ltd.
//Copyright (C) 2012-2013 LunarG, Inc.
//
//All rights reserved.
//
//Redistribution and use in source and binary forms, with or without
//modification, are permitted provided that the following conditions
//are met:
//
//    Redistributions of source code must retain the above copyright
//    notice, this list of conditions and the following disclaimer.
//
//    Redistributions in binary form must reproduce the above
//    copyright notice, this list of conditions and the following
//    disclaimer in the documentation and/or other materials provided
//    with the distribution.
//
//    Neither the name of 3Dlabs Inc. Ltd. nor the names of its
//    contributors may be used to endorse or promote products derived
//    from this software without specific prior written permission.
//
//THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
//"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
//LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
//FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
//COPYRIGHT HOLDERS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
//INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
//BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
//LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
//CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
//LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
//ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
//POSSIBILITY OF SUCH DAMAGE.
//
grammar GLSL;

//
// Order of imported rules equals order of grammars in import statement!
// GLSLtoken must be last!
// 
import GLSLkeyword, GLSLtoken;

//
// Added as main entry point for language parsing
//
glsl
	: glslTranslationUnit EOF
	;




///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
////
////         L A N G U A G E    R U L E S
////
///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////



/* Grammar Note: 
 * Declarations with a type qualifier have been changed to aid 
 * semantic analysis in resolving variable or type 
 * qualification declarators due to the following reason.
 * 
 * GLSL allows to redefine the qualifier
 * for a variable like that:
 * <qualifier> <variable> ;
 * and it also allows prototyping of types like that:
 * <qualifier> <type> ;
 * 
 * Unfortunately type and variable names appear at the 
 * parser as IDENTIFIER tokens. Thus, the parser cannot
 * differentiate between both unless: (a) the identifier 
 * is followed by a list of identifiers or (b) the 
 * identifier is followed by brackets (indicating an array type)
 * or (c) there is no identifier but a builtin type or struct declaration.
 * 
 * Affected rules have been split up into there respective cases and new
 * rules (glslTypeName and glslVairableIdentifier) have been added to
 * differentiate from the rule in question:
 * 
 *     glslTypeQualifier glslIdentifier SEMICOLON
 * 
 * This rule is now the only one using an unspecified identifier.
 * Semantic analysis can easily tell, whether the identifier is
 * a type or variable name to decide whether it is the 
 * declaration of qualified type or a redefinition of 
 * the qualifier for a variable.
 * 
 */    

glslDeclaration
    : glslTypeQualifier 
    | glslTypePrecisionDeclaration

    | glslTypeQualifier glslIdentifier // semantic analysis has to decide whether identifier is type or variable

    | glslTypeQualifier glslVariableIdentifier (COMMA glslVariableIdentifier)+
    | glslTypeQualifier glslTypeName glslVariableDeclarations
    | glslTypeQualifier glslTypeName glslArrayDimension+ glslVariableDeclarations?
    | glslTypeQualifier glslBuiltinType glslArrayDimension* glslVariableDeclarations?
    | glslTypeQualifier glslStructSpecifier glslArrayDimension* glslVariableDeclarations?
    
    | glslTypeSpecifier glslVariableDeclarations?
    | glslInterfaceBlockStructure (glslVariableIdentifier glslArrayDimension*)? 
    | glslFunctionPrototype 
    ;


glslDeclarationStatement
	: glslDeclaration SEMICOLON
	;

    
glslTypePrecisionDeclaration
	: PRECISION glslPrecisionQualifier glslTypeSpecifier
	;


glslVariableDeclarations
	: glslVariableDeclarator (COMMA glslVariableDeclarator)*
	;


/**
 * Interface block.
 */
glslInterfaceBlockStructure
    : glslTypeQualifier IDENTIFIER glslStructBody
    ;


glslFunctionPrototype
    : glslFullySpecifiedType glslFunctionName LEFT_PAREN glslFunctionParameters? RIGHT_PAREN
    ;

glslFunctionParameters: 
	glslParameterDeclaration (COMMA glslParameterDeclaration)*
;


glslParameterDeclaration
    : glslTypeQualifier? glslTypeSpecifier (glslVariableIdentifier glslArrayDimension*)? 
    ;


glslVariableDeclarator
	: glslVariableIdentifier glslArrayDimension* (EQUAL glslInitializer)?
	;




	
// Grammar Note:  No 'enum', or 'typedef'.

glslFullySpecifiedType
    : glslTypeQualifier? glslTypeSpecifier  
    ;

glslInitializer
    : glslAssignmentExpression 
    | LEFT_BRACE glslInitializer (COMMA glslInitializer)* COMMA? RIGHT_BRACE 
    ;


glslStatement
    : glslCompoundStatement  
    | glslSimpleStatement    
    ;

glslSimpleStatement
    : glslDeclarationStatement
    | glslExpressionStatement
    | glslIfStatement
    | glslSwitchStatement
    | glslWhileStatement
    | glslDoWhileStatement
    | glslForStatement
    | glslJumpStatement
    ;




glslCompoundStatement
    : LEFT_BRACE glslStatement* RIGHT_BRACE 
    ;
	
glslExpressionStatement
    : glslExpression? SEMICOLON  
    ;

/**
 * Note: Else-branch is always associated with the last if-branch.
 * Thus, the statement of the preceding if-branch cannot be an if-
 * statement. The new rule glslNonIfStatement assembles all 
 * statements but the if-statement to differentiate those cases.
 * 
 * Without it, ANTLR runs into ambiguous predictions, not knowing 
 * which if to associate the else branch with (even though it 
 * just needs to read from left to right ..).
 */
glslIfStatement
	: IF LEFT_PAREN glslCondition RIGHT_PAREN glslStatement     // includes for example  if(A) /* nothing */ if(B){..} else;
	| IF LEFT_PAREN glslCondition RIGHT_PAREN glslNonIfStatement ELSE glslStatement // single if with else branch
	;

/**
 * Any statement but if-statement.
 * 
 * Used to identify the last if-branch before an else-branch.
 */
glslNonIfStatement
	: glslCompoundStatement
	| glslDeclarationStatement
    | glslExpressionStatement
    | glslSwitchStatement
    | glslWhileStatement
    | glslDoWhileStatement
    | glslForStatement
    | glslJumpStatement;


glslSwitchStatement
	: SWITCH LEFT_PAREN glslCondition RIGHT_PAREN LEFT_BRACE glslSwitchSubStatement* RIGHT_BRACE
	;

glslSwitchSubStatement
	: CASE glslIntegerExpression COLON 
    | DEFAULT COLON 
    | glslStatement
	;


glslCondition
    // In 1996 c++ draft, conditions can include single declarations
    : glslExpression 
    | glslFullySpecifiedType glslVariableIdentifier EQUAL glslInitializer 
    ;


glslWhileStatement
	: WHILE LEFT_PAREN glslCondition RIGHT_PAREN glslStatement
	;

glslDoWhileStatement
	: DO glslStatement WHILE LEFT_PAREN glslExpression RIGHT_PAREN SEMICOLON 
	;
    
glslForStatement
	: FOR LEFT_PAREN glslForInitExpression? SEMICOLON glslCondition? SEMICOLON glslExpression? RIGHT_PAREN glslStatement
	;

glslForInitExpression
    : glslExpression
    | glslDeclaration
    ;
    

glslJumpStatement
    : CONTINUE SEMICOLON 
    | BREAK SEMICOLON 
    | RETURN glslExpression? SEMICOLON 
    | DISCARD SEMICOLON 
    ;

// Grammar Note:  No 'goto'.  Gotos are not supported.

glslTranslationUnit
    : glslExternalDeclaration*
    ;

glslExternalDeclaration
    : glslFunctionDefinition 
    | glslDeclarationStatement 
    ;

glslFunctionDefinition
    : glslFunctionPrototype glslCompoundStatement
    ;



///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
////
////         C O M M O N    R U L E S
////
///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////



/** Identifier following a swizzle ('.') */
glslFieldSelection
	: IDENTIFIER
	;

/** any unknown identifier can be a variable, 
 * function or type name.
 */
glslIdentifier
    : IDENTIFIER
    ;
    
/** Identifier, known to be a user defined type. */
glslTypeName
	: IDENTIFIER
	;

/** Identifier in variable/parameter declaration or use. */
glslVariableIdentifier
	: IDENTIFIER
	;

/** Any identifier considered to be a function name. 
 */
glslFunctionName
	: IDENTIFIER
	;

glslBoolConstant
	: BOOLCONSTANT
	;

glslIntegerConstant
	: INTCONSTANT
	;

/** any positive integer postponed by [uU] */
glslUnsignedIntegerConstant
	: UINTCONSTANT
	;

glslFloatConstant
	: FLOATCONSTANT
	;

glslDoubleConstant
	: DOUBLECONSTANT
	;

glslPrimaryExpression
    : glslIdentifier // semantic analyses has to decide whether its type, function or variable
    | glslBuiltinType
    | glslStructSpecifier
    | glslFloatConstant
    | glslDoubleConstant
    | glslIntegerConstant
    | glslUnsignedIntegerConstant
    | glslBoolConstant 
    | LEFT_PAREN glslExpression RIGHT_PAREN 
    ;
    

//
// Grammar Translation:
// ====================
// Rules function and constructor calls and all referenced 
// rules had to be replaced to resolve mutually left recursion.
// Token TYPE_NAME has also been removed as it represented 
// semantic analysis to be performed by the lexer. Instead 
// user specified types are now simply IDENTIFIERS and builtin
// types and struct declarations had to be added to primary_expression. As a consequence
// (a) differentiation between constructor and function calls 
// now fully relies on semantic analysis and (b) array _types_
// have to be differentiated from array _references_ by semantic
// analysis as well. This results in cleaner error reporting
// and rules. This also allows function overriding, as stated
// in the GLSL specification, which is not possible with the
// rule set of the reference implementation.
//
// As a side effect it also allows to use types in primary 
// expressions. Thus, such misuse of types has to be identified 
// by semantic analysis as well.
//
// An advantage is, that parsers now can parse without semantic 
// analysis as well.
//
glslPostfixExpression
    : glslPrimaryExpression 
    | glslPostfixExpression glslCallArguments // this rule can evaluate to a function or constructor call depending on the preceding postfix_expression.
    | glslPostfixExpression glslArrayDimension // this rule might refer to a type (e.g. float[]) or an array reference (e.g. array[i])
    | glslPostfixExpression DOT glslFieldSelection
    | glslPostfixExpression INC_OP
    | glslPostfixExpression DEC_OP
    ;
   
/**
 * Arguments to function or constructor call.
 */
glslCallArguments 
	: LEFT_PAREN glslAssignmentExpression (COMMA glslAssignmentExpression)* RIGHT_PAREN 
    | LEFT_PAREN VOID? RIGHT_PAREN 
	;

/**
 * Expression which has to evaluate to an integer.
 */
glslIntegerExpression
    : glslExpression 
    ;

glslUnaryExpression
    : glslPostfixExpression 
    | glslUnaryOperator glslUnaryExpression 
    ;
// Grammar Note:  No traditional style type casts.

glslUnaryOperator
    : INC_OP
    | DEC_OP
    | PLUS  
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
    | glslLogicalOrExpression QUESTION glslExpression COLON glslAssignmentExpression 
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
    : glslAssignmentExpression (COMMA glslAssignmentExpression)*
    ;

glslConstantExpression
    : glslConditionalExpression 
    ;


////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////


glslFunctionNameList
    : glslFunctionName (COMMA glslFunctionName)*
    ;
    
glslTypeSpecifier
    : glslTypeSpecifierNonarray glslArrayDimension*
    ;

glslArrayDimension
	: LEFT_BRACKET glslIntegerExpression? RIGHT_BRACKET
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


/** 
 * Declares a struct.
 *  
 * Grammar Note: Anonymous structs are actually 
 * disallow (see GLSL spec.), but have been considered in the reference
 * implementation. We keep it here for reference but will
 * report them as warning in semantic analysis.
 */
glslStructSpecifier
    : STRUCT IDENTIFIER glslStructBody
    ;

glslStructBody
	: LEFT_BRACE  glslStructMemberGroup+ RIGHT_BRACE
	;

/**
 * A set of struct members of the same type in a line like
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
    : IDENTIFIER glslArrayDimension*
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




