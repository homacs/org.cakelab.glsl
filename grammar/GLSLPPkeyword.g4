//
// This grammar is taken from the specification of 
// "The OpenGL Shading Language" version 4.5 
// (revision 6) and accordingly extended by the rules
// of the standard C preprocessor language, taken 
// from the ISO/IEC 9899:201x standard titled 
// "Programming Languages -- C".
//


lexer grammar GLSLPPkeyword;




//////////////////////////////////////
//     N O N    G L S L   E X T E N T!
//////////////////////////////////////

PPINCLUDE:  PP_START 'include' ;

//////////////////////////////////////
// S T A N D A R D   D I R E C T I V E
//////////////////////////////////////



PPDEFINE: 		PP_START 'define';
PPUNDEF: 		PP_START 'undef';

PPIF: 			PP_START 'if';
PPIFDEF: 		PP_START 'ifdef';
PPIFNDEF: 		PP_START 'ifndef';
PPELSE: 		PP_START 'else';
PPELIF: 		PP_START 'elif';
PPENDIF: 		PP_START 'endif';

PPERROR: 		PP_START 'error';
PPPRAGMA: 		PP_START 'pragma';

PPEXTENSION: 	PP_START 'extension';
PPVERSION: 		PP_START 'version';
PPLINE: 		PP_START 'line';



PPBUILTIN_LINE:    '__LINE__';
PPBUILTIN_FILE:    '__FILE__';
PPBUILTIN_VERSION: '__VERSION__';


fragment PP_START: '#' [ \t]*;


