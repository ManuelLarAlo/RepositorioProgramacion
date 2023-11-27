package ejerciciosprueba;
import java.util.Scanner;

public class Ejercicio214 {
	
	public static void main(String[] args) {
		
		int u,d;
		String unidades="";
		String decenas="";
		String resultado="";
		int num; 
		    
		try (Scanner sc = new Scanner(System.in)) {
				
			System.out.print("Introduzca un número para ver si es capicua: ");
			num = sc.nextInt();
			
			u= num%10;
			d= num/10;
			
			unidades = switch (u) {
		
			case 1 -> "uno";
			case 2 -> "dos";
			case 3 -> "tres";
			case 4 -> "cuatro";
			case 5 -> "cinco";
			case 6 -> "seis";
			case 7 -> "siete";
			case 8 -> "ocho";
			case 9 -> "nueve";
			default ->"";
			
			};
			
			if (d!=0) {
				
				decenas = switch (d) {
				
				case 1 -> "uno";
				case 2 -> "dos";
				case 3 -> "tres";
				case 4 -> "cuatro";
				case 5 -> "cinco";
				case 6 -> "seis";
				case 7 -> "siete";
				case 8 -> "ocho";
				case 9 -> "nueve";
				default ->"";
				
			};
			
			}
			
			if (d!=0) {
				
				resultado = decenas+ " y " + unidades;
			} else {
				
				if (u==0)
					unidades="cero";
				
				resultado = unidades;
			}
			
			System.out.println("El numero " + num + " se escribe: " + resultado);
			
		}
			
			
	}
}

