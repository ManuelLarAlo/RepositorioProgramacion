package bucles.ejerciciosprofe;

import java.util.Scanner;

public class Ejercicio14 {

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
			
			for (int j=1; j<=altura-1+i ; j++) {
				
				if (j<=altura-i) {
					
					tree=tree + " ";
					
				} else {
					
					tree= tree+ "*";
				}
				
			
			}
			
			tree=tree+"\n";
		}
		
		System.out.println(tree);
		

	}

}
