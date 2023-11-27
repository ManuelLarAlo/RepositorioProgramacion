package EjerciciosRepaso;

import java.util.Scanner;

public class MostrarImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//vamos a mostrar los n primeros numeros impares
		//n lo recogemos por pantalla
		
		int n=0;
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Introduce el número hasta que hay que mostrar impares");
			
			n= sc.nextInt();
			
			for (int i=1; i<=n; i=i+2) {
				//averiguamos de antemano la condición de terminación para que en la ultima vuelta del bucle tra el ultimo lugar no escribamos coma
				if (i + 2 > n) {
					
					System.out.print(i);
						
				} else {
					
					System.out.print(i+",");
					
				}
			}
		}
	}
}
