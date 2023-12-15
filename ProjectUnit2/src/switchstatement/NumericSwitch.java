package switchstatement;

import java.util.Scanner;

public class NumericSwitch {

	public static void main(String[] args) {

		Integer number = 0;
		int numDivisors = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce an integer between 1 and 10");
		
		//we take an Integer from the console
		number = sc.nextInt();

		switch (number) { // (Assume N is an integer variable.)
		case 1:
			System.out.println("The number is 1.");
			break;
		case 2:
		case 4:
		case 8:
			System.out.println("The number is 2, 4, or 8.");
			System.out.println("(That’s a power of 2!)");
			break;
		case 3:
		case 6:
		case 9:
			System.out.println("The number is 3, 6, or 9.");
			System.out.println("(That’s a multiple of 3!)");
			break;
		case 5:
			System.out.println("The number is 5.");
			break;
		default:
			System.out.println("The number is 7 or is outside the range 1 to 9.");
		}

	}

}

