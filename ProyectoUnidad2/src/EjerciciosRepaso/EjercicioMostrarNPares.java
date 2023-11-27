package EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioMostrarNPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			
			int n=0;
			
			System.out.println("Introduce el número n de pares que vamos a mostrar: ");
			n = sc.nextInt();
			
				for (int i=0; i<=2*(5-1); i=i+2) {
				
					if (i+2> (2*n-1)) 
					System.out.print(i);
				else 
					System.out.print(i+",");
				
			} 
		}
		
		
	}

}
