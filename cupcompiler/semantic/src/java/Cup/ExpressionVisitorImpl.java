package Cup;

import java.util.ArrayList;

import Cup.AST.someexpression;


abstract class ExpressionVisitorImpl implements Visitor {

    private boolean nonIntegerExpression(AST.someexpression e1, AST.someexpression e2) {
        return ((!Global.Constants.INT_TYPE.equals(e1.type)&&!Global.Constants.BOOL_TYPE.equals(e1.type)) || (!Global.Constants.INT_TYPE.equals(e2.type)&&!Global.Constants.BOOL_TYPE.equals(e2.type)));
    }

    public boolean isCompatible(AST.someexpression e1, AST.someexpression e2){
        if(Global.Constants.STRING_TYPE.equals(e1.type)||Global.Constants.STRING_TYPE.equals(e2.type))
            return false;
        return true;
    }
    public boolean isCompatibleAddition(AST.someexpression e1, AST.someexpression e2){
        if(Global.Constants.STRING_TYPE.equals(e1.type)&&Global.Constants.STRING_TYPE.equals(e2.type))
            return true;
        else if(Global.Constants.STRING_TYPE.equals(e1.type)||Global.Constants.STRING_TYPE.equals(e2.type))
            return false;
        return true;
    }
    public String decideType(AST.someexpression e1, AST.someexpression e2){
        if(Global.Constants.FLOAT_TYPE.equals(e1.type)||Global.Constants.FLOAT_TYPE.equals(e2.type))
            return Global.Constants.FLOAT_TYPE;
        
        return e1.type;
    }

    private boolean iscoercible(someexpression e1, someexpression e2){
        if(Global.Constants.ERROR_TYPE.equals(e1.type)||Global.Constants.ERROR_TYPE.equals(e2.type))
            return false;
        if(Global.Constants.INT_ARRAY.equals(e1.type)&&!Global.Constants.INT_ARRAY.equals(e2.type)
        ||!Global.Constants.INT_ARRAY.equals(e1.type)&&Global.Constants.INT_ARRAY.equals(e2.type)){
            return false;
        }
        if(Global.Constants.STRING_TYPE.equals(e1.type)&&!Global.Constants.STRING_TYPE.equals(e2.type)
        ||!Global.Constants.STRING_TYPE.equals(e1.type)&&Global.Constants.STRING_TYPE.equals(e2.type)){
            return false;
        }
        if(Global.Constants.CHAR_TYPE.equals(e1.type)&&Global.Constants.FLOAT_TYPE.equals(e2.type)){
            return false;
        }
        return true;
    }

    public void visit(AST.unaryExpression expr){
        if(expr.gett == ""){
            expr.e.accept(this);
            if(expr.op == "sizeof")expr.type = Global.Constants.INT_TYPE;
            
            else if(expr.op=="++"||expr.op=="--"){
                if(!Global.Constants.INT_TYPE.equals(expr.type)){
                    

                    Global.errorReporter.report(Global.filename,expr.getLineNo(),"increment/decrement cannot be done on "+expr.e.type);
                    expr.type = Global.Constants.ERROR_TYPE;
                }
                else expr.type = expr.e.type;
            }
            
        }
        else{
            if(expr.op == "sizeof")expr.type = Global.Constants.INT_TYPE;
            else expr.type = Global.Constants.INT_TYPE;
            
        }
    }

    public void visit(AST.castExpression expr){
        expr.type = expr.typeToCast;
    }

    public void visit(AST.multiplicativeExpression expr){
        expr.e1.accept(this);
        expr.e2.accept(this);
        if(!isCompatible(expr.e1, expr.e2)){
            Global.errorReporter.report(Global.filename,expr.getLineNo(),"incompatible types "+expr.e1.type+" , " + expr.e2.type + " for "+ expr.op +" operator");
           expr.type = Global.Constants.ERROR_TYPE;
        }
        else{
            
            expr.type = decideType(expr.e1, expr.e2);
        }
    }

    public void visit(AST.additiveExpression expr){
        expr.e1.accept(this);
        expr.e2.accept(this);
        if(!isCompatibleAddition(expr.e1, expr.e2)){
 
             Global.errorReporter.report(Global.filename,expr.getLineNo(),"incompatible types "+expr.e1.type+" , " + expr.e2.type + " for "+ expr.op +" operator");
            expr.type = Global.Constants.ERROR_TYPE;
        }
        else{
            expr.type = decideType(expr.e1, expr.e2);
        }
    }

