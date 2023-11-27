package ejercicios;

import java.util.Scanner;

public class EjercicioLibro31 {
	
	public static void main(String[] args) {
		
		int num;
		int num2;
		
		try (Scanner sc = new Scanner (System.in)) {
			
			do {
				
				System.out.println("Introduce un número: ");
				num = sc.nextInt();
				
				if (num % 2 == 0) {
					
					System.out.println("El número introducido es par");
					
				} else {
					
					System.out.println("El número introducido no es par");
					
				}
				
				if (num>=0) {
					
					System.out.println("El número introducido es positivo");
				} else {
					
					System.out.println("El número introducido no es positivo");
					
				}
				
				num2=num*num;
				
				System.out.println("El cuadrado del numero introducido es: " + num2);
				
			} while (num!=0);
			
		}
		
		
	}

}
