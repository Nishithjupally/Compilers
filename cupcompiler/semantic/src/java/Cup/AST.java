package Cup; 
import java.util.ArrayList;

// import jdk.nashorn.api.tree.BlockTree;
//import sun.util.resources.cldr.ext.CurrencyNames_qu;

public class AST{

    abstract public static class ASTNode {
        int lineNo;
        public int getLineNo() {
            return lineNo;
        }
        abstract public void accept(Visitor visitor);
        abstract public String getString(String space);
    }

    public static String sp = "  ";

    static String escapeSpecialCharacters(String text) {
            return text
                    .replaceAll("\\\\", "\\\\\\\\")
                    .replaceAll("\n", "\\\\n")
                    .replaceAll("\t", "\\\\t")
                    .replaceAll("\b", "\\\\b")
                    .replaceAll("\f", "\\\\f")
                    .replaceAll("\"", "\\\\\"")
                    .replaceAll("\r", "\\\\015")
                    .replaceAll("\033","\\\\033")
                    .replaceAll("\001","\\\\001")
                    .replaceAll("\002","\\\\002")
                    .replaceAll("\003","\\\\003")
                    .replaceAll("\004","\\\\004")
                    .replaceAll("\022","\\\\022")
                    .replaceAll("\013","\\\\013")
                    .replaceAll("\000", "\\\\000");
    }


    abstract public static class functionOrDeclaration extends ASTNode {
        public functionOrDeclaration(){}
        
        // String getString(String space){
        //     return "";
        // };

    }
    abstract public static class someexpression extends ASTNode {
        public String type;
        public someexpression(){
            type = "_no_type";
        }
        // String getString(String space){
        //     return "";
        // };

    }

    
    
    abstract public static class blockItem extends functionOrDeclaration{
        public blockItem (){}
        // String getString(){
        //     return "";
        // }

    } 

     abstract public static class statement extends blockItem{
        public statement(){}
        // String getString(){
        //     return "";
        // }

    }

