package bucles.ejerciciosprofe;

import java.util.Scanner;

public class Ejercicio10Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		//Suponemos que el numero es primo
		boolean esPrimo=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero para ver si es primo");
		
		num = sc.nextInt();
		
		// si el numero no es primo no me hace seguir
		// en el bucle, me salgo
		for (int i=2; (i<=num/2 && esPrimo) ; i++) {
			
			// si encontramos un numero entre 2
			// y el (numero - 1) que es divisor
			// ya no es primo
			if (num%i==0) {
				esPrimo=false;
				// el break es poco elegante
				//break;
			}
			
		}
		if (esPrimo)
			System.out.println("El numero " + num + " es primo " );
		else
			System.out.println("El numero " + num + " no es primo " );

	}

}
