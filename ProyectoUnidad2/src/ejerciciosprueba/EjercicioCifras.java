package ejerciciosprueba;
import java.util.Scanner;

public class EjercicioCifras {
	
	public static void main(String[] args) {
		
		int num;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce un número: ");
			num  = sc.nextInt();
		}
		
		if (num/10.0<1) {
			
			System.out.println("tiene una cifra");
		} else if  (num/10.0 < 10) {
			
			System.out.println("tiene 2 cifras");
		} else if (num/100.0 < 10) {
			
			System.out.println("tiene 3 cifras");
		} else if (num/1000.0 < 10) {
			
			System.out.println("tiene 4 cifras");
		} else if (num/10000.0 < 10) {
			
			System.out.println("tiene 5 cifras");
		} else {
			
			System.out.println("tiene más de 5 cifras");
		}
	}
}
