package ejercicios.ejerciciosclase;

import java.util.Scanner;

public class Ejercicio3Mio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	      int año; //número introducido por el usuario

	      System.out.print("Introduzca un año: ");
	      año = sc.nextInt();
	      
	      if ((año%4==0 && año%100!=0) 
	    		  || (año%100==0 && año%400==0)) {
	    	  
	    	  System.out.println("El año " + año + " es bisiesto");
	    	  
	    	  
	      } else {
	    	  
	    	  System.out.println("El año " + año + " no es bisiesto");
	    	  
	      }
	      

	}

}
