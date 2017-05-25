



Preprocessor, Parser, and Syntax Highlighting
=============================================

Grammar has to support GLSL preprocessor, GLSL parser, 
and syntax highlighting capabilities. All three have 
slightly different requirements.

1. Preprocessor:
	.) Requires builtin macros to be set (e.g. GL_core_profile).
	a) Input is a set of lines with either a 
	   preprocessor directive or text.
	   --> CRLF is a token. 
	b) Directives have to be parsed and interpreted.
	c) Text lines are parsed for macro identifiers
	   only, but for the most part passed through
	   to the language parser.
	d) Output is a preprocessed translation unit
	   i.   Directive lines are replaced by CRLF.
	   ii.  Macros are expanded and inserted in text
	   		(may contain line continuation "\\\n").

2. Language Parser
    a) Input is a preprocessed translation unit which 
       contains text only.
    b) CRLF is not a token.
    c) Requires table to map text position to original 
       position (considering macro expansions and 
       removed content). Otherwise, error messages
       point to position in preprocessed translation unit.
    d) Output is an AST with language features only.

3. Parser for Editor Support:
    a) Requires to consider both: preprocessor directives
       and language features.
    b) CRLF is a token in preprocessor directive lines only.
    c) Output contains set of tokens from preprocessor and 
       language parser. Those are the elements displayed in
       the editor.
    d) Tokens are mapped to elements in the AST which contains 
       i.   all preprocessor directive lines (even 
            conditional branches, which evaluate to false)
       ii.  language elements including expanded macros
       iii. expanded macros associated with macro names in text
       iv.  table to map between AST and position in editor


There are two possible ways to run preprocessor and language 
parser:

A) Pipelined: Preprocessor and parser run in sequence. The pre-
   processor generates preprocessed translation unit and mapping 
   table. The language parser processes the preprocessed input
   and looks up original text position from mapping table.
B) Integrated: Parser switches between preprocessing and language
   parsing based on whether it reads a directive line or a text
   section.
   
Approach B is pretty complex, since the lexer needs to expand 
all IDENTIFIER tokens which map to macro names and replace them
by the new set of tokens. But a replacement might also affect 
a preceding token, which may have evaluated to a different token
with the new following token (I can't really think of such a case,
but it might be possible). Thus, we will go for the easier 
(more reliable) approach A.

To support text highlighting in editors, we need to keep the
preprocessor tokens and map them to the combined AST.


Grammar and Tokens
==================
Grammars and tokens for preprocessor and language parser are 
basically the same. Differences are mainly:
1. Tokens: 
   * CRLF is important in preprocessor but ignored in language.
   * Tokens # and ## exist in directive lines, only.
   * Names of directives are keywords when at the start of a 
     directive line, but can be freely used as identifiers 
     elsewhere (e.g. 'version').
2. Parser rules: Preprocessor and language parser share most 
   of the rules for expressions (e.g. conditional expressions).
   But both have many special rules: 
   * Both have different entry rules
   * Rules for directives are needed in the preprocessor only
   * Parser has rules for declarations of functions and types and
     control flow etc. not needed in preprocessor.


ANTLR has some limitations in regards to grammar reuse. The best
bet is to have a combined token set and a common grammar base
which is imported by the special grammar extensions for preprocessor
and parser. To support different behaviour of tokens, a flag 
will be introduced to switch the lexer between preprocessing and language
lexing mode. The lexer grammar then contains predicates
based on the flag, which are used to enable/disable tokens. In
case of different behaviour for the same token (discard or consider) 
two rules will be inserted to alternate between them based on the
selected processing mode.

The resulting conceptual hierarchy of lexer and parser rule files 
is like this:

           lexer:             lexer:           lexer:
      GLSLPPkeyword.g4    GLSLkeyword.g4     GLSLtoken.g4
             ^                  ^                ^
             |                  |________________|
             |                  |
             |                parser:
             |             GLSLcommon.g4
             |                  ^
             |__________________|
             |                  |
          parser:            parser:
         GLSLPP.g4           GLSL.g4



Combined Abstract Syntax Tree
=============================

The combined AST must contain preprocessor directives and language 
elements. The difference between both is basically, that the language defines
sequences of statements and the preprocessor sequences of lines 
(directives or text). Unfortunately, a statement can span multiple
lines and may even contain directive lines. Thus, both have to be kept
in separate ASTs: The Preprocessor AST (PP-AST), which contains all directives 
and the Language AST (Lang-AST) which contains all elements from macro-expanded 
text sections.

The combined AST has to provide a lookup method to retrieve the AST
element for a given cursor position (line and column in translation 
unit), whether it is from PP- or Lang-AST.
