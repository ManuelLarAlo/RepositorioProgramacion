package funciones;

import java.util.Scanner;

public class FuncionesMatematicas {
	
							//	parámetros formales
	public static double media( int x , int y ) {
	
	double calculo;
	
	calculo = (double) (x + y)  / 2;    
	return calculo;
	//También se puede poner Return  ((x + y)  / 2)
	}
	
	public static int revert(int num) {
		
		int cifra,numRes=0;
		
		while (num>0) {
			
			numRes*=10;
			cifra=num%10;
			numRes+=cifra;
			num/=10;
			
		}
		
		return numRes;
	}
	
	public static int deleteNDigit (int num, int N) {
		
		int cifra, exponente=0, numRes=0, contPosicion=1;
			
		while (num>0) {
			
			if (contPosicion!=N) {
				
				cifra=num%10;
				numRes=numRes + cifra* (int) Math.pow(10, exponente);
				exponente++;
				
			}
			
			contPosicion++;
			num=num/10;
		}
		
		return numRes;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el primer Numero");
		num1= sc.nextInt();
		
		System.out.println( "Dame el segundo Numero");
		num2= sc.nextInt();
		result=media(num1,num2);

	 //parámetros ACTUALES O REALES n1 y n2

		//System.out.println( "La media es:" + result) ;
		
		//System.out.println("the revered number for " + num1 + " is " + revert(num1));
		
		int outcome=deleteNDigit(num1,num2);
		
		System.out.println("the number after taking out the " + num2 + " position " + outcome);


	}

}
