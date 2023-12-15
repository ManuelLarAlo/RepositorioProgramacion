package bucles.ejemplosenclase;

import java.util.Scanner;
/** hacemos un bucle que pide números por pantalla al
 * usuario y los suma. El bucle acabará cuando introduzcamos
 * el numero cero
 * 
 * 
 * 
 */
public class EjemploBucleSumas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int num=0;
		 int sum=0;
		 int max=Integer.MIN_VALUE;
		 int min=Integer.MAX_VALUE;
		 int cont=0;
		 double media;
		 //El profe quiere variable max y min
		 
		 // probar con el 24, -7 , 19, 11
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Introduce un número distinto de cero para sumar");
		 System.out.println("Si el número es cero acaba el programa.");
		 
		 num= sc.nextInt();
		 max=num;
		 min=num;
		 
		 while (num!=0) {
			 
			 sum=sum+num; // sum+=num
			 cont++;
			 System.out.println("Introduce otro número");
			 num= sc.nextInt();
			 
			 if (num>max)
				 max=num;
			 if (num<min)
				 min=num;
			 
		 }
		 
		 media= (double) sum/cont;
		 System.out.println("El resultado de la suma es:" +sum);
		 System.out.println("El máximo es:" + max);
		 System.out.println("El mínimo es:" + min);
		 System.out.println("La media es:"+ media);
		 

	}

}