    public void visit(AST.shiftExpression expr){
        expr.e1.accept(this);
        expr.e2.accept(this);
        if(nonIntegerExpression(expr.e1, expr.e2)){
            //print error
            Global.errorReporter.report(Global.filename,expr.getLineNo(),"incompatible types "+expr.e1.type+" , " + expr.e2.type + " for "+ expr.op +" operator");
            expr.type = Global.Constants.ERROR_TYPE;
        }
        else{
            expr.type = Global.Constants.INT_TYPE;
        }
    }

    public void visit(AST.relationalExpression expr){
        expr.e1.accept(this);
        expr.e2.accept(this);
        if(!isCompatible(expr.e1, expr.e2)){
            //print error
            Global.errorReporter.report(Global.filename,expr.getLineNo(),"incompatible types "+expr.e1.type+" , " + expr.e2.type + " for "+ expr.op +" operator");
            expr.type = Global.Constants.ERROR_TYPE;
        }
        else{
            expr.type = Global.Constants.BOOL_TYPE;
        }
    }

    public void visit(AST.equalityExpression expr){
        expr.e1.accept(this);
        expr.e2.accept(this);
        if(!isCompatible(expr.e1, expr.e2)){
            //print error
            Global.errorReporter.report(Global.filename,expr.getLineNo(),"incompatible types "+expr.e1.type+" , " + expr.e2.type + " for "+ expr.op +" operator");
            expr.type = Global.Constants.ERROR_TYPE;
        }
        else{
            expr.type = Global.Constants.BOOL_TYPE;
        }
    }

    public void visit(AST.andExpression expr){
        expr.e1.accept(this);
        expr.e2.accept(this);
        if(nonIntegerExpression(expr.e1, expr.e2)){
            //print error
            Global.errorReporter.report(Global.filename,expr.getLineNo(),"incompatible types "+expr.e1.type+" , " + expr.e2.type + " for "+ "&" +" operator");
            expr.type = Global.Constants.ERROR_TYPE;
        }
        else{
            expr.type = Global.Constants.INT_TYPE;
        }
    }

    public void visit(AST.inclusiveOrExpression expr){
        expr.e1.accept(this);
        expr.e2.accept(this);
        if(nonIntegerExpression(expr.e1, expr.e2)){
            //print error
            Global.errorReporter.report(Global.filename,expr.getLineNo(),"incompatible types "+expr.e1.type+" , " + expr.e2.type + " for "+ "|" +" operator");
            expr.type = Global.Constants.ERROR_TYPE;
        }
        else{
            expr.type = Global.Constants.INT_TYPE;
        }
    }

    public void visit(AST.exclusiveOrExpression expr){
        expr.e1.accept(this);
        expr.e2.accept(this);
        if(nonIntegerExpression(expr.e1, expr.e2)){
            //print error
            Global.errorReporter.report(Global.filename,expr.getLineNo(),"incompatible types "+expr.e1.type+" , " + expr.e2.type + " for "+ "^" +" operator");
            expr.type = Global.Constants.ERROR_TYPE;
        }
        else{
            expr.type = Global.Constants.INT_TYPE;
        }
    }

    public void visit(AST.logicalAndExpression expr){
        expr.e1.accept(this);
        expr.e2.accept(this);
        if(nonIntegerExpression(expr.e1, expr.e2)){
            //print error
            Global.errorReporter.report(Global.filename,expr.getLineNo(),"incompatible types "+expr.e1.type+" , " + expr.e2.type + " for "+ "&&" +" operator");
            expr.type = Global.Constants.ERROR_TYPE;
        }
        else{
            expr.type = Global.Constants.INT_TYPE;
        }
    }

    public void visit(AST.logicalOrExpression expr){
        expr.e1.accept(this);
        expr.e2.accept(this);
        if(nonIntegerExpression(expr.e1, expr.e2)){
            //print error
            Global.errorReporter.report(Global.filename,expr.getLineNo(),"incompatible types "+expr.e1.type+" , " + expr.e2.type + " for "+ "||" +" operator");
            expr.type = Global.Constants.ERROR_TYPE;
        }
        else{
            expr.type = Global.Constants.INT_TYPE;
        }
    }

