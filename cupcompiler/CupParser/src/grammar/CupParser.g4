parser grammar CupParser;

options {
    tokenVocab = CupLexer;
}

@header{
    import java.util.ArrayList;
}

@members{
    String filename;
    public void setFilename(String f){
        filename = f;
    }

}


program 
    : t = text ? EOF

    ;                  

text
    : (f = functionOrDeclaration )+
    ;

functionOrDeclaration 
    :   fd= functionDefinition

    |   dec = declaration

    |   sd = structDefinition

    |   gdec = globalDeclaration

    ;

globalDeclaration 
    :  dec= declarator eq = '=' in = initializer ';'

    ;

functionDefinition 
    :   t = typeSpecifier fname = IDENTIFIER pl = parameterTypeList cs = compoundStatement

    ;

declaration 
    :   sd = simpleDeclaration

    |   td = templateDeclaration

    ;


simpleDeclaration
    :   d = declarationSpecifier in = initDeclaratorList sc = ';' 

    ;

templateDeclaration
    :   d = dsDec in = initDeclaratorList sc = ';'
   
    ;
    
dsDec
    :   ds = dataStructureName  '(' da = dsArgs ')'

    ;

dsArgs 
    : ts = typeSpecifier 
//    | templateDeclaration1
    ;

dataStructureName 
    :   s = STACK 
    |   q = QUEUE
    |   up = UNQ_PTR 
    |   v = VECTOR
    |   sp = SHARED_PTR 
    ;

// initDeclaratorList
//     :   initDeclarator
//     |   initDeclaratorList ',' initDeclarator
//     ;
    
initDeclaratorList 
    : i1 = initDeclarator (',' i2 = initDeclarator )*
    ;
    
initDeclarator
    :   d = declarator 

    |   d = declarator '=' in = initializer 
 
    ;

// declarator
//     :  // pointer? 
//     directDeclarator
//     ;

// pointer
//     :   '*' typeQualifierList?
//     |   '*' typeQualifierList? pointer
//     ;

pointer  
    :   '*'  (t = typeQualifier )?
    |   '*'  (t = typeQualifier )? (p = pointer )
    ;

// typeQualifierList
//     :   typeQualifier
//     |   typeQualifierList typeQualifier  
//     ;

typeQualifier  
    :   cns = 'const'  
//    |   'restrict'
    ;

// directDeclarator
//     :   IDENTIFIER
//     |   '(' declarator ')'
//     |   directDeclarator '[' array_params ']'
//     ;
declarator  
    :   id = IDENTIFIER 
 
    |   de = declarator '[' ap = array_params ']'
 
    ;

array_params  
    :   ic = INTEGER_CONST  
    |   id = IDENTIFIER  
    |    
    ;


initializer  
 
    :   ae = assignmentExpression 
    
    |   '{' e = expression '}'

    ;

// initializerList
//     :    initializer
//     |    initializerList ',' initializer
//     ;

// initializerList returns [ArrayList<AST.initializer> value]
//     @init{
//         $value = new ArrayList<>()
//     }
//     :    i1 = initializer {$value.add($i1.value)} (',' i2 = initializer {$value.add($i2.value)})*
//     ;

assignmentExpression  
    :   ce = conditionalExpression
    
    |   ue = unaryExpression ao = assignmentOperator ae = assignmentExpression
 
    |   c = constant 
 
    |   fr = functionReturn
 
    ;

assignmentOperator 
    :   '='  
    | '*='  
    | '/=' 
    | '%='  
    | '+=' 
    | '-='  
    | '<<=' 
    | '>>=' 
    | '&='  
    | '^=' 
    | '|='  
    ;

/*removing this shortcut if coz this sucks in semantic analysis */
// conditionalExpression
//     :   logicalOrExpression ('?' expression ':' conditionalExpression)?
//     ;
conditionalExpression  
    :   le = logicalOrExpression 
 
    ;

unaryExpression  
    :   p = postfixExpression  
    |   pl = '++' u1 = unaryExpression
 
    |   m = '--' u2 = unaryExpression
 
    |   uo = unaryOperator ce = castExpression
 
    |   s = 'sizeof' u3 = unaryExpression
    
    |   s = 'sizeof' '(' t = typeSpecifier ')'
 
    |   amp = '&&' id = IDENTIFIER
 
    ;

unaryOperator  
    :   '&'  
    | '*'  
    | '+'  
    | '-'  
    | '~' 
    | '!'  
    ;
 
postfixExpression  
    :   p = primaryExpression 
