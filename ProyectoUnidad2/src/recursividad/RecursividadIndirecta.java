package recursividad;

import java.util.Scanner;

public class RecursividadIndirecta {

	
	static void suma(int a, int b) {
		
		 sumaaux(a,b,0);
	}
	
	static void sumaaux(int a, int b, int S1) {
		
		
		if (a<=b) {			
		
			S1= S1+ a;
			imprime(a,b,S1);
			
		}
		
	}
	
	static void imprime(int a, int b,int S1) {
		
		System.out.println(a + "+" + b + "=" + S1);
		
		a++;
		sumaaux(a,b,S1);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//suma de todos los valores entre dos enteros
		
	int a=0,b=0;
	
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un número a: ");
    a = sc.nextInt();
    
    System.out.print("Introduzca un número b mayor que a: ");
    b = sc.nextInt();
    
    suma(a,b);
    
   
	
	}

}
