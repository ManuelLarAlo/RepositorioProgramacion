package ejercicios;


// Para casa
// Instalar eclipse
// crear un workspace como el de clase seguid los apuntes
// copiar dentro de la carpeta workspace el proyecto
// descomprimido cuyo zip hemos subido a google drive
// Menu file -> open existing project from folder
// lo añadimos al workspace


import java.util.Scanner;

public class EjercicioSiSinoAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la edad de la persona:");
		edad= sc.nextInt();
		
		if (edad>=18) {
			
			if (edad>66) {
				
				System.out.println("Es jubilado");
			} else if(edad>50) {
				
				System.out.println("Es una persona mayor");
				
			} else if (edad>40) {
				
				System.out.println("Es una persona madura");
				
			} else {
				//Si el programa llega aqui se que la persona 
				// esta entre 18 y 50 años
				System.out.println("Esta entre 18 y 40");
			}
			
			
		} else {
			
			// adolescente entre 13 y 17
			
			if (edad>=13) {
				
				
			} else if (edad>=9) {
			
			//niño mayor entre 9 y 12
			
			} else if (edad>=4) {
			
			//niño entre 4 y 8
			
			}
				
			//niño pequeño entre 3 y 4
			
			// bebe para más pequeño
			
			System.out.println("La persona es menor");
		}
		
		
		
		
	
		
		
		
		

	}

}
