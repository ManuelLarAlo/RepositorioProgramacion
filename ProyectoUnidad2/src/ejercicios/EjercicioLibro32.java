package ejercicios;

import java.util.Scanner;

public class EjercicioLibro32 {
	
	public static void main(String[] args) {
		
		int edad;
		int sumaEdades = 0;
		int numalumnos = 0;
		double media;
		int numMayor = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Introduce una edad: ");
			edad = sc.nextInt();
			
			while (edad >= 0) {
				
				sumaEdades += edad;
				numalumnos++;
				
				if (edad>=18) {
					
					numMayor++;
				}
				System.out.println("Introduzca edad: ");
				edad = sc.nextInt();
			}
			
			media = (double) sumaEdades / numalumnos;
			
			System.out.println("Suma de todas las edades: " + sumaEdades);
			System.out.println("Media: " + media);
			System.out.println("Mayores de edad: " + numMayor);
		}
		
		
	}

}
