package ejercicios.ejercicioslibro;

import java.util.Scanner;

public class Ejercicio214 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int u,d;	
		String unidades="";
		String decenas="";
		String resultado="";
       
		  
	      int num; //número introducido por el usuario
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Introduzca un número para escribir como texto: ");
	      num = sc.nextInt();
	      
		  u= num%10;
		  d= num/10;
		  
		  System.out.println(u+""+d);
		  
		  unidades= switch (u) {
		  
		  
		  case 1 -> "uno";
		  case 2-> "dos";
		  case 3-> "tres";
		  case 4->"cuatro";
		  case 5->"cinco";
		  case 6 ->"seis";
		  case 7 -> "siete";
		  case 8 ->"ocho";
		  case 9 -> "nueve";
		  default ->"";
		  
		  };
		  
		  if (d!=0) {
			
			 decenas= switch (d) {
				  case 1 -> "diez";
				  case 2-> "veinte";
				  case 3-> "treinta";
				  case 4->"cuarenta";
				  case 5->"cincuenta";
				  case 6 ->"sesenta";
				  case 7 -> "setenta";
				  case 8 ->"ochenta";
				  case 9 -> "noventa";
				  default ->"";
				  
			 };
			  
		  }
		  
		  if (d!=0) {
			  
			  resultado = decenas+ " y " + unidades;
		  } else {
			  // pues aqui ya se que no hay decenas
			  // me falta controlar el cero
			  if (u==0)
				  unidades="cero";
			 
			  resultado=unidades;
		  }
		  
		  System.out.println(" el numero " + num + " se escribe:" + resultado);
		  
		  
		  

	}

}
