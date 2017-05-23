lexer grammar GLSLtoken_base;


MULTILINE_COMMENT: '/*' ((~'*')|('*' ~'/'))* '*/' -> channel(HIDDEN);
SINGLELINE_COMMENT: '//' ~'\n'*  -> channel(HIDDEN);



// Grammar Note: reserved identifiers
BOOLCONSTANT: 'true' | 'false';

IDENTIFIER: NONDIGIT (DIGIT | NONDIGIT)*;



FLOATCONSTANT: 
	SIGN? (
			(FLOATRAW EXPONENT?)
			|(HEXFLOATRAW BINARY_EXPONENT?)
	) [fF];
DOUBLECONSTANT: SIGN? (
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

INTCONSTANT: SIGN? NUMBER [lL]?;
UINTCONSTANT: PLUS? NUMBER [uU][lL]?;


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

