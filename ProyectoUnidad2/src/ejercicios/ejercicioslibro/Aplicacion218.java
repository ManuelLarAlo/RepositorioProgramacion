package ejercicios.ejercicioslibro;
import java.util.Random;
import java.util.Scanner;

public class Aplicacion218 {

   public static void main(String[] args) {
      int solucion = 0;
      
    
      Random random= new Random();
      int n1 = random.nextInt(0, 99);
      int n2 =  random.nextInt(0, 99);
      int operacion = random.nextInt(1,3);
      switch (operacion) {
         case 1:
            System.out.println(n1 + " + " + n2 + "?:");
            solucion = n1 + n2;
            break;
         case 2:
            System.out.println(n1 + " - " + n2 + "?:");
            solucion = n1 - n2;
            break;
         case 3:
            System.out.println(n1 + " * " + n2 + "?:");
            solucion = n1 * n2;
            break;
      }
      Scanner sc = new Scanner(System.in);
      int respuesta = sc.nextInt();
      if (respuesta != solucion) {
         System.out.println("Operación incorrecta.\nLa solución es: " + solucion);
      } else {
         System.out.println("Correcto");
      }
   }
}
