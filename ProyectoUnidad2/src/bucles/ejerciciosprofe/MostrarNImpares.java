package bucles.ejerciciosprofe;

import java.util.Scanner;

public class MostrarNImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el número n de impares que vamos a mostrar:");
		n= sc.nextInt();
		
		//Vamos a mostrar los n primeros numeros impares
		// n lo recogemos por pantalla hacerlo con un while	
		// para n= 5 1,3,5,7,9
		// la condicion de acabado es i=9  i<=2*5-1
		// para n= 6 1,3,5,7,9,11
		// la condicion de acabado es i=11  i<=2*6-1
		// para cualquier n i<= 2*n-1
		
		for(int i=1; i<=(2*n-1); i=i+2) {
			// averiguamos de antemano la condición de terminaciónn
			// para que en la ultima vuelta del bucle
			// tras el ultimo impar no escribamos coma
			if (i+2> (2*n-1))
				System.out.print(i);
			else 
				System.out.print(i+",");
			
		}


	}

}
