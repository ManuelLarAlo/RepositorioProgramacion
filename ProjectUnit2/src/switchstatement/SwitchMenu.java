package switchstatement;

import java.util.Scanner;

public class SwitchMenu {
	public static void main(String[] args) {

		int optionNumber; // Option number from menu, selected by user.
		double measurement; // A numerical measurement, input by the user.
		// The unit of measurement depends on which
		// option the user has selected.
		double inches; // The same measurement, converted into inches.
		/* Display menu and get user’s selected option number. */

		Scanner sc = new Scanner(System.in);

		System.out.println("What unit of measurement does your input use?");
		System.out.println();
		System.out.println(" 1. inches");
		System.out.println(" 2. feet");
		System.out.println(" 3. yards");
		System.out.println(" 4. miles");
		System.out.println();
		System.out.println("Enter the number of your choice: ");
		optionNumber = sc.nextInt();
		/* Read user’s measurement and convert to inches. */
		switch (optionNumber) {
		case 1:
			System.out.println("Enter the number of inches: ");
			measurement = sc.nextDouble();
			inches = measurement;
			System.out.println("The conversion to inches is: " + inches);
			break;
		case 2:
			System.out.println("Enter the number of feet: ");
			measurement = sc.nextDouble();
			inches = measurement * 12;
			System.out.println("The conversion to inches is: " + inches);
			break;
		case 3:
			System.out.println("Enter the number of yards: ");
			measurement = sc.nextDouble();
			inches = measurement * 36;
			System.out.println("The conversion to inches is: " + inches);
			break;
		case 4:
			System.out.println("Enter the number of miles: ");
			measurement = sc.nextDouble();
			inches = measurement * 63360;
			System.out.println("The conversion to inches is: " + inches);

		}

	}

}
