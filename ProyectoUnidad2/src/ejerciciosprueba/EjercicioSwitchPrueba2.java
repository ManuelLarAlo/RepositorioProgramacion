package ejerciciosprueba;
import java.util.Scanner;

public class EjercicioSwitchPrueba2 {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			int num1;
			
			System.out.println("Introduce un año: ");
			num1 = sc.nextInt();
			
			if ((num1%4==0 && num1%100!=0) || (num1%100==0 && num1%400==0)) {
						
						System.out.println("El año " + num1 + " es bisiesto");
				
			} else {
				
				System.out.println("El año " + num1 + " no es bisiesto");
			}
		}
		
		
	}
}
