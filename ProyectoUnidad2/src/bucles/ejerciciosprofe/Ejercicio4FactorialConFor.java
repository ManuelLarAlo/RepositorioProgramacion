package bucles.ejerciciosprofe;

import java.util.Scanner;

public class Ejercicio4FactorialConFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		int resultadoFact=1;
		//Coger número por pantalla
		Scanner sc = new Scanner(System.in);
		
		// que el programa se quede en un bucle while hasta que
		// el usuario incluya un número entre 1 y 10
		//!4= 1x2x3x4
		
		System.out.println("Escribe un numero entero para calcular el factorial");
		
		num = sc.nextInt();
		//variable contador i
		for (int i=1 ; i<=num ; i++ ) {
			
			resultadoFact=resultadoFact*i;
			
		}
		
		System.out.println("El resultado de !"+ num + " es " + resultadoFact);
		
	

	}

}
