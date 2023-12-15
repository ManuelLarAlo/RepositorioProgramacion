package recursividad;

import java.util.Scanner;

public class FactorialDeCola {
	
	static long factorial(long n)
	{
	    // Puede causar overflow
	    //
	    if (n == 1)
	    	return 1;

	    else
	        return n*factorial(n-1);
	}

	
	static long factorialOverflow(long n)
	{
	    // Puede causar overflow
	    //
	    if (n == 100)
	    	return 1;

	    else
	        return n*factorialOverflow(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      long num; //número introducido por el usuario
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Introduzca un número para calcular el factorial: ");
	      num = sc.nextInt();

		System.out.println(factorial(num));
		
		System.out.println(factorialOverflow(num));
	}

}
