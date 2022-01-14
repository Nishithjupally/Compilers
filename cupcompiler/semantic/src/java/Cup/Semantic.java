package Cup;


public class Semantic{
	private boolean errorFlag = false;
	public void reportError(String filename, int lineNo, String error){
		errorFlag = true;
		System.err.println(filename+":"+lineNo+": "+error);
	}
	public boolean getErrorFlag(){
		return errorFlag;
	}

/*
	Don't change code above this line
*/

	public Semantic(AST.program prog){
		Global.errorReporter = new ErrorReporter() {
			@Override
			public void report(String filename, int lineNo, String error) {
				reportError(filename, lineNo, error);
			}
		};
		Visitor visitor = new StatementVisitorImpl();
		prog.accept(visitor);
	}
}