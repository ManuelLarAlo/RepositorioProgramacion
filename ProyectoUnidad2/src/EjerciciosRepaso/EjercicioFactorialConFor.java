package EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioFactorialConFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		int resultadoFact=1;
		//Coger número por pantalla
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Escribe un número entero para calcular el factorial");
			
			num = sc.nextInt();
			
			//que el programa se quede en un bucle while hasta que el usuario incluya un número entre el 1 y 10
			//!4= 1x2x3x4
			while (num<1 || num>10) {
				
				System.out.println("Error. Debes escribir un numero entre 1 y 10: ");
				num = sc.nextInt();
				
			}
			
			//variable contador i
			for  (int i=1; i <=num; i++) {
				
				resultadoFact=resultadoFact*i;
				
				
			}
		}

	}

}
