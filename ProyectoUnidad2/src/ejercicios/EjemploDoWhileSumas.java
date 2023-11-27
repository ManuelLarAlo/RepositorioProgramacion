package ejercicios;

import java.util.Scanner;

public class EjemploDoWhileSumas {
	
	public static void main(String[] args) {
		
		int num=0;
		int sum=0;
		//en la clase integer tenemos utilidades para integer como el valor máximo y mínimo
		//ponemos como max el entero más pequeño con el fin de que el máximo sea un número de los que introduzcamos
		//igual con el mínimo
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce números distinto de cero para sumar");
			//como el do while se ejecuta al menos una vez no hace falta
			// pedir numero fuera y dentro del bucle como hacíamos con
			// el while
			
			do  {
				
				System.out.println("Introduce un número: ");
				num= sc.nextInt();
				sum+=num;
				// nos aseguramos que el máximo y el mínimo
				// no es cerom cero es el número de salida
				if (num>max && num!=0)
					max=num;
				
				if (num<min && num!=0)
					min=num;
				
				
			} while(num!=0);
			
			System.out.println("El resultado de la suma es: " +sum);
			System.out.println("El máximo es: " + max );
			System.out.println("El mínimo es: " + min);
			
		}
	}

}
