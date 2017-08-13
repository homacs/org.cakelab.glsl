lexer grammar GLSLtoken;


//////////////////////////////////////
// W H I T E   S P A C E   E T C.
//////////////////////////////////////

WHITESPACE
	: [ \t\r\n]+ -> channel(HIDDEN)
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
			|(NUMBER EXPONENT)
			|(HEXFLOATRAW BINARY_EXPONENT?)
			| NUMBER
	) [fF]
	;

DOUBLECONSTANT
	: (
		 (FLOATRAW    EXPONENT?)
		|(NUMBER EXPONENT)
		|(HEXFLOATRAW BINARY_EXPONENT?)
	) [lL]?
	;

INTCONSTANT: NUMBER [lL]?;
UINTCONSTANT: NUMBER [uU][lL]?;



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
DIV_ASSIGN: '/=';
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
