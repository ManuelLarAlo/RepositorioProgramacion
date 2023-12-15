package variablescopepassingparameters;

public class ExampleVariableScope {
	
	private int myProperty =3;
	public int myPropPublic =3;
	public static int staticPublicProperty=4;
	
	
	public int miFunction(int num) {
		
		int num2=2 + myProperty +myPropPublic +staticPublicProperty;
		
		return num2 + num;
		
	}
	
	
	
	  // m method
    public static void main(String[] args)
    {
    
    	int variableScopeMain =0;
    	
    	
    	if (variableScopeMain >-1) {
    		
    		int variableScopeIf=0;
    		variableScopeMain =1;
    		
    		variableScopeIf = variableScopeMain;
    		System.out.println("Parameters " + args);
    	
    	}
    	// variableScopeIf =3;
    	
    	for (int i = 0; i<3 ; i++) {
    		
    		 int variableScopeFor = 3 + variableScopeMain;
    		 // variableScopeFor = 3 + variableScopeIf;	
    		
    		 System.out.println("Parameters " + args);
    		
    	}
    	
    	
    	ExampleVariableScope ex = new ExampleVariableScope();
    	//ex.myProperty;
    	ex.myPropPublic=4;
    	ExampleVariableScope.staticPublicProperty=5;
    	
    	
    
    }

}
