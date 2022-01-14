# COOL Compiler #

## COOL Lexical Analyzer

Author : J Sai Nishith <br>
Roll No. : CS18BTECH11018 <br>

<Paragraph>
This ReadMe file has explanations for design decisions taken to make a Lexer for cool language from the given skeleton code.
The given code had the list of token in it with a 'reportError' function and a partialy completed 'processString' function.
</Paragraph>

<Paragraph>
The lexer handles strings and errors in strings, comments(both single line and multi line comments) and errors in comments and tokenize the elements of code as required.
</Paragraph>

## Design Rules:

### 1.Identifiers:


<Paragraph>
Type identifiers begin with a capital letter, object identifiers begin with a lower case letter, they are defined as follows:
</Paragraph>    

  * TYPEID    : ('A'..'Z')('_'|LETTER|DIGIT)*;
  * OBJECTID  : ('a'..'z')('_'|LETTER|DIGIT)*;

<Paragraph>
where LETTER and DIGIT are defined as:
</Paragraph>    
  * DIGIT : '0'..'9';
  * LETTER  : ('a'..'z'|'A'..'Z');


### 2.Keywords:
<Paragraph>
All the keywords except true and false, are case insensitive. For example keyword CLASS is defined as
</Paragraph>

  * CLASS   : ('c'|'C')('l'|'L')('a'|'A')('s'|'S')('s'|'S');

<Paragraph>
Similarly other keywords are defined.
</Paragraph>

### 3.Operators:
<Paragraph>
Operators like ';','+', etc are defined with their token name. For example
</Paragraph>

  * SEMICOLON   : ';';

<Paragraph>
Similarly other operators are defined.
</Paragraph>

### 4.Constants:
<Paragraph>
Bool, Int and string constants are defined as follows:
</Paragraph>

  * BOOL_CONST  : 't'('r'|'R')('u'|'U')('e'|'E') | 'f'('a'|'A')('l'|'L')('s'|'S')('e'|'E');
  * INT_CONST : DIGIT+;
  * STR_CONST   : '"'(ESC_SEQUENCE | ~('\\'|'"'|'\n'))*'"'{processString();};

<Paragraph>
where DIGIT and ESC_SEQUENCE are defined as:
</Paragraph>
  * DIGIT : '0'..'9';
  * ESC_SEQUENCE : '\\'.;

<Paragraph>
Since Bool_Constants are case sensitive, they start only with lower case letters. String constants start and end with '"' and they do not have new line and '"' in between them but the escaped newline is allowed as depicted in the regular expression. Obviously integer constants anre digits occuring atleast once and for any number of times.
</Paragraph>

### 5.Spaces:
<Paragraph>
  * WHITESPACE  : [ \t\r\n\f\b\u000b]+ -> skip ;

This expression covers all different types of spaces in code.
</Paragraph>

### 6.Strings:
<Paragraph>
Lot of errors could posssibly happen in strings.
When we encounter a '"' and it is not a string constant, string mode is triggered.
Cases covered are :
    
  * Null/Escaped null character in strings.
  * Unescaped New line.
  * End of file in string.
  * backslash at end of file.(Happens if we hit \ at Eof in stringmode)
  * String constant too long.(Has precedence over EOF in case of both errors)
    
Regular expressions have been written in string mode for each of these(Avoided presenting all of them here to avoid increasing the length of readme unneccessarily).String length error has been handled in process string function.
</Paragraph>

### 7.Comments :
<Paragraph>
There are two types of comments

  * ONELINECOMMENT      : '--' .*? ('\n'| (EOF) )-> skip;
  * WRONGCOMMENT  : '*)' {reportError("Unmatched *)");};
  * BEGINNESTEDCOMMENT1   : '(*' -> pushMode(IN_MULTI_COMMENT), skip;  

When we encounter '--', it is the start of single line comment and we skip everything till the new line. Encountering an EOF in a single line comment is not considered an erroneous case.

If we encounter '*)' before a '(*', then we report and error and when we encounter '(*', we start multiline comments mode. Within a multiline comments mode, if we encounter a '(*',  we enter nested comments mode and if we encounter '*)', we just pop out. EOF if case of multi line comment if reported as an error.
</Paragraph>

### 8.Incorrect characters:
<Paragraph>
Just in case a character doesn't match any of the above rules, then we declare it as an error using unmatched function and using the below regular expression.

  * OTHER   : . {unmatched();}; 
</Paragraph>

## Testing:
<Paragraph>
I have tested many codes with various possible errors and compared them to errors provided in actual cool compilers. Some of the errors given in assignment manual didn't match to those of cool compiler In such cases i have chosen the output of actual cool compiler. There is some error in handling the line numbers in my lexer, other than line numbers issue it worked fine for all cases i have tested. I have attached 7 testcases of which 
    
  * testcase1: It has unmatched character error and gives no error for escaped new line.
  * testcase2: It shows errors possible with comments and EOF in comment.
  * testcase3: Depicts "String constant too long" error.
  * testcase4: To check "String contains null character." error.
  * testcase5: This case cover two major errors of string i.e unescaped new line and EOF                  in string
  * testcase6 : To depict single line comment is not considered an erroneous case.
  * testcase7 : Encounters a case where EOF is just after " 
    
This way each testcase checks a particular type of error. All these cases together cover most of the erroneous cases.    
</Paragraph>   


File attached : AsnCS18BTECH11018.tar.gz <br>
Contents : src, Test_cases    






