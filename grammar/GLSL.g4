//
// This grammar is taken of the reference implementation of
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
import GLSLcommon, GLSLkeyword, GLSLtoken;



//
// Added as main entry point
//
glsl
	: glslTranslationUnit
	;




/* Grammar Note: 
 * The following three rules have been introduced to aid 
 * semantic analysis in resolving variable or type 
 * qualification declarators:
 * 1. glslVariableQualificationList
 * 2. glslVariableOrTypeQualification
 * 3. glslTypeQualifier glslKnownTypeSpecifier glslVariableDeclarations?
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
 */    

glslDeclaration
    : glslTypeQualifier SEMICOLON 
    | glslTypePrecisionDeclaration SEMICOLON

    | glslTypeQualifier glslIdentifier SEMICOLON // semantic analysis has to decide whether identifier is type or variable

    | glslTypeQualifier glslVariableIdentifier (COMMA glslVariableIdentifier)+ SEMICOLON
    | glslTypeQualifier glslTypeName glslVariableDeclarations SEMICOLON
    | glslTypeQualifier glslTypeName glslArrayDimension+ glslVariableDeclarations? SEMICOLON
    | glslTypeQualifier glslBuiltinType glslArrayDimension* glslVariableDeclarations? SEMICOLON
    | glslTypeQualifier glslStructSpecifier glslArrayDimension* glslVariableDeclarations? SEMICOLON
    
    | glslTypeSpecifier glslVariableDeclarations? SEMICOLON
    | glslInterfaceBlockStructure (glslVariableIdentifier glslArrayDimension*)? SEMICOLON 
    | glslFunctionPrototype SEMICOLON 
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

/**
 * Statement block immediately following 
 * a for loop header or a function prototype. 
 * In this case, either the for loop header 
 * or the function header already established 
 * a new scope. Thus, for example variables
 * will be declared in the same scope as the
 * parameters.
 */
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
    : WHILE LEFT_PAREN glslCondition RIGHT_PAREN glslStatementNoNewScope 
    | DO glslStatement WHILE LEFT_PAREN glslExpression RIGHT_PAREN SEMICOLON 
    | FOR LEFT_PAREN glslForInitStatement glslForRestStatement RIGHT_PAREN glslStatementNoNewScope 
    ;

glslForInitStatement
    : glslExpressionStatement 
    | glslDeclarationStatement 
    ;

glslForRestStatement
    : glslCondition? SEMICOLON glslExpression?
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



