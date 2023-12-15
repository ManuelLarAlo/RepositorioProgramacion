package ejercicios.ejerciciosclase;

import java.util.Locale;
import java.util.Scanner;

public class Actividad28Clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	      sc.useLocale(Locale.US);
	      double a, b, c; 
	      double x1, x2, d; 

	      System.out.print("Introduzca primer coeficiente (a): ");
	      a = sc.nextDouble();
	      System.out.print("Introduzca segundo coeficiente: (b): ");
	      b = sc.nextDouble();
	      System.out.print("Introduzca tercer coeficiente: (c): ");
	      c = sc.nextDouble();
	      
	      //d= Math.pow(b, 2)- (4*a*c);
	      d= b*b-(4*a*c);
	      
	      if (d>0) {
	    	  
	    	  x1= (-b+Math.sqrt(d))/(2*a);
	    	  x2= (-b-Math.sqrt(d))/(2*a);
	    	  System.out.println("La ecuación  tiene dos soluciones. x1 es: " + x1 +
	    			  " y x2 es: " + x2);
	    	  
	      } else if (d==0) {
	    	  
	    	  x1= -b/2*a;
	    	  
	    	  System.out.println("La ecuación  tiene una solucion. x1 es: " + x1);
	      } else {
	    	  
	    	  System.out.println("La ecuación no tiene soluciones");
	      }
	      

	}

}
