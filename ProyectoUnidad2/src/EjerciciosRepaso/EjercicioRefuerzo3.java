package EjerciciosRepaso;

import java.util.Scanner;

public class EjercicioRefuerzo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String modeloCoche = "";
		String modeloCocheMax ="";
		String modeloCocheMin ="";
		int precio, maxPrecio = 0, minPrecio = 1000000;
		int numCoches = 0;
		double media = 0.0;
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Introduza el modelo del coche: ");
			modeloCoche = sc.nextLine();
			
			modeloCocheMax = modeloCoche;
			modeloCocheMin = modeloCoche;
			
			System.out.println("Introduzca el precio del coche: ");
			precio = sc.nextInt();
			
			maxPrecio = precio;
			minPrecio = precio;
			
			while (precio != 0) {
				
				numCoches++;
				
				if (precio >= maxPrecio) {
					
					maxPrecio = precio;
					modeloCocheMax = modeloCoche;
				}
				
				if (precio <= minPrecio) {
					
					minPrecio = precio;
					modeloCocheMin = modeloCoche;
				}
				
				
				System.out.println("Introduza el modelo del coche: ");
				modeloCoche = sc.next();
				
				
				System.out.println("Introduzca el precio del coche: ");
				precio = sc.nextInt();
				
				
				}
			
				if (numCoches > 0) {
					
					System.out.println("Introduzca el precio del coche: ");
					
				}
			
			
		}
		
	}

}
