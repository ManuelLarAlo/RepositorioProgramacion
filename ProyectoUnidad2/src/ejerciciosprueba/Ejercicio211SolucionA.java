package ejerciciosprueba;

import java.util.Scanner;

public class Ejercicio211SolucionA {

   public static void main(String[] args) {
       // TODO Auto-generated method stub
       
int u,d,c,m;        
boolean capicua=false;
       
    int num; //número introducido por el usuario
    try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Introduzca un número para ver si es capicua: ");
		num = sc.nextInt();
	}
    u= num%10;
    //num = Math.abs(num);
   
    if (num<10) {
       
        capicua = true;
    } else if (num <100) {
       
       
        d = num/10;
       
        if (u==d)            
            capicua=true;
        else
            capicua = false;
       
       
    } else if (num <1000) {
       
   
        c= num/100;
       
        if (u==c)            
            capicua=true;
        else
            capicua = false;
       
       } else if (num<10000) {
           
            d = (num/10)%10;
            c= (num/100)%10;
            m= num/1000;
           
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