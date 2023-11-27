package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio10Primos {
	
    public static void main(String[] args) {
    	
    	try (Scanner sc = new Scanner(System.in)) {
    		
    		int num=0;
    		//Suponemos que el número es primo
    		boolean esPrimo=true;
    		
    		System.out.println("Introduce un número para ver si es primo: ");
    		num = sc.nextInt();
    		
    		//Si el numero no es primo no me hace seguir en el bucle, me salgo
    		for (int i=2; (i<=num/2 && esPrimo); i++) {
    			
    			//Si encontramos un numero entre 2 y el numero -1 que lo divide ya no es primo	
    			if (num%i==0) {
    				esPrimo=false;
    				//el break es poco elegante
    				//break;
    			}
    		}
    		if (esPrimo)
    			System.out.println("El número " + num + "es primo " + esPrimo);
    		
    		else
    			System.out.println("El número " + num + "es primo " + esPrimo);
		} 
    }

}
