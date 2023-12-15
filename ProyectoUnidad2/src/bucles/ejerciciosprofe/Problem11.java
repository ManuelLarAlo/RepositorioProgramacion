package bucles.ejerciciosprofe;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		/*
		 *         j columnas
		 * 
		 * i filas 1
		 *         2 2
		 *         3 3 3
		 *         4 4 4 4
		 *         
		 *         
		 * 
		 * 
		 * 
		 */
		
		
		String tree="";
		int height=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the tree height: ");
		
		 height=sc.nextInt();
		
		for (int i=1; i<= height; i++) {
			
			
			for (int j=1; j<=i; j++) {
			// el bucle de dentro se encarga de imprimir cada fila	
				
				tree=tree+i+" ";
			
				
			}
			// el bucle de fuera se encarga de salta de linea
					
			tree=tree+"\n";
			
			
		}
		
		System.out.println(tree);
		
		
		
		
	

	}

}
