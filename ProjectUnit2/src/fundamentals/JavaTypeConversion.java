package fundamentals;

public class JavaTypeConversion {
	
	

	    public static void main(String[] args)
	    
	    
	    {
	    	
	    	byte b= 100;
	    	
	    	short s= b;
	    	
	    	
	        int i = s; 
	          
	        // automatic type conversion
	        long l = i; 
	          
	        // automatic type conversion
	        float f = l; 
	        
	        
	        double d = b;
	        
	        System.out.println("Byte value "+b);
	        System.out.println("Short value "+s);
	        System.out.println("Int value "+i);
	        System.out.println("Long value "+l);
	        System.out.println("Float value "+f);
	        System.out.println("double value "+f);
	    }



}
