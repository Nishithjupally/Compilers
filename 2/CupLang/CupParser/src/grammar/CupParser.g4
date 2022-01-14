parser grammar CupParser;

options {
    tokenVocab = CupLexer;
}

@header{
    import java.util.List;
}

@members{
    String filename;
    public void setFilename(String f){
        filename = f;
    }

/*
    DO NOT EDIT THE FILE ABOVE THIS LINE
    Add member functions, variables below.
*/

}


program : 
    t = text ? EOF;                  

text 
    : functionOrDeclaration
    | text functionOrDeclaration
    ;

functionOrDeclaration 
    :   functionDefinition
    |   declaration
    |   structDefintion
    |   declarator '=' initializer ';'
 //   |   ';'
    ;
    
functionDefinition

    :   t = typeSpecifier IDENTIFIER pl = parameterTypeList cs = compoundStatement
    ;

declaration
    :   declarationSpecifier+ initDeclaratorList ';'
    |   templateDeclaration
    ;

templateDeclaration
    :   templateDeclaration1 initDeclaratorList ';'
    ;
    
templateDeclaration1
    :   dataStructureName  '(' dsArgs ')'
    ;

dsArgs
    :   typeSpecifier 
    | templateDeclaration1
    ;

dataStructureName
    :   STACK
    |   QUEUE
    |   UNQ_PTR
    |   VECTOR
    |   SHARED_PTR
    ;

initDeclaratorList
    :   initDeclarator
    |   initDeclaratorList ',' initDeclarator
    ;
    
initDeclarator
    :   declarator
    |   declarator '=' initializer 
    ;

declarator
    :   pointer? directDeclarator
    ;

pointer
    :   '*' typeQualifierList?
    |   '*' typeQualifierList? pointer
    ;

typeQualifierList
    :   typeQualifier
    |   typeQualifierList typeQualifier  
    ;

typeQualifier
    :   'const'
    |   'restrict'
    ;

directDeclarator
    :   IDENTIFIER
    |   '(' declarator ')'
    |   directDeclarator '[' array_params ']'
    ;

array_params
    :   INTEGER_CONST
    |   IDENTIFIER
    |   
    ;

initializer
    :   assignmentExpression
    |   '{' initializerList '}'
    ;

initializerList
    :    initializer
    |    initializerList ',' initializer
    ;

assignmentExpression
    :   conditionalExpression
    |   unaryExpression assignmentOperator assignmentExpression
    |   constant // for
    |   functionReturn
    ;

assignmentOperator
    :   '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
    ;

conditionalExpression
    :   logicalOrExpression ('?' expression ':' conditionalExpression)?
    ;

unaryExpression
    :   postfixExpression
    |   '++' unaryExpression
    |   '--' unaryExpression
    |   unaryOperator castExpression
    |   'sizeof' unaryExpression
    |   'sizeof' '(' typeSpecifier ')'
    |   '&&' IDENTIFIER // GCC extension address of label
    ;

unaryOperator
    :   '&' | '*' | '+' | '-' | '~' | '!'
    ;

postfixExpression
    :   primaryExpression
    |   postfixExpression '(' argumentExpressionList? ')'
    |   postfixExpression '[' expression ']'
    |   postfixExpression '.' IDENTIFIER
    |   postfixExpression '->' IDENTIFIER
    |   postfixExpression '++'
    |   postfixExpression '--'
    ;

expression
    :   assignmentExpression
    |   expression ',' assignmentExpression 
    ;

primaryExpression
    :   IDENTIFIER
    |   constant
    |   STRING_LITERAL
    |   '(' expression ')'
    ;

constant
    :   INTEGER_CONST
    |   FLOAT_CONST
    |   CHAR_CONST
    |   BOOL_CONST
    |   STRING_LITERAL
    ;



argumentExpressionList
    :   assignmentExpression
    |   argumentExpressionList  ',' assignmentExpression
    ;

logicalOrExpression
    :   logicalAndExpression
    |   logicalOrExpression '||' logicalAndExpression
    ;

logicalAndExpression
    :   inclusiveOrExpression
    |   logicalAndExpression '&&' inclusiveOrExpression
    ;

exclusiveOrExpression
    :   andExpression
    |   exclusiveOrExpression '^' andExpression
    ;

inclusiveOrExpression
    :   exclusiveOrExpression
    |   inclusiveOrExpression '|' exclusiveOrExpression
    ;

