package Cup;
import Cup.AST;
interface Visitor {
    
    public void visit(AST.program prog);
	
    public void visit(AST.declarationSpecifier decspec);
	
    public void visit(AST.functionDefinition fd);

    public void visit(AST.structDefinition sd);

    public void visit(AST.globalDeclaration gd);

    public void visit(AST.formal fm);

    public void visit(AST.parameterTypeList ptl);

    public void visit(AST.ifStatement ifstmt);

    public void visit(AST.forCondition fcond);

    public void visit(AST.forStatement fstmt);

    public void visit(AST.whileStatement wstmt);

    public void visit(AST.expressionStatement expstmt);

    public void visit(AST.compoundStatement cstmt);

    public void visit(AST.jumpStatement jstmt);

    public void visit(AST.functionCall fcall);

    public void visit(AST.dsDec dsdec);

    public void visit(AST.declarator dec);

    public void visit(AST.templateDeclaration tdec);

    public void visit(AST.simpleDeclaration sdec);

    public void visit(AST.initDeclarator idec);

    public void visit(AST.initializer init);
    
    public void visit(AST.unaryExpression expr);
    
    public void visit(AST.postfixExpression expr);
    
    public void visit(AST.castExpression expr);
    
    public void visit(AST.functionReturn expr);
    
    public void visit(AST.assignmentExpression expr);
    
    public void visit(AST.multiplicativeExpression expr);
    
    public void visit(AST.additiveExpression expr);
    
    public void visit(AST.shiftExpression expr);
    
    public void visit(AST.int_const expr);

    public void visit(AST.char_const expr);

    public void visit(AST.float_const expr);
    
    public void visit(AST.string_const expr);
    
    public void visit(AST.bool_const expr);

    public void visit(AST.relationalExpression expr);

    public void visit(AST.equalityExpression expr);

    public void visit(AST.andExpression expr);

    public void visit(AST.exclusiveOrExpression expr);

    public void visit(AST.inclusiveOrExpression expr);

    public void visit(AST.logicalAndExpression expr);

    public void visit(AST.logicalOrExpression expr);

    public void visit(AST.varname expr);
}
