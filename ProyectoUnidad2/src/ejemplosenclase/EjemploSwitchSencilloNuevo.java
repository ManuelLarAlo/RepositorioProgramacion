package ejemplosenclase;

import java.util.Scanner;
import java.util.function.Function;

public class EjemploSwitchSencilloNuevo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);
	      int num; //número introducido por el usuario

	      System.out.print("Introduzca un número: ");
	      num = sc.nextInt();
	      
	      switch (num) {
	      
	      case 1 -> 	  System.out.println("Has introducido el 1");
	    
	    	  
	      case 2 -> {  System.out.println("Has introducido el 2");
	      
	      		System.out.println("Aqui si hace falta las llaves");
	      }
	      
	      default -> System.out.println("Has introducido otro numero distinto de 1 y 2");
	    	
	      
	      }
	      
	     

	}

}
