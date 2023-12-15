package ejercicios;

import java.util.Scanner;


public class EjercicioConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int CAN1=0, CAN2=0;
		int SUMA=0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
		
			System.out.println("Introduce un entero");
			//Leo un entero de la entrada de consola
			
			
			int x= sc.nextInt();
			System.out.println("Entero leido " +x);
			
			System.out.println("Introduce un double");
			//Leo un entero de la entrada de consola
			double num= sc.nextDouble();
			System.out.println("Double leido " +num);
			
			/*
			  mcuha
			  
			  dsafasd
			  
			 muchas lineas 
			 */
			
			//Comentario de una linea
			
			System.out.println("Introduce una cadena de carácteres");
			//Leo un entero de la entrada de consola
			String cadena= sc.next();
			System.out.println("Cadena leida " +cadena);
			
		}catch(Exception e) {
			
			System.out.println("Escribeme bien los datos");
		}
			
		
	}

}
