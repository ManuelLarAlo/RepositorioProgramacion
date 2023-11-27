package ejercicios;

import java.util.Scanner;

public class Practice2Class {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce un numero: ");
			
			int num = sc.nextInt();
			int resto = num % 7;
			int num3 = 7 - resto;
			
			System.out.println("El numero " +num3 + " es multiplo de 7");
		}
	}

}