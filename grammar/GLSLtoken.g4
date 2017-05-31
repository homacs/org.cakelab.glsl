lexer grammar GLSLtoken;


@members{
	public boolean preprocessing = false;
	public void preprocessing(boolean enable) {
		preprocessing = enable;
	}
	private org.cakelab.glsl.parser.Validator validator = new org.cakelab.glsl.parser.Validator();
	public void setValidator(org.cakelab.glsl.parser.Validator validator) {
		this.validator = validator;
	}
	
}


PPOP_DEFINED: 'defined' {preprocessing}?;

//////////////////////////////////////
// W H I T E   S P A C E   E T C.
//////////////////////////////////////

WHITESPACE
	: [ \t]+ -> channel(HIDDEN)
;


/** Line end. Visible only when preprocessing. 
 * See also HIDDEN_CRLF.
 */
CRLF
	: '\r'? '\n' {preprocessing}?
;

/** Alternative rule to CRLF. Active only when not preprocessing. */
HIDDEN_CRLF
	: '\r'? '\n' {!preprocessing}? -> channel(HIDDEN)
;

/**
 * Escaped line end which acts as line continuation.
 */
LINE_CONTINUATION
	: ('\\\n' 
	| '\\\r\n') -> channel(HIDDEN)
;


MULTILINE_COMMENT: '/*' ((~'*')|('*' ~'/'))* '*/' -> channel(HIDDEN);
SINGLELINE_COMMENT: '//' ~'\n'*  -> channel(HIDDEN);




//////////////////////////////////////
//       C O N S T A N T S
//////////////////////////////////////


// Grammar Note: reserved identifiers
BOOLCONSTANT: 'true' | 'false';



FLOATCONSTANT
	: (
			(FLOATRAW EXPONENT?)
			|(HEXFLOATRAW BINARY_EXPONENT?)
			| NUMBER
	) [fF]
	;

DOUBLECONSTANT
	: (
		 (FLOATRAW    EXPONENT?)
		|(HEXFLOATRAW BINARY_EXPONENT?)
	) [lL]?
	;

fragment FLOATRAW: (DIGIT+ '.' DIGIT*) | (DIGIT* '.' DIGIT+);
fragment HEXFLOATRAW: '0'[xX] 
		(
			(HEXADECIMAL_DIGIT+ '.' HEXADECIMAL_DIGIT*) 
		| 
			(HEXADECIMAL_DIGIT* '.' HEXADECIMAL_DIGIT+)
		)
;
fragment EXPONENT: [eE] SIGN? DECIMAL;
fragment BINARY_EXPONENT: [pP] SIGN? DECIMAL;

INTCONSTANT: NUMBER [lL]?;
UINTCONSTANT: NUMBER [uU][lL]?;



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
	LEFT_ANGLE S_CHAR_SEQUENCE RIGHT_ANGLE
;

PREFIXED_STRING_LITERAL
	: ENCODING_PREFIX '"' S_CHAR_SEQUENCE? '"'
;

LEFT_OP: '<<';
RIGHT_OP: '>>';
INC_OP: '++';
DEC_OP: '--';
LE_OP: '<=';
GE_OP: '>=';
EQ_OP: '==';
NE_OP: '!=';
AND_OP: '&&';
OR_OP: '||';
XOR_OP: '^^';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '\\=';
ADD_ASSIGN: '+=';
MOD_ASSIGN: '%=';
LEFT_ASSIGN: '<<=';
RIGHT_ASSIGN: '>>=';
AND_ASSIGN: '&=';
XOR_ASSIGN: '^=';
OR_ASSIGN: '|=';
SUB_ASSIGN: '-=';
LEFT_PAREN: '(';
RIGHT_PAREN: ')';
LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';
LEFT_BRACE: '{';
RIGHT_BRACE: '}';
DOT: '.';
COMMA: ',';
COLON: ':';
EQUAL: '=';
SEMICOLON: ';';
BANG: '!';
DASH: '-';
TILDE: '~';
PLUS: '+';
STAR: '*';
SLASH: '/';
PERCENT: '%';
LEFT_ANGLE: '<';
RIGHT_ANGLE: '>';
VERTICAL_BAR: '|';
CARET: '^';
AMPERSAND: '&';
QUESTION: '?';




HASH: '#';
PPOP_CONCAT: '##';
DOTS: '...';

//////////////////////////////////////
// N O N S T A N D A R D   E X T E N T
//////////////////////////////////////

DOUBLE_QUOTE: '"';
SINGLE_QUOTE: '\'';


//////////////////////////////////////
//       I D E N T I F I E R S
//////////////////////////////////////


/**
 * Every IDENTIFIER which might be a variable, function or type name.
 */
IDENTIFIER: NONDIGIT (DIGIT | NONDIGIT)*;






//////////////////////////////////////
//       F R A G M E N T S
//////////////////////////////////////
// Will not occur as actual tokens, but
// as part of other tokens.




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


fragment HEXADECIMAL: '0' [xX] HEXADECIMAL_DIGIT+;
fragment OCTAL: '0' OCTAL_DIGIT+;
fragment DECIMAL: '0' | DEC_NONZERO DIGIT*;
fragment OCT_NONZERO: [1-7];
fragment DEC_NONZERO: OCT_NONZERO |[89];
fragment NUMBER: OCTAL|HEXADECIMAL|DECIMAL;
fragment ALPHA: [a-zA-Z];
fragment SIGN: [+-];
fragment NONDIGIT: ALPHA | '_';
fragment OCTAL_DIGIT: '0' | OCT_NONZERO;
fragment DIGIT: '0' | DEC_NONZERO;
fragment HEXADECIMAL_DIGIT: DIGIT | [a-fA-F];
