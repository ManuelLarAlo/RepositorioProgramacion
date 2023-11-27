package EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioPizarra {
	
	public static void main(String[] args) {
		
		int num=0;
		int numAux=0;
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			
			for (int i=1; i<num; i++) {
				
				if (i/10 == 0) {
					
					System.out.println("El número introducido tiene " + num + " cifras");
				}
			}
		}
	}

}
