package Cup;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.StringBuilder;

public class Global {

    // Type constants
    public static class Constants {
        
        public static final String IO_TYPE = "IO";
        public static final String INT_TYPE = "int";
        public static final String CHAR_TYPE = "char";
        public static final String BOOL_TYPE = "bool";
        public static final String FLOAT_TYPE = "float";
        public static final String STRING_TYPE = "string";
        public static final String INT_ARRAY = "intArray";
        public static final String ERROR_TYPE = "error";
        public static final String MAIN_TYPE = "main";
    }


    public static String filename;


    public static ScopeTable<String> scopeTable;


    public static String currentFunction;

 
    public static ErrorReporter errorReporter;

    static {
        currentFunction = "";
        scopeTable = new ScopeTable<>();
   
    }




}
