package Cup;

import java.util.ArrayList;
import Cup.AST.functionDefinition;
import Cup.AST.functionOrDeclaration;
import Cup.AST.string_const;
import Cup.AST;

class StatementVisitorImpl extends ExpressionVisitorImpl {
    private boolean iscoercible(String e1, String e2){
        if(Global.Constants.ERROR_TYPE.equals(e1)||Global.Constants.ERROR_TYPE.equals(e2))
            return false;
        if(Global.Constants.INT_ARRAY.equals(e1)&&!Global.Constants.INT_ARRAY.equals(e2)
        ||!Global.Constants.INT_ARRAY.equals(e1)&&Global.Constants.INT_ARRAY.equals(e2)){
            return false;
        }
        if((Global.Constants.STRING_TYPE.equals(e1)&&!Global.Constants.STRING_TYPE.equals(e2))
        ||(!Global.Constants.STRING_TYPE.equals(e1)&&Global.Constants.STRING_TYPE.equals(e2))){
            return false;
        }
        if(Global.Constants.CHAR_TYPE.equals(e1)&&Global.Constants.FLOAT_TYPE.equals(e2)){
            return false;
        }
        return true;
    }
    
    public void visit(AST.program prog){
	
        Global.filename = prog.fileName;
        for(AST.functionOrDeclaration frd: prog.flist){
            if(frd instanceof functionDefinition){
                AST.functionDefinition fDefn = (AST.functionDefinition)frd;
                
                ArrayList<String> temp = new ArrayList<>();
                if(fDefn.argumentList.parameters == null){
                    Global.scopeTable.insertFunction(fDefn.name, fDefn.returnType,0,temp );
                    continue;
                }
                for(AST.formal f: fDefn.argumentList.parameters){
                    temp.add(f.type);
                }
                if(Global.scopeTable.lookUpFunction(fDefn.name)==null)
                    Global.scopeTable.insertFunction(fDefn.name, fDefn.returnType,fDefn.argumentList.parameters.size(),temp );
                    
                else {
                    Global.errorReporter.report(Global.filename,fDefn.getLineNo(),"function with name "+ "\'"+fDefn.name+"\' already exists");
                }
            }
        }
        Global.scopeTable.enterScope();
        for(functionOrDeclaration frd: prog.flist){
            frd.accept(this);
        }
        Global.scopeTable.exitScope();
    }

    public void visit(AST.functionDefinition fDefn){

        Global.scopeTable.enterScope();
        Global.currentFunction = fDefn.name;
       
        if(!(fDefn.argumentList.parameters == null)){
            for(AST.formal f: fDefn.argumentList.parameters){
             
                Global.scopeTable.insert(f.var.varName, f.type);
            }
        }
        fDefn.body.accept(this);
        Global.scopeTable.exitScope();
    }

    public void visit(AST.structDefinition sDefn){
        //we will discuss it later
    }

    public void visit(AST.globalDeclaration gDec){

    }

