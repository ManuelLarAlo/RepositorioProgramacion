package ejerciciosprueba;
import java.util.Scanner;

public class EjercicioSwitchPrueba4 {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			int a;
			
			System.out.println("Introduce tu renta anual: ");
			a = sc.nextInt();
			
			if (a<10000) {
				
				System.out.println("Te corresponde un impositivo del 5% ");
				
			} else if (a>=10000 & a<=20000) {
				
				System.out.println("Te corresponde un impositivo del 15% ");
				
			} else if (a>=20000 & a<=35000) {
				
				System.out.println("Te corresponde un impositivo del 20% ");
				
			} else if (a>=35000 & a<=60000) {
				
				System.out.println("Te corresponde un impositivo del 30% ");
				
			} else if (a>=60000) {
				
				System.out.println("Te corresponde un impositivo del 45% ");
			}
		} 
	}

}
