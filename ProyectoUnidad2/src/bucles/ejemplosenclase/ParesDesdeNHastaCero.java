package bucles.ejemplosenclase;

import java.util.Scanner;

public class ParesDesdeNHastaCero {

	
	// vamos a mostrar los pares desde N hasta cero
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,numaux=0;
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Introduce un número para mostrar pares hasta el cero");
		 
		num= sc.nextInt();
		numaux=num;
		if (numaux%2!=0)
			numaux--;
		
		System.out.println("Los numeros pares entre " + num +" y cero son:");
		for (int i= numaux; i>=0; i=i-2 ) {
			
			System.out.print(i+ ", ");
		}
		
		
		
		

	}

}
