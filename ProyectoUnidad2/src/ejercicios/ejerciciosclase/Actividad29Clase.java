package ejercicios.ejerciciosclase;

import java.util.Scanner;

public class Actividad29Clase {
	
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

	      System.out.print("Introduzca un número entre 0 y 99.999: ");
	      int num = sc.nextInt();
	      boolean a;
	   
	    
	    
	      
	      if (num/10.0 <1) {
	    	  
	    	  System.out.print("tiene una cifra ");
	      } else if ((num/10.0 <10)) {
	    	  
	    	  System.out.print("tiene dos cifras ");
	      } else if ((num/100.0 <10)) {
	    	  
	    	  System.out.print("tiene tres cifras ");
	      }else if ((num/1000.0 <10)) {
	    	  
	    	  System.out.print("tiene cuatro cifras ");
	      }else if ((num/10000.0 <10)) {
	    	  
	    	  System.out.print("tiene cinco cifras ");
	      }  else {
	    	  
	    	  System.out.print("tiene más de cinco cifras ");
	      }
	      
	      
	}

}