    public void visit(AST.simpleDeclaration sDec){
        
        for(AST.initDeclarator iDec : sDec.varList){
            if(iDec.value==null)continue;

            iDec.value.accept(this);
            if(iDec.value.aeList.size()>0)iDec.value.type = iDec.value.aeList.get(0).type;
        }
        for(AST.initDeclarator iDec : sDec.varList){
            if(iDec.value==null){
                if(Global.scopeTable.lookUpLocal(iDec.name.varName)==null){
                    Global.scopeTable.insert(iDec.name.varName,sDec.typeid.basicType);
                }
                else{
                    //print error
                    Global.errorReporter.report(Global.filename,sDec.getLineNo(),"variable with name "+ "\'"+iDec.name.varName+"\' already exists");
                }
                
            }
            else if(iscoercible(iDec.value.type, sDec.typeid.basicType)){
                if(iDec.name.isArray){
                    if(Global.scopeTable.lookUpLocal(iDec.name.varName)==null){
                        Global.scopeTable.insert(iDec.name.varName,sDec.typeid.basicType+"Array");
                    }
                    else{
                        //print error
                        Global.errorReporter.report(Global.filename,sDec.getLineNo(),"variable with name "+ "\'"+iDec.name.varName+"\' already exists");
                    }
                }
                else{
                    if(Global.scopeTable.lookUpLocal(iDec.name.varName)==null){
                        Global.scopeTable.insert(iDec.name.varName,sDec.typeid.basicType);
                       
                    }
                    else{
                        //print error
                        Global.errorReporter.report(Global.filename,sDec.getLineNo(),"variable with name "+ "\'"+iDec.name.varName+"\' already exists");
                    }
                }
            }
            else{
                //print error
                Global.errorReporter.report(Global.filename,sDec.getLineNo(),"cannot convert "+ "\'"+ iDec.value.type+"\'"+" to "+" \'"+sDec.typeid.basicType+"\'");
            }
        }

    }


  
    public void visit(AST.initializer init){
        for(AST.assignmentExpression ae: init.aeList ){
            ae.accept(this);
        }
        
        String temp = init.aeList.get(0).type;
        for(AST.assignmentExpression ae: init.aeList ){
            if(ae.type!=temp||Global.Constants.ERROR_TYPE.equals(ae.type)){
                //print error
                Global.errorReporter.report(Global.filename,ae.getLineNo(),"error expected in initializer value");
                init.type = Global.Constants.ERROR_TYPE;
                break;
            }
        }

    }

    public void visit(AST.templateDeclaration tDec){
        // we  will discuss it later
    }

    public void visit(AST.forCondition cnd){
        
        if(cnd.init == null)cnd.inits.accept(this);
        if(cnd.inits == null)
            for(AST.assignmentExpression ae: cnd.init){
                ae.accept(this);
            }
        for(AST.assignmentExpression ae: cnd.rule){
            ae.accept(this);
        }
        for(AST.assignmentExpression ae: cnd.post){
            ae.accept(this);
        }
        
    }
    
    public void visit(AST.ifStatement stmt){
        Global.scopeTable.enterScope();
            for(AST.assignmentExpression ae : stmt.aeList){
                ae.accept(this);
            }
            for(AST.statement st : stmt.stmtList){
                st.accept(this);
            }
        Global.scopeTable.exitScope();
    }

    public void visit(AST.forStatement stmt){
        Global.scopeTable.enterScope();
        stmt.condition.accept(this);
        stmt.stmt.accept(this);
        Global.scopeTable.exitScope();
    }

    public void visit(AST.whileStatement stmt){
        Global.scopeTable.enterScope();
        stmt.rule.accept(this);
        stmt.stmt.accept(this);
        Global.scopeTable.exitScope();
    }

    public void visit(AST.expressionStatement stmt){
        stmt.exprs.accept(this);
    }

    public void visit(AST.jumpStatement stmt){
        if(stmt.s == "return" && stmt.ae!=null){
            stmt.ae.accept(this);
            if(!Global.Constants.ERROR_TYPE.equals(stmt.ae.type))
                if(!checkFnRet(stmt.ae)){
                    //printerror
                }
        }
    }

    public void visit(AST.compoundStatement stmt){
        for(AST.blockItem st: stmt.blockitemlist){
            st.accept(this);
        }
    }

    private boolean checkFnRet(AST.assignmentExpression expr){
        FunctionTable ret = Global.scopeTable.lookUpFunction(expr.type);
        if(iscoercible(ret.returnType,expr.type)) return true;
        return false;
    }

    public void visit(AST.formal fm){}

    public void visit(AST.parameterTypeList ptl){}

    public void visit(AST.functionCall fcall){}

    public void visit(AST.dsDec dsdec){}

    public void visit(AST.declarator dec){}

    public void visit(AST.declarationSpecifier decspec){}

	public void visit(AST.initDeclarator idec){}

}
