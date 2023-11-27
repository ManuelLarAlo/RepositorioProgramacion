package ejerciciosprueba;
import java.util.Scanner;

public class Ejercicio15Libro {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			int a;
			int b;
			
			System.out.println("Introduce el número de alumnos que asisten al viaje: ");
			a = sc.nextInt();
			
			if (a>=100) {
				
				b=a*65;
				
				System.out.println("El pago a la compañia es de " + b + "€");
				System.out.println("Cada alumno debe pagar 65 € por el viaje");
				
			} else if (a>=50 && a<=99) {
				
				b=a*70;
				
				System.out.println("El pago a la compañia es de " + b + "€");
				System.out.println("Cada alumno debe pagar 65 € por el viaje");
				
			}
		}
		
		
	}

}
