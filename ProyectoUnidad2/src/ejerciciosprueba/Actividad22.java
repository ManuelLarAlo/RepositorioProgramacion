package ejerciciosprueba;
import java.util.Scanner;

public class Actividad22 {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int numero1;
			int numero2;
			
			System.out.println("Introduce un número: ");
			numero1 = sc.nextInt();
			
			System.out.println("Introduce otro número: ");
			numero2  =  sc.nextInt();
			
			if (numero1 == numero2) {
				System.out.println("Los números introducidos son iguales");
			}
			else {
				System.out.println("Los números introducidos no son iguales");
			}
		}
	}

}