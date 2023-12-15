package bucles.ejerciciosprofe;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 								generalizamos 
		 * primera vuelta i=1 * j= 1 hasta 1 =>>> desde j=1 hasta i
		 * segunda vuelta i=2 ** j= 1 hasta 2 
		 * tercera vuelta i=3 *** j= 1 hasta 3 
		 * cuarta vuelta i=4 **** j= 1 hasta 4
		 * 
		 */

		int altura = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura del arbol: ");

		altura = sc.nextInt();

		for (int i = 1; i <= altura; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();

		}
	}

}
