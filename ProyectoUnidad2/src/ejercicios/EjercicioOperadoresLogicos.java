package ejercicios;

public class EjercicioOperadoresLogicos {
	
	 public static void main(String[] args) {
		 
		 
		 boolean variableLogica = false;
		 // el And es verdadero solo si las dos condiciones son
		 //verdaderos
		 variableLogica = true && true;
		 
		 System.out.println(" resultado and " + variableLogica);
		 
		 boolean variableLogicaOr = false; 
		 // el Or es falso sólo si las dos condiciones son falsas
		 variableLogicaOr = true || false;
		 
		 System.out.println(" resultado or " + variableLogica);
		 
		 
		 int i= 5;
		 int j= 10;
		 boolean variableNot = !((j>3)&&(i<7)); 
		 							
		 							
		 							
		 							
		 boolean ejercicio = (((i+j)%2==0) && ((j-i)>5)) ;	
		 							
		 							
		 							
		 						
		 
		 
		 
		 
		 
		 System.out.println(" resultado not " + variableNot);
		 
		 
		 
	 }

}
