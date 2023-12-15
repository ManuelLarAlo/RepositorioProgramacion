package ejercicios.ejercicioslibro;

import java.util.Scanner;

public class ResueltoEnClase34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * alturas introducidas 12, 15, 8, 10
		 * etiqueta             0    1  2   3
		 * 
		 * la etiqueta la tengo que poner yo
		 * lo hago con una variable contador llamada etiqueta
		 * que empieza en el cero
		 * 
		 * me voy a quedar con el arbol de mayor altura
		 * voy a guardar la altura en maxAltura y la etiqueta del
		 * arbol en maxEtiqueta
		 * 
		 */
		
		int altura=0,maxAltura=0;
		int etiqueta=0;
		// el primer máximo es la primera etiqueta, el primer arbol,0
		int maxEtiqueta=etiqueta;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce una altura para el arbol:");
		
		altura = sc.nextInt();
		
		while(altura!=-1) {
			//arbol mas alto
			if (altura>maxAltura) {
				
				maxAltura= altura;
				maxEtiqueta= etiqueta;
			}
			etiqueta++;
			System.out.println("Introduce una altura para el arbol:");
			
			altura = sc.nextInt();
			
		}		
		
		System.out.println("El arbol con etiqueta " 
		+ maxEtiqueta + " tiene de altura" + maxAltura );
	}

}
