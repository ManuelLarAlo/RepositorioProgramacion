package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		int sum=0;
		int expression = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Introduce un número para calcular la serie: ");
			n= sc.nextInt();
			
			for(int i=0; i<=n; i++) {
				
				System.out.println((5*i-3) + ", " );
				
				sum = sum + (5*i-3);
				
				
			}
		}
		
		System.out.println("La suma de los n primeros términos es: " + "a^" + n + " = " + sum);

	}

}
