package bucles.ejerciciosprofe;

import java.util.Scanner;

public class MostrarImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Vamos a mostrar los numeros impares hasta n
		// n lo recogemos por pantalla
		
		int n=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número hasta que hay que mostrar impares:");
		n= sc.nextInt();
		
		for(int i=1; i<=n; i=i+2) {
			// averiguamos de antemano la condición de terminaciónn
			// para que en la ultima vuelta del bucle
			// tras el ultimo impar no escribamos coma
			if (i+2> n)
				System.out.print(i);
			else 
				System.out.print(i+",");
			
		}
		
		
		
	}

}
