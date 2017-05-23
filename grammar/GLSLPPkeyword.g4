//
// This grammar is taken from the specification of 
// "The OpenGL Shading Language" version 4.5 
// (revision 6) and accordingly extended by the rules
// of the standard C preprocessor language, taken 
// from the ISO/IEC 9899:201x standard titled 
// "Programming Languages -- C".
//


lexer grammar GLSLPPkeyword;

import GLSLkeyword;



//////////////////////////////////////
//     N O N    G L S L   E X T E N T!
//////////////////////////////////////

INCLUDE: 'include' ;



//////////////////////////////////////
// S T A N D A R D   D I R E C T I V E
//////////////////////////////////////



DEFINE: 'define';
UNDEF: 'undef';

// IF: 'if'; --> glsl token
IFDEF: 'ifdef';
IFNDEF: 'ifndef';
// ELSE: 'else'; --> glsl token
ELIF: 'elif';
ENDIF: 'endif';

ERROR: 'error';
PRAGMA: 'pragma';

EXTENSION: 'extension';
VERSION: 'version';
LINE: 'line';

PPOP_DEFINED: 'defined';


PPBUILTIN_LINE:    '__LINE__';
PPBUILTIN_FILE:    '__FILE__';
PPBUILTIN_VERSION: '__VERSION__';


CORE: 'core';
COMPATIBILITY: 'compatibility';
ES: 'es';



