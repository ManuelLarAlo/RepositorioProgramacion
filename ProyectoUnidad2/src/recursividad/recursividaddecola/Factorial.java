package recursividad.recursividaddecola;

import java.util.Scanner;

public class Factorial {

	static long factorial(long n) {
		
		return factorialDeCola(n,1);
		
	}
	
	static long factorialDeCola(long n, long acumulador) {
		
		if (n<= 1) 
			return acumulador;
		else
			return factorialDeCola (n-1, n*acumulador);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      long num; //número introducido por el usuario
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Introduzca un número para calcular el factorial: ");
	      num = sc.nextInt();

		System.out.println(factorial(num));
		

	}

}
