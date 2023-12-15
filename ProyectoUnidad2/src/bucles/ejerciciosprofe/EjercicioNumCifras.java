package bucles.ejerciciosprofe;

import java.util.Scanner;

public class EjercicioNumCifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cont es 1 porque la ultima vez que hay
		// que contar el valor de numaux será cero
		int num, numaux, cont=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero para calcular sus cifras");
		num= sc.nextInt();
		numaux=num;
		while (numaux>0) {
			
			numaux= numaux/10;
			cont++;
			
		}
		
		System.out.println("El numero de cifras de " + num + "  es " + cont);
		
		//Deberes para el fin de semana
		// Una vez sabidas las cifras del número
		//mostrar cada cifra separada por comas
		// para el número 2345
		// debemos mostrar 2,3,4,5
		// con un for
		
		for (int i= cont-1 ; i>= 0; i--) {
			
			
		}
	
	}

}
