package ejercicios.ejercicioslibro;

import java.util.Scanner;

public class Ejercicio211SolucionA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaramos variables ara unidades u, decenas d
		// centenas c y millares m
          int u,d,c,m;	
          //guardamos si el numero será capicua o no
          boolean capicua=false;
		  
	      int num; //número introducido por el usuario
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Introduzca un número para ver si es capicua: ");
	      num = sc.nextInt();
	      //sacamos las unidades cogiendo el resto de 1
		  u= num%10;
	      //num = Math.abs(num);
	      //Si el numero tiene una sola cifra
	      if (num<10) {
	    	  
	    	  capicua = true;
	      // si el numero tiene dos cifras
	      } else if (num <100) {	    	  
	    	 // sacamos las decenas dividiendo por 10
	    	  d = (num/10)%10; 	  
	    	  // comparamos las unidades con las decenas 
	    	  // 55 sería capicua u=5 y d =5
	    	  if (u==d)	    		  
	    		  capicua=true;
	    	  else
	    		  capicua = false;
	    	  
	      // si el numero tiene tres cifras  
	      } else if (num <1000) {
	    	  
	    	  // sacamos las 
	    	  c= (num/100)%10;
	    	  //  comparamos las unidades con las decenas 
	    	  // 575 sería capicua u=5 y c =5 las centenas no importan
	    	  if (u==c)	    		  
	    		  capicua=true;
	    	  else
	    		  capicua = false;
	    	  
	    	  
	      	} else if (num<10000) {
	      		
		    	 d = (num/10)%10;
		    	 c= (num/100)%10;
		    	 m= num/1000;
		         // comparamos las unidades con los millares
		    	 // y las decenas con las centenas
		    	  // 5775 sería capicua d=7 y c =7 y
		    	  // y unidades con millares u=5 y m =5
		    	 if ((u==m) && (d==c))
		    			 capicua=true;
		   	    	  else
		   	    		  capicua = false;
	      		
	      }
	      
	      
	      
	      
	      if (capicua) 
	    	  System.out.println("El numero " + num +" es capicua");
	      else
	    	  System.out.println("El numero " + num +" no es capicua");
	    	  

	}

}
