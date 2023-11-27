package ejercicios_entregables;

import java.util.Scanner;

public class Ejercicio_entregable3 {
	
	public static void main(String[] args) {
		
		int EntradaInfantil;
		int EntradaAdulto;
		double precio2;
		double total;
		double total2;
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Introduce el numero de entradas infantiles que quieres comprar: ");
			EntradaInfantil = sc.nextInt();
			double precio1 = EntradaInfantil;
			precio1 = EntradaInfantil * 15.5;
			
			
			
			System.out.println("Introduce el numero de entradas de Adulto que quieres comprar: ");
			EntradaAdulto = sc.nextInt();
			precio2 = EntradaAdulto * 20;
			
			total = precio1 + precio2;
			
			if (total < 100) {
				
				System.out.println("El total son " + total + " €");
				
			} else {
				
				total2 = total-(total*5/100);
				System.out.println("El precio de las entradas con un 5% de descuento es: " + total2 + " €");
			}
		}
	}

}
