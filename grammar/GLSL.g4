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

import GLSLcommon, GLSLkeyword, GLSLtoken;

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



