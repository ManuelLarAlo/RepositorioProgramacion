package ejemplosenclase;

import java.util.*;
/* Un programa que nos diga
 * El numero es casi cero positivo, 
 * casi cero negativo , que es cero o no es casi-cero
 * */
public class Resuelta24 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US); 

      System.out.print("Introduzca un número real positivo o negativo: ");
      double num = sc.nextDouble();
      if (( num > 0) && (num < 1)) {
         System.out.println("Es un número casi-cero positivo");
      } else if ((num > -1) && ( num < 0) ){
    	     System.out.println("Es un número casi-cero negativo");
      }else if(num==0){
    	  
    	  System.out.println("El numero es cero");
      } 
      else {    	     
    	     System.out.println("No es un casi-cero");
      }
   }
}