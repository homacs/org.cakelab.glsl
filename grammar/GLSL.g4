//
// This grammar is taken of the reference implementation of
// a GLSL parser published by the Khronos Group (see 
// copyright notice below).
//
// This grammar is slightly modified: 
//    All code snippets for semantic analysis have been removed 
//    a header for ANTLR4 has been added
//    rule names have been renamed (see renaming below)
//    and the following rules have been modified to comply with 
//    ANTLR4:
//    + postfix_expression (aka. glslPostfixExpression)
//
// Renaming or Rule Names:
//    Original rule names have been converted in CamelCase format
//    underscores have been removed.
//    'glsl' has been added as common prefix for all rules
//


// FOLLOWING IS THE COPYRIGHT NOTICE OF THE AUTHORS OF THE ORIGINAL
// rule set (see glslang.y).
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

import GLSLkeyword, GLSLtoken, GLSLtoken_base;

//
// Added as main entry point
//
glsl
	: glslTranslationUnit
	;





glslDeclaration
    : glslFunctionPrototype SEMICOLON 
    | glslInitDeclaratorList SEMICOLON 
    | PRECISION glslPrecisionQualifier glslTypeSpecifier SEMICOLON 
    | glslBlockStructure SEMICOLON 
    | glslBlockStructure IDENTIFIER SEMICOLON 
    | glslBlockStructure IDENTIFIER glslArraySpecifier SEMICOLON 
    | glslTypeQualifier SEMICOLON 
    | glslTypeQualifier IDENTIFIER SEMICOLON 
    | glslTypeQualifier IDENTIFIER glslIdentifierList SEMICOLON 
    ;

glslBlockStructure
    : glslTypeQualifier IDENTIFIER LEFT_BRACE  glslStructDeclarationList RIGHT_BRACE 
    ;

glslIdentifierList
    : COMMA IDENTIFIER 
    | glslIdentifierList COMMA IDENTIFIER 
    ;

glslFunctionPrototype
    : glslFunctionDeclarator RIGHT_PAREN  
    ;

glslFunctionDeclarator
    : glslFunctionHeader 
    | glslFunctionHeaderWithParameters 
    ;


glslFunctionHeaderWithParameters
    : glslFunctionHeader glslParameterDeclaration 
    | glslFunctionHeaderWithParameters COMMA glslParameterDeclaration 
    ;

glslFunctionHeader
    : glslFullySpecifiedType IDENTIFIER LEFT_PAREN 
    ;

glslParameterDeclarator
    // Type + name
    : glslTypeSpecifier IDENTIFIER 
    | glslTypeSpecifier IDENTIFIER glslArraySpecifier 
    ;

glslParameterDeclaration
    //
    // With name
    //
    : glslTypeQualifier glslParameterDeclarator 
    | glslParameterDeclarator 
    //
    // Without name
    //
    | glslTypeQualifier glslParameterTypeSpecifier 
    | glslParameterTypeSpecifier 
    ;

glslParameterTypeSpecifier
    : glslTypeSpecifier 
    ;

glslInitDeclaratorList
    : glslSingleDeclaration 
    | glslInitDeclaratorList COMMA IDENTIFIER 
    | glslInitDeclaratorList COMMA IDENTIFIER glslArraySpecifier 
    | glslInitDeclaratorList COMMA IDENTIFIER glslArraySpecifier EQUAL glslInitializer 
    | glslInitDeclaratorList COMMA IDENTIFIER EQUAL glslInitializer 
    ;

glslSingleDeclaration
    : glslFullySpecifiedType 
    | glslFullySpecifiedType IDENTIFIER 
    | glslFullySpecifiedType IDENTIFIER glslArraySpecifier 
    | glslFullySpecifiedType IDENTIFIER glslArraySpecifier EQUAL glslInitializer 
    | glslFullySpecifiedType IDENTIFIER EQUAL glslInitializer 
	;
	
// Grammar Note:  No 'enum', or 'typedef'.

