package ejerciciosprueba;
import java.util.Scanner;

public class EjercicioGranja {
	
	public static void main(String[] args) {
		
		double comidaDiaria;
		int numAnimales;
		double kilosPorAnimal;
		double totalKilos;
		double racion;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce una cantidad de comida: ");
			comidaDiaria = sc.nextDouble();
			
			System.out.println("Introduce un número de animales: ");
			numAnimales = sc.nextInt();
			
			System.out.println("Introduce una cantidad de kilos por animal: ");
			kilosPorAnimal = sc.nextDouble();
		}
		
		totalKilos = comidaDiaria -(numAnimales * kilosPorAnimal);
		
		if (totalKilos > 0) {
			
			System.out.println("Hay suficiente comida para todos los animales");
		} else {
			
			racion = comidaDiaria/numAnimales;
			
			System.out.println("La ración para cada animal es de: " + racion);
		}
	}

}
