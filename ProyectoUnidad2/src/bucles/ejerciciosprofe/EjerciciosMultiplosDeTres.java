package bucles.ejerciciosprofe;

import java.util.Scanner;

public class EjerciciosMultiplosDeTres {

	
	// El programa va a coger un numero n por pantalla 
	// y va a mostrar desde n hasta 3 todos los multiplos de tres
	//Primera version
	// normal con decremento 1
	//Segunda version
	//Pensando como mejorar el algoritmo con programacion dinamica
	// para hacer decremento 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		int multTresCercano=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero para mostrar los multiplos de tres desde el numero hasta 3");

		n = sc.nextInt();
		
		System.out.println("Version fuerza bruta");
		for (int i=n ; i>=3 ; i--) {
			
			if (i%3==0)
				System.out.print(i+ ", ");
			
			
			
		}
		System.out.println("Version eficiente");
		
		multTresCercano = n -(n%3);
		
		for (int i=multTresCercano; i>=3 ; i=i-3) {
			
			System.out.print(i+ ", ");
		}
		
		// version eficiente
		
		
		
		
		
		
	}

}