//    |   pf1 = postfixExpression '(' argumentExpressionList? ')'
    |   f = functionReturn 
    |   p1 = postfixExpression '[' e = assignmentExpression ']'
 
    |   p2 = postfixExpression '.' id = IDENTIFIER
 
    |   p3 = postfixExpression '->' id1 = IDENTIFIER
 
    |   p4 = postfixExpression '++'
 
    |   p5 = postfixExpression '--'
 
    ;

expression   
    :  
    |    a1 = assignmentExpression  (',' a2 = assignmentExpression )*
    ;

primaryExpression  
    :   id = IDENTIFIER
 
    |   c = constant
 
    |   '(' e = assignmentExpression ')'
 
    ;

constant  
    :   i = INTEGER_CONST
    
    |   f = FLOAT_CONST
 
    |   c = CHAR_CONST
    
    |   b = BOOL_CONST
 
    |   s = STRING_LITERAL
 
    ;



// argumentExpressionList returns [ArrayList<assignmentExpression> value]
//     :   assignmentExpression
//     |   argumentExpressionList  ',' assignmentExpression
//     ;

argumentExpressionList
    :   e1 = assignmentExpression(',' e2 = assignmentExpression )*
    ;

logicalOrExpression  
    :   and = logicalAndExpression 
 
    |   or = logicalOrExpression orr = '||' and = logicalAndExpression
 
    ;

logicalAndExpression 
    :   inor = inclusiveOrExpression

    |   and = logicalAndExpression andd = '&&' inor = inclusiveOrExpression
 
    ;

exclusiveOrExpression 
    :   bitand = andExpression
 
    |   xor = exclusiveOrExpression xxor = '^' bitand = andExpression
 
    ;

inclusiveOrExpression 
    :   xor = exclusiveOrExpression
 
    |   inor = inclusiveOrExpression inorr = '|' xor = exclusiveOrExpression
 
    ;

andExpression  
    :   eq = equalityExpression
 
    |   bitand = andExpression f = '&' eq = equalityExpression
 
    ;

equalityExpression 
    :   rel = relationalExpression
 
    |   eq = equalityExpression eqq = '==' rel = relationalExpression
 
    |   eq = equalityExpression neq = '!=' rel = relationalExpression
 
    ;

relationalExpression  
    :   sh = shiftExpression
 
    |   rel = relationalExpression lt = '<' sh = shiftExpression
 
    |   rel = relationalExpression gt = '>' sh = shiftExpression
 
    |   rel = relationalExpression lte = '<=' sh = shiftExpression
 
    |   rel = relationalExpression gte = '>=' sh = shiftExpression
 
    ;

shiftExpression  
    :   ad = additiveExpression
 
    |   sh = shiftExpression ssh = '<<' ad = additiveExpression
 
    |   sh = shiftExpression ssh = '>>' ad = additiveExpression
 
    ;   

multiplicativeExpression  
    :   ce = castExpression
 
    |  me = multiplicativeExpression mul = '*' ce = castExpression
 
    |   me = multiplicativeExpression div = '/' ce = castExpression
 
    |   me = multiplicativeExpression mod = '%' ce = castExpression
 
    ;

additiveExpression 
    :   me = multiplicativeExpression
 
    |   ad = additiveExpression p = '+' me = multiplicativeExpression
 
    |   ad = additiveExpression s = '-' me = multiplicativeExpression
 
    ;   
    

castExpression  
    :   '(' t = typeSpecifier ')' ce = castExpression
    |   ue = unaryExpression  
    |   c = constant 
    ;


typeSpecifier 
    :   v = VOID (p = pointer  )*
    |   b = BOOL  (p = pointer  )*          
    |   c = CHAR  (p = pointer  )*
    |   i = INT  (p = pointer )*
    |   f = FLOAT (p = pointer  )*
    |   d = DOUBLE   (p = pointer )*
    |   l = LONG   (p = pointer  )*
    |   str = STRING    (p = pointer )*
    |   st = STRUCT id = IDENTIFIER  (p = pointer  )*
    |   td = dsDec 
    ;

parameterTypeList  
    :   par = '(' fpl = functionParameterList ')'  
    |   par = '('')' 
    |   par = '(' v = VOID ')'  
    ;


// functionParameterList
//     :   typeSpecifier directDeclarator (',' typeSpecifier directDeclarator)*
//     ;
functionParameterList 
    :   f1 = formal  (',' f2 = formal )*
    ;

formal  
    :   t1 = typeSpecifier d1 = declarator
 
    ;

blockItemList 
    :
    |   (b = blockItem  )+
    ;

blockItem 
    :   st = statement
 
    |   dec = declaration
 
    |   fc = functionCall
 
    
    ;

// functionCall returns [AST.functionCall value]
//     :   IDENTIFIER '(' identifierList? ')' ';'
//     ;

functionCall  
    :   id = IDENTIFIER  '(' (e = expression)? ')' ';'
    ;

