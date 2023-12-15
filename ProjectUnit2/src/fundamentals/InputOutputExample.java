package fundamentals;

import java.util.Scanner;



public class InputOutputExample {
	final int MAX_TEMP = 120;
	
	public static void main(String[] args) {
		
		int age=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce the age of a Person");
		age = sc.nextInt();
		
		
		if (age>= 18)
			System.out.println("The person is an adult");
		else if (age<18)
			
			System.out.println("The person is a minor age person");
		else if (age>=150)  
		
			System.out.println("The person is not a human, maybe he is superman");
		
		
	}
}
