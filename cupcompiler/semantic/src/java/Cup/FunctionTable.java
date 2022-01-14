package Cup;
import java.util.ArrayList;
public class FunctionTable {
    public String functionName;
    public String returnType;
    public int numArgs;
    public ArrayList<String> typeArgs;
    public FunctionTable(String n,String ret, int k, ArrayList<String> ts){
        functionName = n;
        returnType = ret;
        numArgs = k;
        typeArgs = ts;
    }
}
