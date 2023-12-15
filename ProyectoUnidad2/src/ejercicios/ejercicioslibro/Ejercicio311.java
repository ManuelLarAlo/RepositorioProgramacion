package ejercicios.ejercicioslibro;

import java.util.Scanner;

public class Ejercicio311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaBinaria="";
		
		 int num,numaux; //número introducido por el usuario
		 int cifra;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Introduzca un número para pasar a binario");
	      
	      num= sc.nextInt();
	      numaux=num;
	      
	     while (numaux!=0) {
	    	 
	    	 cifra = numaux%2;
	    	 numaux= numaux/2;
	    	 cadenaBinaria= cifra+cadenaBinaria;
	    	 
	    	 
	     }
	}

}
