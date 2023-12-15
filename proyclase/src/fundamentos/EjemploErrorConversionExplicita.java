package fundamentos;

public class EjemploErrorConversionExplicita {
	
		public static void main(String[] argv)
		  {
		    char ch = 'c';
		    int num = 88;
		    
		    double numDec=44.5;
		    ch = (char) num;
		    
		    System.out.println(ch);
		    ch = (char) numDec;
		    
		    System.out.println(ch);  
		    
		  }
		
   

}
