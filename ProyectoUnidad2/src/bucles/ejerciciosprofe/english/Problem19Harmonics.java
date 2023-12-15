package bucles.ejerciciosprofe.english;

import java.util.Scanner;

public class Problem19Harmonics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int n=0;
		double sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to compute the Harmonic series");
		
		n = sc.nextInt();
		for (int i=1 ; i<=n; i++) {
			
			if (i==n)
				System.out.println(1.0/i );
			else
				System.out.print(1.0/i + ",");
			sum=sum+1.0/i;
		}
		
		System.out.println("The sum of the first n harmonic terms is: " + sum);
		
		

	}

}
