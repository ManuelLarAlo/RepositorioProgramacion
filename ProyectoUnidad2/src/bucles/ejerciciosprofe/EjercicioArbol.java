package bucles.ejerciciosprofe;

import java.util.Scanner;

public class EjercicioArbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       Scanner input=new Scanner(System.in);
	        System.out.print("Ingrese un número: ");
	        int altura=input.nextInt();
	        int anchura= altura*2-1;
	        for(int i =1;i<=altura;i++) {
	            int number = 1;
	            //System.out.format("%"+(rows-i)*2+"s","");
	            	          
	            for(int j=1;j<altura+i;j++) {
	               
	            	if (j >(altura-i))
	            		System.out.print("*");
	            	else
	            		System.out.print(" ");
	               
	            }
	            System.out.println();
	            
	        }
	    }    

	}


