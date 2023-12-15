package ejercicios.ejercicioslibro;

import java.util.Scanner;

public class Ejercicio313 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String cadenaBinaria="";
		
		 int horas,minutos,segundos; //número introducido por el usuario
		 int incrementoSegundos;
		 int segundosAux;
	      Scanner sc = new Scanner(System.in);
	    
	     
	      int horasIncremento,minutosIncremento,segundosIncremento;
	      int horasAcarreo, minutosAcarreo;
	      
	 	 int horasFinal,minutosFinal,segundosFinal;
	 	 
	 	 
	 	 
	 	 System.out.print("Introduzca horas");
	 	 horas= sc.nextInt();
	 	 
	 	 System.out.print("Introduzca minutos");
	 	 minutos= sc.nextInt();
	 	 
	 	 System.out.print("Introduzca segundos");
	     
	 	segundos= sc.nextInt();
	 	
	 	 System.out.print("Segundos de incremento");
	 	 
	 	incrementoSegundos=sc.nextInt();
	 	
	 	// 22 horas 40 minutos 45 segundos
	 	
	 	// 12040 segundos
	 	//12040/3600= 3 horas
	 	
	 	// 12040%3600= 1240 segundos

	 	// minutos = 1240/60 = 20 minutos
	 	
	 	// segundos = 1240%60 = 40 segundos
	 	
	 	// segundo sumados
	 	//                       45
	 	//					     40
	 	/*					     85 como es mayor que 60 1 minuto y 25 se
	 	 * 						 85/60 = 1 minuto 85%60 = 25 segundos 
	 	 * 
	 	 *                       25 segundos
	 	 * 
	 	 * 				1
	 	 *             20
	 	 *             40
	 	 *             61 minutos /60 = 1 hora 61%60= 1 minuto 
	 	 *             1 hora y 1 minuto
	 	 *             1 minuto
	 	 *             
	 	 *             
	 	 *   22
	 	 *    3
	 	 *    1
	 	 *    
	 	 *   26%24
	 	 *   2 horas  
	 	 *    02: 01 : 25
	 	 * 			   
	 	 */
	 	
	 	
	 	// hemos hecho esto
	 	
	 // 12040 segundos
	 	 	//12040/3600= 3 horas
	 	 	
	 	 	// 12040%3600= 1240 segundos

	 	 	// minutos = 1240/60 = 20 minutos
	 	 	
	 	 	// segundos = 1240%60 = 40 segundos
	 	
	 	horasIncremento= incrementoSegundos/3600;
	
	 	segundosAux=  (incrementoSegundos%3600);
	 	minutosIncremento= segundosAux/60;
	 	
	 	segundosIncremento= segundosAux%60;
	 	
	 	// ahora vamos a sumar segunds
	 	
	 	 /* 				1
	 	 *             20
	 	 *             40
	 	 *             61 minutos /60 = 1 hora 61%60= 1 minuto 
	 	 *             1 hora y 1 minuto
	 	 *             1 minuto
	 	
	 	*/
	 	segundosFinal = (segundos + segundosIncremento)%60;
	 	minutosAcarreo =(segundos + segundosIncremento)/60;
	 	
	 	/* 				1
	 	 *             20
	 	 *             40
	 	 *             61 minutos /60 = 1 hora 61%60= 1 minuto 
	 	 *             1 hora y 1 minuto
	 	 *             1 minuto
	 	  */
	 	minutosFinal = (minutos + minutosIncremento+ minutosAcarreo)%60;
	 	horasAcarreo = (minutos + minutosIncremento+ minutosAcarreo)/60;
	 	
	 	horasFinal = (horas+ horasIncremento + horasAcarreo)%24;
	 	
	 	
	 	
	 	System.out.println("La nueva hora será: " + horasFinal+ ":" + minutosFinal + ":" +segundosFinal);
	 	1
	 	
	 	
	 	 

	}

}
