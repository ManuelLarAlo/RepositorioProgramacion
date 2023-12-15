package ejercicios.ejercicioslibro;
import java.util.Scanner;

public class Resuelta32 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //variable de tipo acumulador para sumar las edades
      int sumaEdades = 0; 
      // dos variables contadores para alumnos y alumnos mayores de edad
      int numAlumnos = 0, 
             numMayorDeEdad = 0; 
      double media; 

      System.out.print("Introduzca edad: ");
      int edad = sc.nextInt();

      while (edad >= 0) { 
    	  //acumulamos edades sumando
         sumaEdades += edad; 
         //contamos el numero de alumnos
         numAlumnos++; 
         if (edad >= 18) { 
        	 //contamos el numero de alumnos mayores de edad
            numMayorDeEdad++; 
         }
         System.out.print("Introduzca edad: ");
         edad = sc.nextInt(); 
      }
      //Los resultados finales  se muestran tras salir de los bucles
      // en el bucle se recogen los datos y se acumula y se cuenta
      
      media = (double) sumaEdades / numAlumnos; 

      System.out.println("Suma de todas las edades: " + sumaEdades);
      System.out.println("Media: " + media);
      System.out.println("Número total de alumnos: " + numAlumnos);
      System.out.println("Mayores de edad: " + numMayorDeEdad);
   }
}
