package ejemplosenclase;

import java.util.Scanner;

/*  */
public class Resuelta21Modificado {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num; //número introducido por el usuario

      System.out.print("Introduzca un número: ");
      num = sc.nextInt();

      if ((num % 2 == 0) || (num % 3 == 0)) { //si num es par
         System.out.println("Es divisible por dos o por tres");
      } else { // es impar
         System.out.println("No lo es");
      }
   }
}