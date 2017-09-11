

===============
A N A L Y S I S
===============



Requirements
============


1. Preprocessor:
	a) Requires builtin macros to be set (e.g. GL_core_profile).
	b) CRLF is a token in directive lines: Directive lines
	   are started and terminated with CRLF (in most cases).
	c) Line continuations are ignored (removed from text).
	d) Whitespace is a token in directive lines of macro definitions only.
	e) Directives have to be parsed and interpreted:
	   1. Expressions in conditional inclusions (#if etc.).
	   2. Operators (# and ##) and parameter references in macro definitions.
	f) In respect to conditional inclusion, errors in 
	   tokens of excluded lines have to be completely ignored.
	g) Text lines are parsed for macro identifiers
	   only, but for the most part passed through
	   to the language parser.
	h) Macro invocations have to be identified and executed.
	i) Output is a preprocessed translation unit
	   i.   Directive lines are removed entirely or replaced by text in case of #include.
	   ii.  Macros are expanded and inserted in text.

2. Language Parser
	.) Requires builtin symbols (keywords, functions, variables) to be defined according 
	   to glsl version (functions, variables, ..).
    a) Input is a preprocessed translation unit which 
       contains preprocessing tokens of macro expanded text lines only.
    b) CRLF is not a token.
    c) Whitespace is not a token.
    c) Requires table to map text position to original 
       position (considering macro expansions and 
       removed content). Otherwise, error messages
       point to position in preprocessed translation unit.
    d) Output is an AST with language features only.

3. Text Highlighting Support:
    Text highlighting requires a parse tree which is the result of preprocessing
    and language parsing.
    a) Requires the sequence of preprocessing tokens of the original input.
    b) Requires parse results of the preprocessor to identify:
       1. Directive symbols (keywords, macro names, macro parameters)
       2. Macro invocations, their parameter lists and corresponding macro definition
       3. Builtin macros
       4. Scopes of conditional inclusion/exclusion
    c) Requires parse results of the language parser to identify:
       0. Keywords and their type.
       1. Defined (builtin) symbols and their type (functions, variables, types)
       2. Symbol use (function call, variable or type reference)
       3. Code blocks and their nesting.
    d) Requires message and location of errors.
    e) Requires interpreter to decode macro calls and point out errors in there.




Preprocessing:
==============

Preprocessing Tokens:
---------------------


