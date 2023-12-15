package ifstatements;

import java.util.Scanner;

public class NestedIf {
	
	public static void main(String[] args) {
		
		Integer number=0;
		int numDivisors=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce an integer");
		
		//we take an Integer from the console
		number = sc.nextInt();
		
		//we check if the number is divisible by 2
		if (number%2==0) {
			
			
			
			
			System.out.println("the number " + number + " is divisible by 2");
			
			numDivisors++;
			if (number%3==0) {
				
				
				System.out.println("the number " + number + " is divisible by 3 and 6");
				numDivisors+=2;
				
				
			} else 	if (number%5==0){
				
				
				System.out.println("the number " + number + " is divisible by 5 and 10");
				numDivisors+=2;
				
				
			}
			
			
			
		}
		
	
	}
	
	

}
