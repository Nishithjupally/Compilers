package Cup;
import java.util.*;


import Cup.FunctionTable;
public class ScopeTable<T> {
	private int scope;
	private ArrayList<FunctionTable> functionTable = new ArrayList<FunctionTable>();
	private ArrayList<HashMap<String, T>> maps=new ArrayList<HashMap<String, T>>();
	public ScopeTable(){
		scope = 0;
		maps.add(new HashMap<String, T>());
	}
	void insertFunction(String n, String ret,int k, ArrayList<String> ts){
		functionTable.add(new FunctionTable(n,ret,k,ts));
	}
	void insert(String s, T t){
		maps.get(scope).put(s,t);
	}
	void remove(String s){
		maps.get(scope).remove(s);
	}
	void enterScope(){
		scope++;
		maps.add(new HashMap<String, T>());
	}
	void exitScope(){
		if (scope>0){
			maps.remove(scope);
			scope--;
		}
	}	
	
	T lookUpLocal(String t){
		return maps.get(scope).get(t);
	}
	T lookUpGlobal(String t){
		for ( int i = scope; i>=0 ; i--){
			if (maps.get(i).containsKey(t))
				return maps.get(i).get(t);
		}
		return null;
	}
	boolean lookUpFunction(String n,String ret, int k, ArrayList<String> ts){
		FunctionTable ft = new FunctionTable(n,ret,k,ts);
		for(FunctionTable f: functionTable){
			if(ft == f) return true;
		}
		return false;
	}

	FunctionTable lookUpFunction(String n){
		
		for(FunctionTable f: functionTable){
			
			if(f.functionName.equals(n)){
				
				return f;
			}
		}
		return null;
	}
}
