package bucles.ejerciciosprofe;

import java.util.Scanner;

public class Ejercicio7Refuerzo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0, numaux=0;
		int contadorExponente=0;
		int cifra=0;
		// esta va a ser la variable acumulador
		// sumamos todas las potencias de 2
		double numDecimal=0.0;
	
		//Coger número por pantalla
		Scanner sc = new Scanner(System.in); 
		System.out.println("Introduzca el numero binario a pasar a decimal");
		num = sc.nextInt();
		
		numaux= num; 
		
		while (numaux!=0) {
			
			cifra= numaux%10;
			// si la cifra es cero no hace falta sumar, porque cualquier numero 
			//multiplicado por cero es cero
			if (cifra!=0)
				numDecimal= numDecimal + cifra*Math.pow(2.0, contadorExponente);
			numaux= numaux/10;
			contadorExponente++;			
			
		}

		
		System.out.println("el numero binario " + num + " en decimal es: " + numDecimal);
		
		

	}

}
