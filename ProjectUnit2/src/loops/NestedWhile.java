package loops;

public class NestedWhile {
	public static void main(String args[]) {
		int i = 1;
		int result = 1;
		while (i <= 3) {
			System.out.println("\n" + i + " " + "outer loop executed only once");
			System.out.println("input number to calculate the fourth power:" + i + " \n");
			int j = 1;
		result = 1;
			while (j <= 4) {

				result *= i;
				System.out.println(j + " " + "inner loop executed until to completion");
				j++;
			}
			System.out.println("\nthe fourth power of the number  " + i + " is " + result);

			i++;
		}
	}
}