glslFullySpecifiedType
    : glslTypeSpecifier 
    | glslTypeQualifier glslTypeSpecifier  
    ;


glslInitializer
    : glslAssignmentExpression 
    | LEFT_BRACE glslInitializerList RIGHT_BRACE 
    | LEFT_BRACE glslInitializerList COMMA RIGHT_BRACE 
    ;

glslInitializerList
    : glslInitializer 
    | glslInitializerList COMMA glslInitializer 
    ;

glslDeclarationStatement
    : glslDeclaration 
    ;

glslStatement
    : glslCompoundStatement  
    | glslSimpleStatement    
    ;

// Grammar Note:  labeled statements for switch statements only; 'goto' is not supported.

glslSimpleStatement
    : glslDeclarationStatement 
    | glslExpressionStatement  
    | glslSelectionStatement   
    | glslSwitchStatement      
    | glslCaseLabel            
    | glslIterationStatement   
    | glslJumpStatement        
    ;

glslCompoundStatement
    : LEFT_BRACE RIGHT_BRACE 
    | LEFT_BRACE 
      glslStatementList 
      RIGHT_BRACE 
    ;

glslStatementNoNewScope
    : glslCompoundStatementNoNewScope 
    | glslSimpleStatement                
    ;

glslStatementScoped
    : glslCompoundStatement  
    | glslSimpleStatement 
	;
	
glslCompoundStatementNoNewScope
    // Statement that doesn't create a new scope, for selection_statement, iteration_statement
    : LEFT_BRACE RIGHT_BRACE 
    | LEFT_BRACE glslStatementList RIGHT_BRACE 
    ;

glslStatementList
    : glslStatement 
    | glslStatementList glslStatement 
    ;

glslExpressionStatement
    : SEMICOLON  
    | glslExpression SEMICOLON  
    ;

glslSelectionStatement
    : IF LEFT_PAREN glslExpression RIGHT_PAREN glslSelectionRestStatement 
    ;

glslSelectionRestStatement
    : glslStatementScoped ELSE glslStatementScoped 
    | glslStatementScoped 
    ;

glslCondition
    // In 1996 c++ draft, conditions can include single declarations
    : glslExpression 
    | glslFullySpecifiedType IDENTIFIER EQUAL glslInitializer 
    ;

glslSwitchStatement
    : SWITCH LEFT_PAREN glslExpression RIGHT_PAREN 
    LEFT_BRACE glslSwitchStatementList RIGHT_BRACE 
    ;

glslSwitchStatementList
    : /* nothing */ 
    | glslStatementList 
    ;

glslCaseLabel
    : CASE glslExpression COLON 
    | DEFAULT COLON 
    ;

glslIterationStatement
    : WHILE LEFT_PAREN 
      glslCondition RIGHT_PAREN glslStatementNoNewScope 
    | DO 
      glslStatement WHILE LEFT_PAREN glslExpression RIGHT_PAREN SEMICOLON 
    | FOR LEFT_PAREN 
      glslForInitStatement glslForRestStatement RIGHT_PAREN glslStatementNoNewScope 
    ;

glslForInitStatement
    : glslExpressionStatement 
    | glslDeclarationStatement 
    ;

glslConditionopt
    : glslCondition 
    | /* May be null */ 
    ;

glslForRestStatement
    : glslConditionopt SEMICOLON 
    | glslConditionopt SEMICOLON glslExpression  
    ;

glslJumpStatement
    : CONTINUE SEMICOLON 
    | BREAK SEMICOLON 
    | RETURN SEMICOLON 
    | RETURN glslExpression SEMICOLON 
    | DISCARD SEMICOLON 
    ;

// Grammar Note:  No 'goto'.  Gotos are not supported.

glslTranslationUnit
    : glslExternalDeclaration+
    | EOF
    ;

glslExternalDeclaration
    : glslFunctionDefinition 
    | glslDeclaration 
    ;

glslFunctionDefinition
    : glslFunctionPrototype glslCompoundStatementNoNewScope 
    ;



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






