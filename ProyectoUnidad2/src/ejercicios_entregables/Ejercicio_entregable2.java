package ejercicios_entregables;

import java.util.Scanner;

public class Ejercicio_entregable2 {
	
	public static void main(String[] args) {
		
		int hormigas;
		int arañas;
		int cochinillas;
		int total;
		
		try(Scanner sc = new Scanner(System.in)) {
				
				System.out.println("Introduce un numero de hormigas: ");
				hormigas = sc.nextInt();
				
				System.out.println("Introduce un numero de arañas: ");
				arañas = sc.nextInt();
				
				System.out.println("Introduce un numero de cochinillas ");
				cochinillas = sc.nextInt();
				
				hormigas = hormigas * 6;
				arañas = arañas * 8;
				cochinillas = cochinillas * 14;
				total = hormigas + arañas + cochinillas;
				
				
				System.out.println("El numero total de patas es: " + total);
				
		}
	}

}