// identifierList
//     :   expression (',' expression)*
//     |   functionReturn
//     ;

// identifierList returns [ArrayList<ArrayList<AST.assignmentExpression>> value]
//     @init{
//         $value = new ArrayList<ArrayList<>>()
//     }
//     :   e1 = expression {$value.add($e1.value);} (',' e2 = expression {$value.add($e2.value);})*
//     ;

// identifierList returns [ArrayList<ArrayList<AST.assignmentExpression>> value]
//     @init{
//         $value = new ArrayList<ArrayList<>>()
//     }
//     :   e1 = expression {$value.add($e1.value);} (',' e2 = expression {$value.add($e2.value);})*
//     ;


statement  
     : //  ls = labeledStatement
    // {
    //     $value = $ls.value.
    // }
    // |   
    cs = compoundStatement
 
    |   es = expressionStatement
 
    |   ws = whileStatement
 
    |   fs = forStatement
    
    |   is = ifStatement
 
    |   js = jumpStatement
 
    // |   ss = switchStatement
    // {
    //     $value = $ss.value;
    // }
    
    ;


// labeledStatement
//     :   IDENTIFIER ':' statement
//     |   CASE constantExpression ':' statement
//     |   DEFAULT ':' statement
//     ;
    
compoundStatement 
    :   pr = '{' b = blockItemList '}'
 
    ;

/******************************
empty {} removed from language
*****************************/ 

// constantExpression
//     :   conditionalExpression
//     ;

expressionStatement 
    :   (e = assignmentExpression ) sc = ';'  
    ;

ifStatement  
    :   IF '(' e1 = assignmentExpression ')' s1 = statement
 
    (ELSE IF '(' e2 = assignmentExpression ')' s2 = statement  )* 
    (ELSE s3 = statement )?
    ;

// switchStatement
//     :   SWITCH '(' expression ')' statement
//     ; 

whileStatement  
    :    w = WHILE '(' e = assignmentExpression ')' st = statement
 
    |    du = DO st = statement WHILE '(' e = assignmentExpression ')' ';'
 
    ;
    
forStatement  
    :   f = FOR '(' fc = forCondition ')' st = statement
 
    ;
    
forCondition  
    :   dec = declaration  e1 = expression? sc= ';' e2 = expression?
 
    |   e1 = expression? ';' e2 = expression? sc = ';' e3 = expression?
 
    ;

// forDeclaration
//     :   declarationSpecifier+ initDeclaratorList
//     |   declarationSpecifier+
//   ;

// forExpression
//     :   assignmentExpression
//     |   forExpression ',' assignmentExpression 
//     ;

// jumpStatement returns [AST.jumpStatement value]
//     :   cn = CONTINUE ';' 
//     {
//         $value = new jumpStatement($cn.getText(),$cn.getLine());
//     }
//     |   br = BREAK ';'
//     {
//         $value = new jumpStatement($br.getText(), $br.getLine());
//     }
//     |   re = RETURN ';'
//     {
//         $value = new jumpStatement($re.getText(), $re.getLine());
//     }
//     |   re = RETURN ae = assignmentExpression ';'
//     {
//         $value = new jumpStatement($re.getText(), $ae.value ,$re.getLine());
//     }
//     ;

jumpStatement 
    :   cn = CONTINUE ';' 
 
    |   br = BREAK ';'
 
    |   re = RETURN ';'
 
    |   re = RETURN ae = assignmentExpression ';'
 
    ;

functionReturn  
    :   id = IDENTIFIER   '(' (ael = argumentExpressionList  )? ')' 
        
    ;

// declarationSpecifier
//     :   storageClassSpecifier
//     |   typeSpecifier
//     |   typeQualifier
//     ;  
    
// declarationSpecifier returns [String value]
//     :  {$value = "";} (scs = storageClassSpecifier{$value+=$scs.value; $value+=" "}?)
//      (tq = typeQualifier{$value+=$tq.value; $value+=" "}?)
//      ts = typeSpecifier {$value+=$ts.value}
//     ;  

declarationSpecifier  
    :(scs = storageClassSpecifier )?
     (tq = typeQualifier )?
     ts = typeSpecifier  
    ;  

storageClassSpecifier 
    :   td = 'typedef' 
    |   ex = 'extern'  
    ;

declarationList  
    : 
    |   (d = declaration )+ 
    ;

nameList  
    : i1 = IDENTIFIER  (',' i2 = IDENTIFIER  )*
    ;

structDefinition 
   
    : st = STRUCT id = IDENTIFIER '{' dl = declarationList '}' ';'
 
    | st = STRUCT id = IDENTIFIER '{' dl = declarationList '}' nl = nameList ';'
 
    ;
