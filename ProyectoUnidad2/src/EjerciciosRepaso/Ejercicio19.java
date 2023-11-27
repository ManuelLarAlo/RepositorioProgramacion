package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio19 {
	
	public static void main(String[] args) { //A1 = 1/1 A2 = 2/2 A3 = 1/3... An = 1/n
		
		int n=0;
		double sum=0;
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter a number to compute the harmonic series: ");
			n = sc.nextInt();
			
			for(int i=1; i<=n; i++) {
				
				if (i==n)
					System.out.println(1.0/i);
				else
					System.out.print(1.0/i + ",");
				sum=sum+1.0/i;
			}
			
			System.out.println("The sum of the first n harmonic terms is: " + sum);
		}
		
		
	}

}
