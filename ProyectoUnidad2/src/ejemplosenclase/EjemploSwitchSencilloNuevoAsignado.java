package ejemplosenclase;

import java.util.Scanner;
import java.util.function.Function;

public class EjemploSwitchSencilloNuevoAsignado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);
	      int num; //número introducido por el usuario
	      int resultado;
	      System.out.print("Introduzca un número: ");
	      num = sc.nextInt();
	      
	      resultado =switch (num) {
	      
	      case 1 -> num+1;
	    
	    	  
	      case 2 -> {  System.out.println("Has introducido el 2");
	      
	      		System.out.println("Aqui si hace falta las llaves");
	      		yield num+2;
	      }
	    	
	      default -> 7;
	      
	      };
	      
	     

	}

}
