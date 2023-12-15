package ejercicios.ejerciciosclase;

import java.util.Scanner;

public class PracticeProblemOfTheDay3Nov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Introduce un numero");
		int num1;
		
	
		
		
		int num =sc.nextInt();
		//imagina que introduces 12 de resto tengo 5
		int resto = num%7;
		// sum 7-5= 2 => 12+2 14 que es multiplo de 7
		int sum = 7-resto;
		
		//es lo mismo num+=sum; que num=num+sum; 
		//num= num+sum;
		num+=sum;
		
		System.out.println("El numero " + num + " es multimplo de 7");
		
	}

}
