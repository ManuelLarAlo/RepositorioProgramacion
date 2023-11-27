package ejercicios_entregables;

import java.util.Scanner;

public class Ejercicio_entregable1 {
	
	public static void main(String[] args) {
		
		int seconds;
		int minutes;
		int hours;
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Introduce un numero de segundos: ");
			seconds = sc.nextInt();
			
			minutes = seconds / 60;
			hours = seconds / 3600;
			
			System.out.println("Son " + hours + " horas");
			System.out.println("Son " + minutes + " minutos");
			System.out.println("Son " + seconds + " segundos");
		}
		
		
	}

}