The preprocessor requires a properly tokenized input
stream for the following cases:
1. Differentiating text from preprocessor directives.
2. Parsing of preprocessor directives.
3. Identifying macro invocations including arguments.
4. Interpreting expressions of conditional inclusion
   directives (#if , #elif).


This results in a set of three different types of 
preprocessing tokens:
1. Language Tokens
2. Separator Tokens
3. Directive Tokens


Since the preprocessor should be independent of the 
language it is used for, it should not require language
level tokens, but unfortunately, it can't.

The specification declares preprocessing tokens to be
very basic. For example a number is just a sequence 
of digits, eventually containing a dot. This is not 
enough to distinguish e.g. between hexadecimal 
constants and identifiers. Given a hexadecimal constant 
such as 0xCAFFEE, a basic lexer woudl emit a number token '0' followed
by an identifier token 'xCAFFEE'. If there was a defined macro
with the same name, this would turn into a macro invocation, 
which is wrong. Thus, the preprocessor already requires 
a stream of language level tokens containing 
even special operators such as '->' or even '#!' to 
distinguish from its own preprocessing operators (# and ##).
The same applies, when considering strings; the preprocessor 
must be able to distinguish the content of a string from 
everything else.

On the other hand, the preprocessor has to determine
its own keywords such as 'defined' or 'include', but those
aren't keywords of the language. Thus, the preprocessor
has to investigate received identifier tokens based on the 
parsing context.



Language Tokens:


The set of language level tokens recognised by the 
preprocessor for C are these:

- String Literal: Considering all escape sequences but not interpreting it.
- Character Constant: As string literals but just one character (depending on the language).
- Number Constants: Considering all the different types including hexadecimal, octal, 
  floating point with exponents etc.
- Punctuators: 
  * Operators
  * Characters, separating instructions such as ';' or ','
  * Brackets, all kinds of them ([{}]).
- Comments: '//' <text> or '/*' <text> '*/'
- Unknown: Unknown tokens will be added in all other cases.
  
Those language level tokens will also be forwarded to the output.




Separator Tokens:


To distinguish between directive lines and text, to 
distinguish a macro parameter list from the expansion 
list of a macro definition and to preserve white space 
characters in the output, the preprocessor will need
those tokens additionally, to be emitted by the lower 
level lexer:
- HASH '#'
- Whitespace (BLANK, TAB, CRLF)
- SOF (start of file)
- EOF (end of file)

SOF and EOF are (both) especially needed to properly parse text 
inserted from includes (will be explained below).




Directive Tokens:


To select and parse directives, the preprocessor will add directive tokens, 
which can only occur in directive lines. Those directive 
tokens contain the keywords of the directives and their context specific 
tokens:

- Directive identifiers (define, if, ifdef, ifndef, elif, else, endif, include, pragma, version, ..?) 
- Macro operators (defined, #, ##)
- Version and extension arguments (profile names, enable, disable, extension names etc.)
- Pragma specific tokens
- Include Header Path: String literal with delimiters '<' and '>' or '"' and '"'.
- Excluded tokens: Tokens of sections which have been excluded through conditional inclusion.
- etc.

Those tokens cannot be emitted by the lower level language 
token lexer, because they are context sensitive. Thus, the 
preprocessor must be able to select token sets based
on context. Since most of the context specific tokens (if not all)
are used in their respective directive only, there will
be a parser for each directive, which reinterprets the tokens 
accordingly and emits new tokens if required (e.g. for 
text highlighting). This approach allows to add or 
remove directives (such as #include or options to #pragma).

Accordingly, there will be a parser for text sections which accepts
listeners to be called on certain token types. This allows to add
functionality such as macro expansion to the text parser.

Parsers may behave differently based on certain preprocessor 
output modes, which will be explained in a section below.



Macro Expansion:
----------------
 
There three different cases to consider in respect to
macro expansion:
1. Execution of an identified macro invocation in text.
2. Expansion of an argument for a macro invocation.
3. Expansion of macro invocations originating from 
   the expansion of another macro.
4. Expansion of preprocessing tokens for the expression
   of a conditional inclusion.
   



Execution of Macro Invocations:


If a macro invocation was identified in the text, the 
following procedure occurs:
1. Arguments will be assigned to macro parameters.
2. Expressions in the replacement list (using # or ##)
   will be evaluated which requires expansion of arguments.
3. The resulting list of preprocessing tokens is inserted
   in the text at the location of the macro invocation 
   expression (replacing it).

Macro names in the expansion list will be considered when
the preprocessor proceeds parsing the text.




Macro Invocations Originating from Expansion Lists:


Two important things:
1. Macro names in expansion lists are ignored until expanded
   to the text.
2. Macros cannot call itself.

Macro names contained in an expansion list will be considered 
only, when the macro containing it, was expanded to the text. 
The preprocessor then continues parsing the text, which now 
contains the inserted tokens of the previous expansion, preceding 
the remainder of the text. This way, the expansion list can 
for example reference another macro, which is not defined at the
location of its definition, but before its invocation. 
Another example is, that the replacement list
contains just the name of a macro, but the required
arguments are in the text, following the macro invocation.

Macros cannot invoke itself. Thus, identifiers in the 
replacement list, which have the same name, are not 
interpreted as macro invocations, but treated as ordinary 
identifiers. To determine this case, the inserted tokens of
an expansion list have to be associated with its originating
macro definition, in some way.




Expansion of Arguments:

Expansion of arguments is applied to the preprocessing tokens
of that argument only. Compared to macro invocation execution, 
it does not include the following text, but behaves the same
way in every other aspect.

Expansion of arguments occurs, only if the corresponding macro 
parameter is associated with one of the operators # and ## 
in the expansion list. In all other occurrences of the
parameter, it is just replaced by the preprocessing tokens
of the argument. Thus, the same parameter can be just replaced
by the argument in one case, but replaced by its fully expanded tokens
in the other.

An argument is fully expanded, if all contained macro invocations 
have been executed according to the exact same procedure explained above, 
but without the following text. 



Expansion of Expressions for Conditional Inclusion:

All preprocessing tokens in a directive line following #if or #elif
up to the end of the line, have to be fully expanded the same 
way as macro arguments (i.e. not including the following text).




Conditional Inclusion
---------------------

Conditional inclusion refers to use of #if etc. Each of it describes 
a scope of text lines and directive lines, which will be either included 
or excluded from parsing. Conditional scopes do affect visibility of 
declared symbols or macros. Macro definitions are always global, 
they just do not get parsed (and registered) in excluded scopes.

Directives involved in conditional inclusion are these:
- #if
- #ifdef
- #ifndef
- #elif
- #else
- #endif

A conditional scope is started with any #if... directive and ends with any of
#else, #elif or #endif. Any #else or #elif scope ends the previous scope on 
whatever nesting level it was and starts a successor scope on the same nesting 
level. A sequence of conditional scopes on the same nesting level is ended by #endif.
Nested conditional scopes have a parent scope.

Visibility of a conditional scope depends on:
1. The result of its conditional expressions (0 or 1).
2. The visibility of its predecessor scope.
3. The visibility of its parent scope.

Visibility of a conditional scope controls parsing. In excluded scopes
only conditional directives will be parsed properly. All other
lines, will be treated as text lines. In case of text tokenizing mode,
tokens will be turned into excluded tokens and added to the tokenized output.
All other modes will just skip tokens until a conditional directive was found.

To track scope sequences and scope nesting, the preprocessor always has to parse 
directive lines of conditional inclusion, even in excluded scopes.



Location of a Token
===================


The location of a token is required for
1. Error reporting in Preprocessor
2. Error reporting in Language Parser
3. Utility functions such as lookup of function or type definitions in IDE.

Generally, a location is defined by start and 
end position of a token in the input stream of
an associated resource (e.g. file). 

The preprocessor reads from multiple sources 
(ref. #include), and writes tokens to the output.
Most of the tokens to the output are forwarded from 
the input, but there are several other cases:
1. Removed: 
    - Directive lines get removed.
    - Macro invocation expressions get removed.
2. Added: 
    - #line directives may be added for #include
    - missing CRLF at end of a file may be added
3. Transformed:
    - ## concatenation transforms two tokens in a new one
    - # stringification transforms multiple tokens in a new one
4. Copied:
    - Macro expansion copies possibly transformed tokens 
      from the macro definition to the location of the 
      macro invocation.



Simple Location:

Error reporting generally needs to point out the original 
location of an error, which requires to identify the 
input resource, and line and column in the input. Thus, 
a location gets associated with all of that.



Macro Expanded Location:

Reporting of errors originating from macro expansion, additionally
requires the location of the macro definition and the location of
the corresponding characters in the replacement list, which was copied 
or transformed. Thus, another location type will be added for macro
expanded locations. This macro expanded location is associated with 
the macro invocation, which in turn is associated with its macro definition.
Additionally, file, line and column of the macro expanded location is 
a copy of the location of the origin of the corresponding token 
in the macro definition. Thus, the location of the macro invocation is the
location, where the error occurred, but the given location of token
in the replacement list might be the origin of the error.

Macro expansions may occur on top of each other (expanded text 
contains new macro invocations). As a consequence, macro expanded 
locations can be associated with a macro invocation, which has
a macro expanded location. Thus, the location of the macro invocation
received with a macro expanded token in an error report may not be
the location of the error in the text. To retrieve the origin of an
error, the macro expanded location of macro invocations has to be
followed recursively until a macro invocation with an ordinary location
in the text was found.

Example:
Location getErrorCauseLocation(Location start) {
	Location start = token.getStart();
	while (start instanceof MacroExpandedLocation) {
		start = ((MacroExpandedLocation)location).getMacroInvocation().getStart();
	}
	// start is now the location of the first macro invocation, which caused the error
	return start;
}

There is an alternative solution to this approach, which would be to
let the macro expanded location already point to the cause of the error
(i.e. the macro invocation), which could reduce the processing effort 
in error reporting. To find the original token in the 
expansion list, this approach would require the macro expanded location 
to be associated additionally with the location of the original token 
and the macro invocation as well. When multiple macro expansions occurred 
on top of each other, the error token had to point to the location 
of the first macro invocation and it had to be associated with the 
original token in its own macro definition. 
This is still not enough to keep track of the sequence of macro expansions
which lead to the error. Thus, in this approach, a macro expanded location
had to be additionally associated with its macro invocation. Considering
that error reporting is not the general case, and location tracking is already
expensive in terms of memory and processing, the fist approach was chosen.

There are more alternative approaches not mentioned here, which are either 
more expensive or cause the API to be error prone.
 


Preprocessor Output Modes
=========================


There are different output types required to be generated by the preprocessor, 
based on use cases:
1. Runtime Preprocessing: Generates preprocessed output which can be fed to a GLSL compiler.
2. Language Preprocessing: Generates a preprocessed sequence of tokens to be used by a language parser.
3. Text Tokenizing: Turns the given input in a sequence of tokens to be used for text highlighting.


Output of Runtime Preprocessing:
--------------------------------

For runtime preprocessing, the preprocessor executes and removes 
just selected directives and writes the text of generated tokens 
into an output stream.

There are tasks that can be performed in this mode, but 
some directives have to be left in the output.


The preprocessor can perform the following tasks only:
  - Conditional inclusion
  - Includes of other resources


To keep track of errors reported by an external GLSL compiler, those tasks 
need to add appropriate #line directives in this mode.

Macro expansion cannot be performed, since the expansion may change
locations of tokens (column and row) and reported errors of an external
GLSL compiler cannot be located properly.


The following directives will be parsed but not fully executed or removed from output:
  - #version : parsed for information but not removed.
  - #extension : parsed for information but not removed.
  - #pragma : parsed but not removed.
  - #line : will be parsed and executed, so that error reports will consider seen line directives.
  - #define and macro invocations: parsed and registered, but not executed or removed. 
            Missing argument lists will be ignored. 


Note: This functionality is useful only, if the include directive is used. 
Otherwise, the preprocessor of the compiler will be probably faster.



Output for Language Parsing:
----------------------------

All tokens of text sections will be forwarded to the output sink. Those can be
buffered and filtered by the output sink (such as removing all whitespace tokens). 
All tokens of directive lines will be removed. #line directives will be fully 
considered to adjust locations of tokens accordingly. 



Output for Text Tokenizing:
---------------------------

This mode is useful for text highlighting. Since the preprocessor parses
the tokens anyway, it can generate a sequence of tokens according 
to original input without actual preprocessing. That means, that 
given tokens always map to its original location in the input. 
Macro expansion is not performed, and thus there are no macro 
expanded locations.

The output contains:
1. Language Tokens and Separator Tokens unless replaced by higher level tokens.
2. Directive tokens, which basically add type information to input tokens.
3. Tokens for excluded sections in respect to conditional inclusion.

Text tokenizing requires 
1. all tokens of the original input stream only (no included tokens)
2. and their original location in the input stream.

To achieve (1), the lexer of the original input resource will
provide TextTokenizerListener capabilities. All committed tokens
will be forwarded to the listener.

Regarding (2), the row and column of tokens may refer to different
locations in respect to #line directives. But the position (see
Location.getPosition()) will always be the original offset 
in the input stream.

Forwarded token instances will be identical (same memory) to the 
tokens used by the language parser and will be enriched with
links to symbol references identified by the parser (e.g.
identifiers of functions will refer to the function).




Error Handling
==============

Error handling has to be consistent over all components 
such as scanner, lexer, preprocessor and language parser.

There are two strategies to handle syntax errors:
1. Report and exit on first error.
2. Report error and recover to proceed parsing.

The second strategy is useful in case of text highlighting 
but almost useless otherwise. Most of the time
errors lead to subsequent parsing errors and only the 
first error in a file is an actual syntax error. This
is due to the fact, that error recovery is quite complex.
However, error handling will support both error strategies.

Error reporting occurs in two flavours:
1. Report to an error handler.
2. Adding of error nodes to parse results.



Error Handler:
--------------

Error handler will be the component which receives error reports
and decides whether to proceed or exit.


Error Reporting:
----------------

Any syntax error is reported to the error handler using the token,
which caused the error and an explanatory message. The return value
of the error handler on that report decides whether the parser aborts
or performs error recovery and proceeds parsing.



Error Abort:
------------

In case of an abort due to an error, the parser will immediately 
stop parsing, discard all results and return to API callers 
context.



Error Recovery:
---------------

Error recovery occurs only if the error handler decides to proceed
and consists of two tasks:

1. Generating error output (error node/token)
2. Selecting a follower rule and skip to the prefix token of that rule.

The easiest way to recover from an error in a language parser
is to search for the start of the next bigger parse rule 
such as a sentence or a statement with a prefix token set, 
which differs significantly from other prefix token sets. 
All tokens up to that location should be ignored, because 
most of the time those tokens just cause false positives. 

The preprocessor will have to differentiate, whether the error
occurs in a directive line or in text (e.g. macro expansion). 
In directive lines, recovery will skip to the end of the line.
In text (i.e. in macro invocation expressions), recovery will 
skip to the next token only.



Language Parsing
================


Minimum input for the language parser is the sequence of preprocessed 
language tokens of the preprocessor.

Main task of the preprocessor is to parse preprocessed tokens and
call listeners on matching parser rules.


Output Modes:
-------------

1. Symbol Table
2. Text Tokenizing




Symbol Table:


Symbol table is useful, to lookup symbols without having the
text tokens.

Requires symbol table of the preprocessor.

Symbol Table contains declarations of all:
- Macros
- Functions
- Variables
- Types

Generated symbol table provides lookup of a symbol declaration
for a given location (see above).

Lookup has to consider macro expanded locations





Text Tokenizing:


Text tokenizing is useful for text highlighting in IDEs.
Lookup of symbols is much easier, because they are already
associated with their declaration.

Parser receives tokenized text of the preprocessor 
and exchanges certain tokens by higher level language 
tokens, unknown to the language parser.

Higher level language tokens are:
* Language Keywords (struct, do, while, if, ...)
* Symbol Tokens
  - Function
  - Variable
  - Type

Symbol tokens (function, variable, type) are associated 
with their declaration. The declarations provides information
whether the symbol is a builtin symbol or not.





===========
D E S I G N
===========


Preprocessor
============


Architecture Overview:
----------------------
                             Conditional Scope
                                     |
                                     |         Context *
Resource Manager   <-------    Preprocessor   --------->   Parser  -->  Output Generators
      ||                             |                       ||
      \/*                            |                       \/1
   Resource                    Symbol Table                 Lexer
                                  (Macros)                   ||
                                                             \/1
                                                           Scanner



The preprocessor controls preprocessing. It selects 
rules and delegates parsing to them. For parsing the
parser of the rule gets the Context object, which
contains a Lexer, the list of Output Generators,
the Symbol Table and the Conditional Scope.




Scanner:
--------

Scanner reads an input stream and keeps track of 
the location in the input stream. This includes 
resource identifier, line, column and position 
in the stream.

Line and source identifier may be manipulated by 
#line directives.

Scanner may read lookaheads but cannot rewind consumed 
characters.



Constructor:
- Scanner(Resource in): Creates a scanner 
  reading from the given resource. Location will be set
  to represent the -1 item in the data stream of the resource.

Methods:
  int lookahead(int n): Calculates location.pos + n and returns
      that item from the stream. If the n-th item does not exist
      in the stream it returns EOF.
  void consume(int n): Updates location: 
      Position is incremented by n.
      Line and column are updated considering CRLF items in the 
      stream.
  int current(): Returns the last item consumed. If no items
      where consumed, it returns SOF. 
  Location location(): Returns the location of the last item
      consumed.
  Location nextLocation(): Returns the location of the next
      item (lookahead(1)).
  void setLocation(String resourceIdentifier, int line): Sets
      resource identifier and line of the current location. This
      affects all subsequently received values from location() 
      and nextLocation().


Lexer:
------

Lexer is context sensitive. 
- #include requires <header.path> to be lexed as THeaderPath may contain
  items equal to prefixes of other tokens.
- # and ## are accepted in expansion lists only.




Lexer uses a Scanner to transform the input in a sequence of language 
and separator tokens on demand and for a given context.

The lexer has a set of Lexer Rules which perform the lexical analysis
of the input received from the scanner. 

The location of generated tokens is received from the Scanner and can
be influenced (e.g. by #line directives).

The lexer provides a method to receive the n-th lookahead token. Lookahead
tokens are ordinary tokens, but without location attributes. For each lookahead 
token, the lexer stores  information on their relative position (scanner lookahead) 
and number of items read (not consumed). Location is assigned once the token
was actually consumed. Lookahead tokens will be stored until either consumed or 
invalidated.

Tokens are usually read from the scanner. To support macro expansion,
the lexer also allows to prepend tokens to the stream of the scanner.
Preprended tokens are stored in a queue. Certain methods behave differently,
when prepended tokens exist in the queue: 
- lookaheads with n<prepend.size() are read from the queue 
  directly and not stored in the lookahead queue. For 
  n >= prepend.size() , lookaheads will be handled the usual way with n = n-prepend.size().
- consume of n < prepend.size() tokens, will remove those tokens 
  from the queue. n >= prepend.size() will be handled as usual with n = n-prepend.size().
- setLocation is inactive until prepend.isEmpty() and will cause 
  an assertion error to indicate an invalid state.
- isEmpty has to consider the prepended tokens as well.



Constructor:

- Lexer(Scanner in): Creates a Lexer wich reads from the given scanner.



Methods:
- void  setLocation(String resourceIdentifier, int line):
        Changes the current location according to the given
        resourceIdentifier and line.
- Token current(): Returns the last token, which was consumed or null
        if there is no such token.
- Token lookahead(int n): Returns the n-th lookahead token which is either
        received from the prepend queue, the lookahead queue or from a
        lexer rule.
- void  consume(int n): Consumes either the first n lookahead tokens and assigns
		a proper location to them using scanner.location() or returns 
		prepended tokens.
- void  prepend(List<Token> tokens): Adds the given tokens to the prepend queue. 
- boolean isEmpty(): Checks the prepend queue and the scanner and returns 
        true if no more tokens are available.
- void  setLocation(String resourceIdentifier, int line): Forwards
        this call to the scanner.


Method prepend is meant to be used in macro expansion to prepend
the tokens of the expansion list to the front of the queue.


Lexer Rule:
-----------

A Lexer Rule provides methods to perform lexical analysis on 
given input (Scanner) and generate lookahead tokens. Lexer rules are
independent of each other and not context sensitive.

Generated lookahead tokens do not have a location.

Lexer rules are supposed to be derived from a common base class
LexerRule.


Constructor:
- LexerRule(): Creates a lexer rule.

Methods:
- LookaheadToken analyse(Scanner in, int start): 
        Checks whether the next characters beginning at start match
        its own prefix characters, parses accordingly and creates one
		token which is returned to the caller. If there is no match
		with the prefix tokens, it returns null. If parsing failed,
		it creates an error token containing the error message.


Lookahead Token:
----------------

Stores information about a lookahead token using the following attributes:
- int start: Scanner lookahead of the first item used.
- int length: Number of scanned items used.
- Token token: Result of the lexical analysis. 




FilteringLexer:
---------------

A filtering lexer is used to filter tokens received from another lexer.

Token filter have the same methods as the Lexer.

Constructor:
- TokenFilter(Lexer lexer, FilterCallback filter):
	Creates a token

Methods:
- Token current(): returns the token, which was last consumed.
- Token lookahead(int n): Returns the n-th token of the lexer, which 
        does not match the filtered token types.
- void consume(int n): Consumes all first tokens of the lexer
       (including filtered tokens), until the n-th non-filtered token
       was consumed.




ParserRule:
-----------

A parser rule implements a given parser rule. It is responsible to parse
tokens of a Lexer according to its rule and based
on the given context. It reports syntax errors to the error handler,
reports results to its listeners and updates the context 
(symbol table, conditional scope).


There are parsers for the following rules:
* Text: Parses lines of text and triggers macro expansion.
* Directive: Parses directive lines. Parsers of directives are further 
  subdivided in:
  - #define
  - #undef
  - #if
  - #ifdef
  - #ifndef
  - #elif
  - #else
  - #endif
  - #pragma
  - #version
  - #extension
  - #line
  - #include



Parser Listeners
----------------

Parser listeners generate output of parser rules.

- [mandatory] PPOutputSink receives generated preprocessor output tokens
- [optional]  TextTokenizerListener receives tokens of the original input



Tasks Affecting Lexing and Parsing
----------------------------------

- Macro Argument Expansion
- Macro Expansion
- Line
- Include
- Condition Parsing




Macro Argument Expansion:


Tokens of the argument will be given to a private lexer, and then 
presented to a Text parser for expansion. Result of the text parser
will be captured using a different output sink.




Macro Expansion:


Iterates through the expansion list and 
1. Expands arguments for parameter references if required (see above).
2. Applies operators to retrieve their result token.
3. Copies each token and assigns a macro expanded location.

Assigned macro expanded locations are copies of the given location in macro definition
with the macro invocation expression added.

Locations of tokens generated by operators # and ## refer to the locations of the involved
parameter references in the replacement list.

The concatenated tokens will be presented to a private Text lexer to 
generate a joined token. If there is no match to any of the regular
text token rules, it is replaced by an error token and the error will be reported.


Condition Parsing:


Subsequent tokens to #if or #elif upto CRLF/EOF will be presented to a Text 
parser for expansion, before it gets parsed into an expression. 
The text parser usually forwards a sequence of output tokens 
to the output sink. The expression parser will use an the output 
sink to store the result of the text parser. The text parser always stops at the 
next CRLF/EOF. So the received tokens are the tokens of the 
remainder of the line. The received tokens then will be added to a private lexer,
which is used to parse the expression. If the lexer is not empty after the expression
was fully consumed, it indicates an expression error "unexpected tokens".



Include:


Includes require preprocessing the entire content of another file using the current
preprocessor state (symbol table, scope, etc.).

Includes will instantiate a new lexer and scanner and call process() on the preprocessor.
When the process() method returns, it resets to the previous lexer.



Line Directive


Line directives may change line and source identifier of all locations of subsequent tokens 
only of the resource, where they occurred. This does not affect macro expanded tokens.

Execution of a line directive involves a call to lexer.setLocation().




Error Handling
==============


Modes:
- Dismiss and exit: Error handler throws a SyntaxError exception. 
- Recover and proceed: Error handler does not throw an exception.


Error Types:
------------


Error Type                  Reference                   Explanation

Lexer Errors:
- Missing item inside token Location                    (such as end terminator of strings)
- Wrong item inside token   Location                    (such as a non-existing escape sequence in strings)
- Unknown prefix-items      Token                       (any character, which does not exist in the language)

Parser Errors:
- Missing token             previous.end                (a different token was expected such as TPunctuator instead of TEof)
- Unexpected token          Token                       (such as tokens after a conditional expression)
- Unknown Token             Token                       (received from lexer due to unknown prefix items)


Error Handling Options:
-----------------------
Lexer: 
Missing or wrong items only occur inside already identified tokens. 
- Report error location inside token and proceed normally, emitting a regular token.
Unkown prefix-items have to be emitted as TUnknown tokens, derived from TWhitespace. 
- Report unknown token error and emit unknown token.

None of the lexer errors is supposed to affect the parser. 


Parser:
- TUnknown tokens will be handled as whitespace to not interfere 
with parser rules and to not cause redundant error reports. 


Missing and unexpected tokens can be recovered in this way:
- report, consume all tokens up to the next safe point (e.g. CRLF) and exit rule

Recovery from missing tokens may also jump to the next token, but risks 
to get into follow-up errors and false-positives or redundant error reporting. 
Thus, skipping to the next safe point is more beneficial.

Implementation:
---------------

Lexer error handling:
method syntaxError() reports to handler only. If the handler decides to 
throw an exception, preprocessing will exit immediately without any 
results. 

Parser error handling:
Method syntaxError() reports to handler and throws a Recovery exception
unless the handler already threw a syntax error exception (which always
causes a stop).
A Recovery exception has to be handled inside of the parser rule, which 
issued the call to syntaxError(). General recovery method for every
parser will be to read all remaining tokens up to and including the next
CRLF and exit the rule without result. Depending on the rule, read tokens
will eventually be forwarded to output, but not parsed or interpreted.



GLSL Versioning
===============

Each GLSL version has a set of unique properties:

- keywords
- reserved keywords
- builtin types
- builtin functions
- builtin variables

All GLSL versions have a set of common properties:
- punctuator tokens
- builtin macros (__FILE__, __LINE__, __VERSION__)

This results in a set of version specific tokens and symbols, which are 
stored in instances of those two classes:
- TokenTable maps preprocessed tokens to language parser token types.
- SymbolTable maps identifier tokens to builtin symbols (i.e. macros
  types, functions and variables).

Both are required in different stages of the translation process 
(preprocessing and language parsing). 
TokenTable is used by the PPOutputSink, which converts received 
tokens into language parser tokens. 
SymbolTable is used by the preprocessor to identify builtin macros
and by the language parser to identify builtin types, functions and
variables.

Maintenance should be kept simple to allow fast adaption to new versions 
or other languages such as SPIR-V. It is common practice to use the 
capabilities of a compiler to declare all builtin symbols using the
language itself. Thus, the builtin table will be initialised with glsl
source code, which contains all declaration statements and #define
directives of that version, which will be called 'preamble'. The 
only exception are scalar builtin types (int, float, bool etc. and void).

Parsing of the preamble requires a few preconditions:

- A fresh SymbolTable filled with scalar builtin types and common builtin macros.
- An isolated preprocessor and language parser
- No user level listeners (no user level output sink or error handler (all errors are internal errors))
- Builtin symbols have to be distinguishable from user declared symbols, which will be implemented as flag.

All language tokens recognized by the language parser have a specific mapping to a language parser token
type. The TokenTable just has to decide, which language tokens are actually used as keywords, reserved 
keywords or builtin types. The latter will be identified using the builtin symbol table.


Implementation:
---------------

The preamble will be split into a preprocessor preamble and a language parser preamble. The preprocessor
preamble contains #define directives only and the language parser preamble contains language tokens only.
Thus, both can be parsed independent of each other.

Valid language tokens are split into keywords and reserved keywords. For each version there will be two
files, which contain each a whitespace separated list of (reserved) keywords of that version.

For each version X exists:
- versioning/X/keywords.txt  (keywords)
- versioning/X/reserved.txt  (reserved keywords)
- versioning/X/preamble.glsl (builtin symbols)
