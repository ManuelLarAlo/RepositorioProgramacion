package fundamentals;

import java.util.Scanner;

public class IfSentence {
	
	
public static void main(String[] args) {
	
	
	
	int age=0;
	
	Scanner sc = new Scanner(System.in);
	// The program asks for the person age
	System.out.println("Introduce the age of a Person");
	
	//it assigns the console input to the age variable
	age = sc.nextInt();
	
	
//the if sentence verify if the age is greater than or equal to 15 
// and less than 18
	if (age>= 15 && age < 18)
		System.out.println("The person is a teenager");
	else if (age>= 18)
		System.out.println("The person is an adult");
	else if (age<18)
		
		System.out.println("The person is a minor age person");
	else if (age>=150)  
	
		System.out.println("The person is not a human, maybe he is superman");


		
		
	}

}
