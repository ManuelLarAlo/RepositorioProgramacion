package ejerciciosprueba;
import java.util.Scanner;

public class EjercicioPruebaSwitch {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int num;
			
			System.out.println("Introduce un numero: ");
			num= sc.nextInt();
			
			switch (num) {
			
			case 1: System.out.println("El numero 1 corresponde al Lunes");
				break;
			case 2: System.out.println("El numero 2 corresponde al Martes");
				break;
			case 3: System.out.println("El numero 3 corresponde al Miercoles");
				break;
			case 4: System.out.println("El numero 4 corresponde al Jueves");
				break;
			case 5: System.out.println("El numero 5 corresponde al Viernes");
				break;
			case 6: System.out.println("El numero 6 corresponde al Sabado");
				break;
			case 7: System.out.println("El numero 7 corresponde al Domingo");
			}
		}
	}

}
