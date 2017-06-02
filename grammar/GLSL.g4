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
import GLSLcommon, GLSLkeyword, GLSLtoken;



//
// Added as main entry point
//
glsl
	: glslTranslationUnit EOF
	;




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
 * Thus, the statement of the last if-branch cannot be an if-
 * statement. The new rule 
 * glslNonIfStatement assembles all statements but the 
 * if-statement to differentiate those two cases.
 * 
 * Without it, ANTLR runs into ambiguous predictions, not knowing 
 * which if to associate the else branch with (even though it 
 * just needs to read from left to right ..).
 */
glslIfStatement
	: IF LEFT_PAREN glslCondition RIGHT_PAREN glslStatement     // e.g.   if(A) /* nothing */ if(B){..} else;
	| IF LEFT_PAREN glslCondition RIGHT_PAREN glslNonIfStatement ELSE glslStatement // if with else branch
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



