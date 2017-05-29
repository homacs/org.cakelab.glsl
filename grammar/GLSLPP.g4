//
// This grammar is taken from the specification of 
// "The OpenGL Shading Language" version 4.5 
// (revision 6) and accordingly extended by the rules
// of the standard C preprocessor language, taken 
// from the ISO/IEC 9899:201x standard titled 
// "Programming Languages -- C".
//


grammar GLSLPP;

//
// Order of imported rules equals order of grammars in import statement!
// GLSLtoken must be last!
// 
import GLSLcommon, GLSLPPkeyword, GLSLkeyword, GLSLtoken;

@members {
	
	
	/**
	 * This method checks whether the previous token on hidden channel
	 * equals tokenType.
	 * 
	 * The current token is always the next token to be consumed. 
	 * Thus, the previous token is always the token that was just 
	 * consumed.
	 * 
	 */
	private boolean hidden(int tokenType) {
		CommonTokenStream stream = ((CommonTokenStream)this._input);
		java.util.List<Token> tokens = stream.getHiddenTokensToLeft(stream.index());
		if (tokens != null && !tokens.isEmpty()) {
			return tokens.get(tokens.size()-1).getType() == tokenType;
		} else {
			return false;
		}
	}
	
	
}


/**
 * Main entry point of the preprocessor parser.
 * The preprocessor considers the text to be
 * a set of lines where each line is either a
 * directive or a text line. The latter is simply ignored.
 */
glslpp
	: glslppPreprocessingFile
	;


glslppPreprocessingFile
	: glslppGroup?
	;

glslppGroup
	: glslppGroupPart+
	;

glslppGroupPart
	: glslppIfSection
	| glslppControlLine
	| glslppTextLine
	;

glslppIfSection
	: glslppIfGroup  glslppElifGroups? glslppElseGroup? glslppEndifLine
	;

glslppIfGroup
	: PPIF glslConstantExpression  CRLF  glslppGroup?
	| PPIFDEF glslppIdentifier  CRLF  glslppGroup?
	| PPIFNDEF glslppIdentifier  CRLF  glslppGroup?
	;

glslppElifGroups
	: glslppElifGroup+
	;

glslppElifGroup
	: PPELIF glslConstantExpression  CRLF  glslppGroup?
	;

glslppElseGroup
	: PPELSE CRLF glslppGroup?
	;

glslppEndifLine
	: PPENDIF CRLF
	;

glslppControlLine
	: PPINCLUDE glslppHeaderName  CRLF
	| PPDEFINE glslppMacro  CRLF
	| PPUNDEF glslppIdentifier  CRLF
	| PPLINE glslppTokens  CRLF
	| PPERROR glslppTokens? CRLF
	| PPPRAGMA glslppTokens? CRLF
	| PPEXTENSION glslppIdentifier COLON glslppExtensionBehaviour CRLF
	| PPVERSION glslIntegerConstant glslppProfile CRLF
	| HASH CRLF                 /* empty directive */
	| HASH glslppNonDirective   /* ignored directive */
	;


/** 
 * Macros with parameters cannot have whitespace 
 * between the IDENTIFIER and LEFT_PAREN.
 * Whitespace usually goes to ->channel(HIDDEN) 
 * and thus, we need to explicitly check them here.
 * 
 * The method hidden is defined in the @members section above.
 */
glslppMacro 
	: IDENTIFIER 
		(
		 { hidden(WHITESPACE)}? glslppReplacementList
		|{!hidden(WHITESPACE)}? LEFT_PAREN glslppMacroArguments  RIGHT_PAREN glslppReplacementList
		| /* empty */
		)
	;
	
glslppMacroArguments
	: glslppIdentifierList?
	| (glslppIdentifierList COMMA)? DOTS
	;



glslppExtensionBehaviour
	: 'require'
	| 'enable'
	| 'warn'
	| 'disable'
	;

glslppProfile
	: 'core'
	| 'compatibility'
	| 'es'
	;

glslppIdentifierList
	: IDENTIFIER (COMMA IDENTIFIER)*
	;

/** Any line not starting with # */
glslppTextLine
	:  ~(HASH
		|PPIF
		|PPIFDEF
		|PPIFNDEF
		|PPELIF
		|PPELSE
		|PPENDIF
		|PPINCLUDE
		|PPDEFINE
		|PPUNDEF
		|PPLINE
		|PPERROR
		|PPPRAGMA
		|PPEXTENSION
		|PPVERSION
		) ~CRLF* CRLF
	| CRLF
	;

glslppNonDirective
	: glslppTokens? CRLF
	;

glslppReplacementList
	: glslppTokens?
	;
	

glslppTokens
	: glslppPreprocessingToken+
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




glslppIdentifier 
	: IDENTIFIER
	;

glslppNumber
	: glslIntegerConstant
	| glslUnsignedIntegerConstant
	| glslDoubleConstant
	| glslFloatConstant
	;

glslppSign
	: (PLUS|DASH)?
	;

glslppPunctuator
	: LEFT_BRACKET 
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
	
	| HASH
	| PPOP_CONCAT
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
		
		| HASH
		| PPOP_CONCAT
	)
	;