andExpression
    :   equalityExpression
    |   andExpression '&' equalityExpression
    ;

equalityExpression
    :   relationalExpression
    |   equalityExpression '==' relationalExpression
    |   equalityExpression '!=' relationalExpression
    ;

relationalExpression
    :   shiftExpression
    |   relationalExpression '<' shiftExpression
    |   relationalExpression '>' shiftExpression
    |   relationalExpression '<=' shiftExpression
    |   relationalExpression '>=' shiftExpression
    ;

shiftExpression
    :   additiveExpression
    |   shiftExpression '<<' additiveExpression
    |   shiftExpression '>>' additiveExpression
    ;   

multiplicativeExpression
    :   castExpression
    |   multiplicativeExpression '*' castExpression
    |   multiplicativeExpression '/' castExpression
    |   multiplicativeExpression '%' castExpression
    ;

additiveExpression
    :   multiplicativeExpression
    |   additiveExpression '+' multiplicativeExpression
    |   additiveExpression '-' multiplicativeExpression
    ;   
    

castExpression
    :   '(' typeSpecifier ')' castExpression
    |   unaryExpression
    |   constant // for
    ;

// typeName
//     : typeSpecifier
//     ;
    
typeSpecifier
    :   VOID pointer*
    |   BOOL pointer*            
    |   CHAR pointer*
    |   INT pointer*
    |   FLOAT pointer*
    |   DOUBLE pointer*
    |   LONG pointer*
    |   STRING pointer*
    |   STRUCT IDENTIFIER pointer*
    |   templateDeclaration1
    ;

parameterTypeList
    :   '(' functionParameterList? ')'
    |   '(' VOID ')'
    ;


functionParameterList
    :   typeSpecifier directDeclarator (',' typeSpecifier directDeclarator)*
    ;


blockItemList
    :   blockItem
    |   blockItemList blockItem 
    ;

blockItem
    :   statement
    |   declaration
    |   functionCall
    ;

functionCall
    :   IDENTIFIER '(' identifierList? ')' ';'
    ;

identifierList
    :   expression (',' expression)*
    |   functionReturn
    ;

statement
    :   labeledStatement
    |   compoundStatement
    |   expressionStatement
    |   whileStatement
    |   forStatement
    |   ifStatement
    |   switchStatement
    |   jumpStatement
    ;


labeledStatement
    :   IDENTIFIER ':' statement
    |   CASE constantExpression ':' statement
    |   DEFAULT ':' statement
    ;
    
compoundStatement
    :   '{' blockItemList? '}'
    ;

constantExpression
    :   conditionalExpression
    ;

expressionStatement
    :   expression? ';'
    ;

ifStatement
    :   IF '(' expression ')' statement (ELSE IF '(' expression ')' statement)* (ELSE statement)?
    ;
switchStatement
    :   SWITCH '(' expression ')' statement
    ;
// iterationStatement
//     :   WHILE '(' expression ')' statement
//     |   DO statement WHILE '(' expression ')' ';'
//     |   FOR '(' forCondition ')' statement
//     ;   

whileStatement
    :    WHILE '(' expression ')' statement
    |    DO statement WHILE '(' expression ')' ';'
    ;
    
forStatement
    :   FOR '(' forCondition ')' statement
    ;
    
forCondition
    :   forDeclaration ';' forExpression? ';' forExpression?
    |   expression? ';' forExpression? ';' forExpression?
    ;

forDeclaration
    :   declarationSpecifier+ initDeclaratorList
    |   declarationSpecifier+
    ;

forExpression
    :   assignmentExpression
    |   forExpression ',' assignmentExpression 
    ;
jumpStatement
    :   CONTINUE ';'
    |   BREAK ';'
    |   RETURN expression? ';'
    ;



functionReturn
    :   IDENTIFIER '(' argumentExpressionList? ')' 
    ;

declarationSpecifier
    :   storageClassSpecifier
    |   typeSpecifier
    |   typeQualifier
    ;  
    
storageClassSpecifier
    :   'typedef'
    |   'extern'
    |   'static'
    ;

declarationList
    :   declaration
    |   declarationList declaration 
    ;


structDefintion
    : STRUCT IDENTIFIER '{' declaration+ '}' ';'
    | STRUCT IDENTIFIER '{' declaration+ '}' IDENTIFIER (',' IDENTIFIER)* ';'
    ;