    public void visit(AST.assignmentExpression expr){
        if(expr.sym == null){
            expr.e1.accept(this);
            
            expr.type = expr.e1.type;
            
        }
        else{
            expr.e1.accept(this);
            expr.e2.accept(this);
           
                if(!iscoercible(expr.e1,expr.e2)){
                    //print error
                    Global.errorReporter.report(Global.filename,expr.getLineNo(),"cannot convert "+expr.e2.type+" to " + expr.e1.type);
                    expr.type = Global.Constants.ERROR_TYPE;
                }
                else{
                    expr.type = expr.e1.type;
                }
                
        }
    }

    public void visit(AST.postfixExpression expr){
        if(expr.op==null){
            expr.e.accept(this);
            expr.ae.accept(this);
            if(!Global.Constants.INT_ARRAY.equals(expr.e.type)){
                //print error
                expr.type = Global.Constants.ERROR_TYPE;
            }
            else if(!Global.Constants.INT_TYPE.equals(expr.ae.type)){
                //print error
                expr.type = Global.Constants.ERROR_TYPE;
            }
            expr.type = expr.e.type;
        }
        else if(expr.field==null){
            expr.e.accept(this);
            if(!Global.Constants.INT_TYPE.equals(expr.e.type)){
                //print error
                expr.type = Global.Constants.ERROR_TYPE;
            }
            expr.type = Global.Constants.INT_TYPE;
        }
        else{
            //we will discuss it later
        }
    }

    public void visit(AST.functionReturn expr){
        //we will discuss it later
        ArrayList<String> temp = new ArrayList<String>();
       
        if(expr.arguments.size()>0){
            for(AST.assignmentExpression ae: expr.arguments){
                ae.accept(this);
                temp.add(ae.type);
            }
        }
       
        FunctionTable ret = Global.scopeTable.lookUpFunction(expr.name);
       
        if(ret == null){
            //print error
            Global.errorReporter.report(Global.filename,expr.getLineNo(),"unidentified function "+ expr.name);
            expr.type = Global.Constants.ERROR_TYPE;
        }
        else {
            
            if(ret.numArgs!=temp.size()){

                Global.errorReporter.report(Global.filename,expr.getLineNo(),"expected "+Integer.toString(ret.numArgs)+ " arguments  while given " + Integer.toString(temp.size())+" arguments");
            }
            else if(checkEquality(ret.typeArgs, temp)){
                String expected = "";
                if(ret.typeArgs.size()>0){
                    for(String s : ret.typeArgs){
                        expected+=(s+" ,");
                    }
                }
                
                String given = "";
                if(temp.size()>0){
                    for(String s: temp){
                        given+=(s+" ,");
                    }
                }
                
                Global.errorReporter.report(Global.filename,expr.getLineNo(),"mismatched argument types :- \n   ex[ected: "+expected+"\n    given: "+given);
            }
            else expr.type = ret.returnType;
        }
    }


    public boolean checkEquality(ArrayList<String> l1, ArrayList<String> l2){
        for(int i=0;i<l1.size();i++){
            if(l1.get(i)!=l2.get(i))return false;
        }
        return true;
    }
    public void visit(AST.varname expr){
        
        if(Global.scopeTable.lookUpGlobal(expr.name)==null){
            //print error
            Global.errorReporter.report(Global.filename,expr.getLineNo(),"use of undeclared identifer "+expr.name);
            expr.type = Global.Constants.ERROR_TYPE;
        }
        else{
            expr.type = Global.scopeTable.lookUpGlobal(expr.name);
        }
    }

    public void visit(AST.int_const expr) {
        
        expr.type = Global.Constants.INT_TYPE;
    }

    public void visit(AST.char_const expr) {
        
        expr.type = Global.Constants.CHAR_TYPE;
    }

    public void visit(AST.float_const expr) {
        
        expr.type = Global.Constants.FLOAT_TYPE;
    }

    public void visit(AST.string_const expr) {
        
        expr.type = Global.Constants.STRING_TYPE;
    }

    public void visit(AST.bool_const expr) {
        
        expr.type = Global.Constants.BOOL_TYPE;
    }
}