package bucles.ejerciciosprofe;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * 
		 * que tenemos en este ejercicio en cada fila
		 * los i numeros impares hasta el 1  decreciente
		 * 
		 * fila 5    9 7 5 3 1
		 * hacemos 5 impares
		 * 
		 * 1         i=1   desde j=1 hasta 1
		 * 3 1       i=2   desde j=2 hasta 1
		 * 5 3 1     i=3   desde j=3 hasta 1
		 * 7 5 3 1   i=4   desde j=4 hasta 1
  		 * 9 7 5 3 1 i=5   desde j=5 hasta 1
  		 * 
  		 *                 escribir 2*j-1
		 * 
		 *  ya sabemos hacer impares hacia atras
		 *  calcular el 9 y hacer los impares
		 *  hasta el 1
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
