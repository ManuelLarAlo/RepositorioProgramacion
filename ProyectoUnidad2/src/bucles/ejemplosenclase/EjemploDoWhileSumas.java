package bucles.ejemplosenclase;

import java.util.Scanner;

public class EjemploDoWhileSumas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		 int num=0;
		 int sum=0;
		 //En la clase integer tenemos utilidades para integer
		 // como el valor máximo o el mínimo
		 // ponemos como max le entero más pequeño con el fin de
		 //que el máximo sea un número de los que introduzcamos
		 //igual con el mínimo
		 int max=Integer.MIN_VALUE;
		 int min=Integer.MAX_VALUE;
		 

		 
		 // probar con el 24, -7 , 19, 11
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Introduce numeros distinto de cero para sumar");
	     // como el do while se ejecuta al menos una vez no hace falta
		 // pedir numeros fuera y dentro del bucle como haciamos con 
		 // el while
		do {
			
			System.out.println("Introduce un número");
			num= sc.nextInt();
			sum+=num;
			// nos aseguramos que el máximo y el mínimo
			// no es cero, cero es el numero de salida
			if (num>max && num!=0)
				 max=num;
			 if (num<min&& num!=0)
				 min=num;	
			 
			
			
		} while(num!=0);
		
		 System.out.println("El resultado de la suma es:" +sum);
		 System.out.println("El máximo es:" + max);
		 System.out.println("El mínimo es:" + min);

	}

}
