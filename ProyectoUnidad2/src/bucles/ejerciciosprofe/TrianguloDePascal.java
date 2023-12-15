package bucles.ejerciciosprofe;

import java.util.Scanner;

public class TrianguloDePascal {
	
	
	public static long factorial(long n) {
		
		long result=1;
		
		for (int i=1; i<=n ; i++) {
			
			result*=i;
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input=new Scanner(System.in);
	        System.out.print("Ingrese un número: ");
	        int filas=input.nextInt();        
	        for(int i =0;i<filas;i++) {
	            long numero = 1;
	            
	            long factoriali= factorial(i);
	            for(int j=0;j<=i;j++) {
	                
	                numero = factoriali / (factorial(j) *factorial(i-j));
	                System.out.printf("%4d",numero);
	                
	            }
	            System.out.println();
	        }

	}

}