     abstract public static class declaration extends blockItem{
        public declaration(){}
        // String getString(){
        //     return "";
        // }

    }
    public static class declarationSpecifier extends ASTNode{
        public String fullType;
        public String basicType;
        public declarationSpecifier(){
            fullType = "";
        }
        // public declarationSpecifier(String ft, String bt, int l){
        //     fullType = ft;
        //     basicType = bt;
        //     lineNo = l;
        // }
        public String getString(String space){
            return "\n"+space+"_declarationSpecifier\n"+space+sp+fullType+"\n"+space+sp+basicType+"\n";
        }
public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    public static class bool_const extends someexpression{
        public boolean value;
 //       public String typeid;
        public bool_const(boolean v, String type, int l){
            value = v;
 //           typeid = type;
            lineNo = l;
        }
        public String getString(String space){
            String f = Boolean.toString(value);
            return space+"#"+lineNo+"\n"+space+"_char_const\n"+space+sp+f;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }
    public static class string_const extends someexpression{
        public String value;
  //      public String typeid;
        public string_const(String v, String type, int l){
            value = v;
 //           typeid = type;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_string_const\n"+space+sp+value;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    public static class char_const extends someexpression{
        public char value;
    //    public String typeid;
        public char_const(char v, String type, int l){
            value = v;
    //        typeid = type;
            lineNo = l;
        }
        public String getString(String space){
            String f = Character.toString(value);
            return space+"#"+lineNo+"\n"+space+"_char_const\n"+space+sp+f;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    public static class int_const extends someexpression{
        public int value;
    //    public String typeid;
        public int_const(int v, String type,int l){
            value = v;
    //        typeid = type;
            lineNo = l;
        }
        public String getString(String space){
            String f = Integer.toString(value);
            return space+"#"+lineNo+"\n"+space+"_int_const\n"+space+sp+f;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    public static class float_const extends someexpression{
        public float value;
    //    public String typeid;
        public float_const(float v, String type,int l){
            value = v;
    //        typeid = type;
            lineNo = l;
        }
        public String getString(String space){
            String f = Float.toString(value);
            return space+"#"+lineNo+"\n"+space+"_float_const\n"+space+sp+f;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    public static class varname extends someexpression{
        public String name;
        public varname(String id, int l){
            name = id;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_varname\n"+space+sp+name;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    public static class logicalOrExpression extends someexpression{
        public someexpression e1;
        public someexpression e2;
        public logicalOrExpression(someexpression or, someexpression and, int l){
            //filename = f;
            e1 = or;
            e2 = and;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_logicalorExpression\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp);
        }
        public void accept(Visitor visitor) {
           visitor.visit(this);
       }
    }

    public static class logicalAndExpression extends someexpression{
        public someexpression e1;
        public someexpression e2;
        public logicalAndExpression(someexpression and, someexpression inor, int l){
            //filename = f;
            e1 = and;
            e2 = inor;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_logicalAndExpression\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp);
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class inclusiveOrExpression extends someexpression{
        public someexpression e1;
        public someexpression e2;
        public inclusiveOrExpression(someexpression inor, someexpression xor, int l){
            //filename = f;
            e1 = inor;
            e2 = xor;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_inclusiveOrExpression\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp);
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class exclusiveOrExpression extends someexpression{
        public someexpression e1;
        public someexpression e2;
        public exclusiveOrExpression(someexpression xor, someexpression bitand, int l){
            //filename = f;
            e1 = xor;
            e2 = bitand;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_exclusiveOrExpression\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp);
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }
    
    public static class andExpression extends someexpression{
        public someexpression e1;
        public someexpression e2;
        public andExpression(someexpression bitand, someexpression eq, int l){
            //filename = f;
            e1 = bitand;
            e2 = eq;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_andExpression\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp);
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class equalityExpression extends someexpression{
        public someexpression e1;
        public someexpression e2;
        public String op;
        public equalityExpression(someexpression eq, someexpression rel,String sym, int l){
            //filename = f;
            e1 = eq;
            e2 = rel;
            op = sym;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_equalityExpression\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+sp+op;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class relationalExpression extends someexpression{
        public someexpression e1;
        public someexpression e2;
        public String op;
        public relationalExpression(someexpression rel, someexpression sh,String sym, int l){
            //filename = f;
            e1 = rel;
            e2 = sh;
            op = sym;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_relationalExpression\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+sp+op;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class shiftExpression extends someexpression{
        public someexpression e1;
        public someexpression e2;
        public String op;
        public shiftExpression(someexpression sh, someexpression ad, String sym,int l){
            //filename = f;
            e1 = sh;
            e2 = ad;
            op = sym;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_shiftExpression\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+sp+op;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class additiveExpression extends someexpression{
        public someexpression e1;
        public someexpression e2;
        public String op;
        public additiveExpression(someexpression ad, someexpression me, String sym,int l){
            //filename = f;
            e1 = ad;
            e2 = me;
            op = sym;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_additiveExpression\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+sp+op;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class multiplicativeExpression extends someexpression{
        public someexpression e1;
        public someexpression e2;
        public String op;
        public multiplicativeExpression(someexpression me, someexpression ce, String sym,int l){
            //filename = f;
            e1 = me;
            e2 = ce;
            op = sym;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_multiplicativeExpression\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+sp+op;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class jumpStatement extends statement {
        public String s;
        public assignmentExpression ae;
        public jumpStatement(String stmt, int l){
            stmt = s;
            lineNo = l;
            ae = null;
        }
        public jumpStatement(String stmt, assignmentExpression e, int l){
            s = stmt;
            ae = e;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_jumpStatement\n"+space+sp+s+"\n"+ae.getString(space+sp);
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    // public static class jumpStatement extends statement {
    //     String s;
    //     assignmentExpression ae;
    //     public jumpStatement(String stmt, int l){
    //         stmt = s;
    //         //lineNo = l;
    //     }
    //     public jumpStatement(String stmt, assignmentExpression e, int l){
    //         s = stmt;
    //         ae = e;
    //        // lineNo = l;
    //     }
    // }

    public static class assignmentExpression extends someexpression{
        public someexpression e1;
        public someexpression e2;
        public String sym;

        public assignmentExpression(someexpression ei, someexpression ej,String op,int l){
            e1 = ei;
            e2 = ej;
            sym = op;
            lineNo = l;
        }

        public assignmentExpression(someexpression ei, int l){
            e1 = ei;
            sym=null;
            lineNo = l;
        }
        public String getString(String space){
            if(sym==null)
                return space+"#"+lineNo+"\n"+space+"_assignmentExpression\n"+e1.getString(space+sp)+"\n"+space+sp+sym;
            return space+"#"+lineNo+"\n"+space+"_assignmentExpression\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+sp+sym;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class functionReturn extends someexpression{
        public String name;
        public ArrayList<assignmentExpression> arguments;
        public functionReturn(){
            arguments = new ArrayList<>();
        }
        public String getString(String space){
            String str;
            str = space+"_functionReturn\n"+space+sp+name+"(\n";
            if(arguments.size()>0){
                for(assignmentExpression i : arguments){
                    str += i.getString(space+sp)+"\n";
                }
                
            }
            str += space+sp+")";
            return str;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }
    
    public static class castExpression extends someexpression{
        public String typeToCast;
        public  someexpression cast;
        public castExpression(String t, someexpression e,int l){
            typeToCast = t;
            cast = e;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_castExpression\n"+space+sp+typeToCast+"\n"+cast.getString(space+sp);
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class postfixExpression extends someexpression{
        public someexpression e;
        public String op;
        public String field;
        public someexpression ae;

        public postfixExpression(someexpression e1, someexpression ls,int l){
            e = e1;
            ae = ls;
            op = null;
            lineNo = l;
        }
        public postfixExpression(someexpression e1, String ops,int l){
            e = e1;
            op = ops;
            field = null;
            lineNo = l;
        }
        public postfixExpression(someexpression e1, String ops,String f,int l){
            e = e1;
            op = ops;
            field = f;
            lineNo = l;
        }
        public String getString(String space){
            if(op == null && field == null)
            {
                return space+"#"+lineNo+"\n"+space+"_postfixExpression\n"+e.getString(space+sp)+"\n"+ae.getString(space+sp);
            }
            else if(field == null && ae == null)
            {
                return space+"#"+lineNo+"\n"+space+"_postfixExpression\n"+e.getString(space+sp)+"\n"+space+sp+op+"\n";
            }
            else
            {
                return space+"#"+lineNo+"\n"+space+"_postfixExpression\n"+e.getString(space+sp)+"\n"+space+sp+op+"\n"+space+sp+field;
            }
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }
    
    public static class unaryExpression extends someexpression{
        public someexpression e;
        public String op;
        public String gett;
        public unaryExpression(String ops, someexpression e1,int l){
            op = ops;
            e = e1;
            gett = "";
            lineNo = l;
        }
        public unaryExpression(String ops,String ff,int l){
            op = ops;
            gett = ff;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_unaryExpression\n"+e.getString(space+sp)+"\n"+space+sp+op+"\n"+space+sp+gett;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    public static class initializer extends ASTNode{
        public ArrayList<assignmentExpression> aeList;
        public String type;
        public initializer(){
            aeList = new ArrayList<>();
        }
        public String getString(String space){
            String str;
            str = space+"_initializer\n"+space+sp+type+"(\n";
            if(aeList.size()>0){
                for(assignmentExpression i : aeList){
                    str += i.getString(space+sp)+"\n";
                }
                
            }
            str += space+sp+")";
            return str;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class initDeclarator extends ASTNode{
        public declarator name;
        public initializer value;

        public initDeclarator(declarator n){
            name = n;
            value = null;
        }
        public initDeclarator(declarator n, initializer val){
            name = n;
            value = val;
        }
        public String getString(String space){
            if(value == null)
            {
                return space+"_initDeclarator\n"+name.getString(space+sp);
            }
            else
            {
                return space+"_initDeclarator\n"+name.getString(space+sp)+"\n"+value.getString(space+sp);
            }
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    } 

    
    public static class formal extends ASTNode {
		public declarator var;
		public String type;
		public formal(declarator v, String t){
			var = v;
            type = t;
            if(var.isArray)type+="Array";
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_formal\n"+var.getString(space+sp)+"\n"+space+sp+type;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class simpleDeclaration extends declaration{
        public declarationSpecifier typeid;
        public ArrayList<initDeclarator> varList = new ArrayList<>();
        public simpleDeclaration(declarationSpecifier t, ArrayList<initDeclarator> l,int ln){
            typeid = t;
            varList = l;
            lineNo = ln;
        }
        public String getString(String space){
            String str;

            str = space+"#"+lineNo+"\n"+space+"_SimpleDeclaration\n"+space+sp+typeid+"(\n";
            if(varList.size()>0){
                for(initDeclarator i : varList){
                    str += i.getString(space+sp)+"\n";
                }
            }
            
            str += space+sp+")";
            return str;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    public static class templateDeclaration extends declaration{
        public dsDec typeid;
        public ArrayList<initDeclarator> varList = new ArrayList<>();
        public templateDeclaration(dsDec t, ArrayList<initDeclarator> l, int ln){
            typeid = t;
            varList = l;
            lineNo = ln;
        }
        public String getString(String space){
            String str;
            str = space+"#"+lineNo+"\n"+space+"_templateDeclaration\n"+space+sp+typeid+"(\n";
            if(varList.size()>0){
                for(initDeclarator i : varList){
                    str += i.getString(space+sp)+"\n";
                }
            }
            
            str += space+sp+")";
            return str;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    public static class declarator extends ASTNode{
        public boolean isArray;
        public String varName;
        public String arrayLength;

        public declarator(boolean isarray, String name, String length){
            isArray = isarray;
            varName = name;
            arrayLength = length;
        }
        public String getString(String space){
            if(isArray){
                return "_declarator"+varName+"["+arrayLength+"]";
            }
            else{
                return "_declarator"+varName;
            }
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class dsDec extends ASTNode{
        public String dsName;
        public String basicType;
        //public String fullType;
        public dsDec(String dsname, String basictype){
            dsName = dsname;
            basicType = basictype;
        }
        public String getString(String space){
            return "";
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
        
    }

    public static class functionCall extends blockItem{
        public String functionName;
        public ArrayList<assignmentExpression> params;
        public functionCall(){
            params = new ArrayList<>();
        }
        public String getString(String space){
            String str;
            str = space+"#"+lineNo+"\n"+space+"_functionCall\n"+space+sp+functionName+"(\n";
            if(params.size()>0){
                for(assignmentExpression i : params){
                    str += i.getString(space+sp)+"\n";
                }
            }
            
            str += space+sp+")";
            return str;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class compoundStatement extends statement{
        public ArrayList<blockItem> blockitemlist = new ArrayList<>();
        public compoundStatement(ArrayList<blockItem> ls, int l){
            blockitemlist = ls;
            lineNo = l;
        }

        public String getString(String space){
            String str;
            str = space+"#"+lineNo+"\n"+space+"_compoundStatement\n"+"(\n";
            if(blockitemlist.size()>0){
                for(blockItem i : blockitemlist){
                    str += i.getString(space+sp)+"\n";
                }
            }
            
            str += space+sp+")";
            return str;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class expressionStatement extends statement{
        public assignmentExpression exprs;
        public expressionStatement(assignmentExpression ls, int l){
            exprs = ls;
            lineNo = l;
        }
        public String getString(String space){
            String str;
            str = space+"#"+lineNo+"\n"+space+"_compoundStatement\n"+exprs.getString(space+sp);
            return str;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class whileStatement extends statement{
        public assignmentExpression rule;
        public statement stmt;
        public boolean isdowhile;

        public whileStatement(boolean isdo,assignmentExpression cond, statement st, int l){
            isdowhile = isdo;
            rule = cond;
            stmt = st;
            lineNo = l;
        }
        public String getString(String space){

            if(isdowhile)
            {
                return space+"#"+lineNo+"\n"+space+"_dowhile\n"+rule.getString(space+sp)+"\n"+stmt.getString(space+sp)+"\n";                
            }
            else
            {
                return space+"#"+lineNo+"\n"+space+"_whileloop\n"+rule.getString(space+sp)+"\n"+stmt.getString(space+sp)+"\n";                
            }
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class forStatement extends statement{
        public forCondition condition;
        public statement stmt;
        public forStatement(forCondition fc, statement s, int l){
            condition = fc;
            stmt = s;
            lineNo = l;
        }
        public String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_forloop\n"+condition.getString(space+sp)+"\n"+stmt.getString(space+sp)+"\n";                
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class forCondition extends ASTNode{
        public declaration inits;
        public ArrayList<AST.assignmentExpression> init;
        public ArrayList<AST.assignmentExpression> rule;
        public ArrayList<AST.assignmentExpression> post;
        
        public forCondition(declaration d, ArrayList<AST.assignmentExpression> l1, ArrayList<AST.assignmentExpression> l2, int l){
            inits = d;
            init = null;
            rule = l1;
            post = l2;
            lineNo = l;
        }

        public forCondition(ArrayList<AST.assignmentExpression> l0, ArrayList<AST.assignmentExpression> l1, ArrayList<AST.assignmentExpression> l2, int l){
            init = l0;
            inits = null;
            rule = l1;
            post = l2;
            lineNo = l;
        }
        public String getString(String space){
            String str;
            str = space+"#"+lineNo+"\n"+space+"_forcondition\n"+"(\n";
            if(init.size()>0){
                for(assignmentExpression e1 : init){
                    str += e1.getString(space+sp)+",";
                }  
            }
                          
            str += ";";
            if(rule.size()>0){
                for(assignmentExpression e2 : rule){
                    str += e2.getString(space+sp)+",";
                }
            }
            
            str += ";";
            if(post.size()>0){
                for(assignmentExpression e2 : post){
                    str += e2.getString(space+sp)+",";
                }
            }
            
            str += space+sp+")\n"; 
            return str;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    public static class ifStatement extends statement{
        public ArrayList<assignmentExpression> aeList;
        public ArrayList<statement> stmtList;
        public ifStatement(){
            aeList = new ArrayList<assignmentExpression>();
            stmtList = new ArrayList<>();
        }
        // public String getString(String space){
        //     String str;
        //     str = space+"#"+lineNo+"\n"+space+"_ifStatement\n"+"(\n";
        //     for(blockItem i : blockitemlist){
        //         str += i.getString(space+sp)+"\n";
        //     }
        //     str += space+sp+")";
        //     return str;
        // }
        public String getString(String space){
            String str;
            str = space+"#"+lineNo+"\n"+space+"_ifStatement\n"+"(\n";
            for(int i=0; i<aeList.size();i++){
                str += "_condition "+aeList.get(i).getString(space+sp)+"\n";
                str += space+"_statement "+stmtList.get(i).getString(space+sp)+"\n";
            }
            str += space+sp+")";
            return str;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }
    

    public static class globalDeclaration extends functionOrDeclaration{
        public initializer init;
        public declarator dec;
        public String filename;
        public globalDeclaration(String f, declarator dc, initializer in, int l){
            filename = f;
            dec = dc;
            init = in;
            lineNo = l;
        }
        public String getString(String space){
            String str;
            str = space+"#"+lineNo+"\n"+space+"_globalDeclaration\n"+init.getString(space+sp)+"\n"+dec.getString(space+sp)+"\n"+space+sp+"\""+filename+"\"";
            return str;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class functionDefinition extends functionOrDeclaration{
        public String name;
        public String returnType;
        public parameterTypeList argumentList;
        public compoundStatement body;
        public String filename;
        public functionDefinition(String f, String n,parameterTypeList flist, String t, compoundStatement b, int l){
            filename = f;
            name = n;
            argumentList = flist;
            returnType = t;
            body = b;
            lineNo = l;
        }
        public String getString(String space){
            String str;
            str = space+"#"+lineNo+"\n"+space+"_functionDefinition\n"+space+sp+name+"\n"+space+sp+returnType+"\n"+argumentList.getString(space+sp)+"\n"+body.getString(space+sp)+"\n"+space+sp+"\""+filename+"\"";
            return str;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }

    public static class parameterTypeList extends ASTNode{
        public String vd;
        public ArrayList<formal> parameters = new ArrayList<>();
        public parameterTypeList(ArrayList<formal> ps,int l){
            parameters = ps;
            lineNo = l;
            vd = null;
        }
        public parameterTypeList(String v, int l){
            vd = v;
            lineNo = l;
            //parameters = null;
        }
        public String getString(String space){
            String str;
            str = space+"#"+lineNo+"\n"+space+"_parameterTypeList\n"+space+sp+vd+"\n"+"(\n";
		if(parameters.size()>0){
			for(formal i : parameters){
                		str += i.getString(space+sp)+"\n";
            		}
		}
            
            str += space+sp+")";
            return str;
        }
        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
     }

    public static class structDefinition extends functionOrDeclaration{
        public String name;
        public ArrayList<declaration> declist;
        public ArrayList<String> namelist;
        public String fileName;

        public structDefinition(String f, String n, ArrayList<declaration> dl, int l){
            fileName = f;
            name = n;
            declist = dl;
            lineNo = l;
        }

        public structDefinition(String f, String n,ArrayList<String> flist, ArrayList<declaration> dl, int l){
            fileName = f;
            name = n;
            namelist = flist;
            declist = dl;
            lineNo = l;
        }
        public String getString(String space){
            return "";
        }

        public void accept(Visitor visitor) {
            visitor.visit(this);
         }
    }
    
    public static class program extends ASTNode {
        public ArrayList<functionOrDeclaration> flist;
        public String fileName;
        public program(ArrayList<functionOrDeclaration> fl, int l,String filename){
            flist = fl;
            lineNo = l;
            fileName = filename;
        }
        public String getString(String space){
            String str;
            str = space+"#"+lineNo+"\n"+space+"_program";
            if(flist.size()>0){
                for (functionOrDeclaration  f : flist ) {
                    str += "\n"+f.getString(space+sp);
                }
            }
            
            
            return str;
        }
        public void accept(Visitor visitor) {
           visitor.visit(this);
        }
    }
}
