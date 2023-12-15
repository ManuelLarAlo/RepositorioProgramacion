package bucles.ejerciciosprofe;

import java.util.Scanner;

public class TrianguloPascal2 {
	
	
	public static void pintaBlancos(int n) {
		
		for (int i=0; i<n ;i++) 
			System.out.print(" ");
		
	}
    public static void main(String[] args) {        
        Scanner input=new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int rows=input.nextInt();        
        for(int i =0;i<rows;i++) {
            int number = 1;
            //System.out.format("%"+(rows-i)*2+"s","");
            
            pintaBlancos((rows-i-1)*2);
            for(int j=0;j<=i;j++) {
                System.out.printf("%4d",number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
        
        
    }    
}