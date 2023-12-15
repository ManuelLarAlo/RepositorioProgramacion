package loops;
import java.util.Scanner;
/** hacemos un bucle que pide números por pantalla al
 * usuario y los suma. El bucle acabará cuando introduzcamos
 * el numero cero
 * 
 * 
 * 
 */
public class ExampleAdditionLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int num=0;
		 int sum=0;
		 int max=Integer.MIN_VALUE;
		 int min=Integer.MAX_VALUE;
		 int count=0;
		 double average;
		 //El profe quiere variable max y min
		 
		 // probar con el 24, -7 , 19, 11
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a number different from zero");
		 System.out.println("If the number is zero, the program ends.");
		 
		 num= sc.nextInt();
		 max=num;
		 min=num;
		 
		 while (num!=0) {
			 
			 sum=sum+num; // sum+=num
			 count ++;
			 System.out.println("Type another number");
			 num= sc.nextInt();
			 
			 if (num>max)
				 max=num;
			 if (num<min)
				 min=num;
			 
		 }
		 
		 average = (double) sum/count;
		 System.out.println("The addition is :" +sum);
		 System.out.println("the maximun number is:" + max);
		 System.out.println("The minimun number is:" + min);
		 System.out.println("The average is:"+ media);
		 

	}

}
