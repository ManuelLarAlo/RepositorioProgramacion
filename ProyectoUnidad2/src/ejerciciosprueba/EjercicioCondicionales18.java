package ejerciciosprueba;
import java.util.Scanner;

public class EjercicioCondicionales18 {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			int a, b, c;
			
			System.out.println("Introduce una temperatura en grados centígrados: ");
			a = sc.nextInt();
			
			System.out.println("Quiere convertir a Kelvin o a Fahrenheit?");
			System.out.println();
			System.out.println("1 Kelvin");
			System.out.println("2 Fahrenheit");
			System.out.println();
			b = sc.nextInt();
			
			
			switch (b) {
			case 1-> {
				c = a+273;
				System.out.println("Los grados que ha introducido son " + c + " en Kelvin");
			}
			case 2-> {
				c = (a * 9/5) + 32;
				System.out.println("Los grados que ha introducido son " + c + " en Fahrenheit");
			}
			}
		}
	}

}
