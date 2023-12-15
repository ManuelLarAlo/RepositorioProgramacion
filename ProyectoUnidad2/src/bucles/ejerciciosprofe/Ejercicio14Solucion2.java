package bucles.ejerciciosprofe;

import java.util.Scanner;

public class Ejercicio14Solucion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//    *
		//   ***
		//  *****
		// *******
		// conclusion la anchura es igual a 2xaltura-1
		//
		
		int altura = 0;
	
		String tree="";

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura del arbol: ");

		altura = sc.nextInt();
	
		
		for(int i=1; i<=altura; i++) {
			// bucle para pintar blancos
			for (int j=1; j<= altura-i; j++) {
				
				tree= tree+" ";
			}
			
			//bucle para pintar asteriscos
			for (int k=1; k<= (2*i)-1 ; k++) {
				
				tree= tree+"*";
				
			}
				
			tree=tree+"\n";
		}
		
		System.out.println(tree);
		

	}

}
