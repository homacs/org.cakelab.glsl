//
// This grammar is taken from the specification of 
// "The OpenGL Shading Language" version 4.5 
// (revision 6) and accordingly extended by the rules
// of the standard C preprocessor language, taken 
// from the ISO/IEC 9899:201x standard titled 
// "Programming Languages -- C".
//


// TODO: try to consolidate tokens again with either modes but probably predicates.
// when doing this, consider directives in glsl parser such as #version and #line.

lexer grammar GLSLPPtoken;

import GLSLPPkeyword, GLSLtoken_base;
@members{
	public static boolean preprocessing = false;
}


HASH: '#';

PPOP_CONCAT: '##';
//////////////////////////////////////
// N O N S T A N D A R D   E X T E N T
//////////////////////////////////////

DOUBLE_QUOTE: '"';
SINGLE_QUOTE: '\'';


DOTS: '...';

/** identifier immediately (i.e. without whitespace) followed by left parenthesis.
 * Required to differentiate macros with parameters from macros without 
 * parameters followed by a term in parentheses.
 */
IDENTIFIER_LEFT_PAREN: IDENTIFIER LEFT_PAREN;

//////////////////////////////////////
// W H I T E   S P A C E   E T C.
//////////////////////////////////////


CRLF
	: '\r'? '\n' {preprocessing}?
;

HIDDEN_CRLF
	: '\r'? '\n' {!preprocessing}? -> channel(HIDDEN)
;

WHITESPACE
	: [ \t]+ -> channel(HIDDEN)
;
/**
 * Escaped line end which acts as line continuation.
 */
LINE_CONTINUATION
	: ('\\\n' 
	| '\\\r\n') -> channel(HIDDEN)
;



//////////////////////////////////////
// S T R I N G S  (non-standard)
//////////////////////////////////////



CHARACTER_CONSTANT
	: '\'' C_CHAR_SEQUENCE '\''
;

PREFIXED_CHARACTER_CONSTANT
	: 'L' '\'' C_CHAR_SEQUENCE '\''
	| 'u' '\'' C_CHAR_SEQUENCE '\''
	| 'U' '\'' C_CHAR_SEQUENCE '\''
;

STRING_LITERAL
	: '"' S_CHAR_SEQUENCE? '"'
;
STD_HEADER_NAME:
	LEFT_ANGLE IDENTIFIER RIGHT_ANGLE
;

PREFIXED_STRING_LITERAL
	: ENCODING_PREFIX '"' S_CHAR_SEQUENCE? '"'
;

fragment ENCODING_PREFIX
	: 'u8'
	| 'u'
	| 'U'
	| 'L'
;

fragment S_CHAR_SEQUENCE
	: S_CHAR+
;

fragment C_CHAR_SEQUENCE:
	C_CHAR+ 
;
fragment ESCAPE_SEQUENCE
	: SIMPLE_ESCAPE_SEQUENCE
	| OCTAL_ESCAPE_SEQUENCE
	| HEXADECIMAL_ESCAPE_SEQUENCE
	| UNIVERSAL_CHARACTER_NAME
;

fragment UNIVERSAL_CHARACTER_NAME
	: '\\u' HEX_QUAD
	| '\\U' HEX_QUAD  HEX_QUAD
;
fragment HEX_QUAD
	: HEXADECIMAL_DIGIT  HEXADECIMAL_DIGIT HEXADECIMAL_DIGIT  HEXADECIMAL_DIGIT
;

fragment SIMPLE_ESCAPE_SEQUENCE
	: '\\\'' 
	| '\\"' 
	| '\\?' 
	| '\\\\'
	| '\\a' 
	| '\\b' 
	| '\\f' 
	| '\\n' 
	| '\\r' 
	| '\\t' 
	| '\\v'
;

fragment OCTAL_ESCAPE_SEQUENCE
	: '\\' OCTAL_DIGIT (OCTAL_DIGIT OCTAL_DIGIT?)?
;


fragment HEXADECIMAL_ESCAPE_SEQUENCE:
	'\\x' HEXADECIMAL_DIGIT+
;



fragment S_CHAR
	: ~["\\\n]
	| [ \t]
	| LINE_CONTINUATION
	| ESCAPE_SEQUENCE
;

fragment C_CHAR
	: ~['\\\n]
	| [ \t]
	| LINE_CONTINUATION
	| ESCAPE_SEQUENCE
;


