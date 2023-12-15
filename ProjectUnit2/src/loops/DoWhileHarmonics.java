package loops;

import java.util.Scanner;

public class DoWhileHarmonics {
	
	
	
	 public static void main(String[] args) {
	        int i;
	        
	        i = 1;
	        int n=1;
	        double seriesElement=1;
	        double seriesAddition=seriesElement;
	        Scanner sc = new Scanner(System.in);

			

				System.out.println("How many elements of the harmonic series do you want to calculate? "
						+ "\nType an integer number greater than or equal to 1");
				
				
				n = sc.nextInt();
				
				
			do {
				
				System.out.println("The  " + i +  " series number is "+ seriesElement);
				i++;
				seriesElement = seriesElement +  (1/(double) i);
				seriesAddition=seriesAddition+ seriesElement;
				
				
			} while (i<=n);
	
				
				System.out.println("\nThe summatory of the  " + n +  " elements of the Harmonic Series is "+ seriesAddition);

				
				
	 }
}
