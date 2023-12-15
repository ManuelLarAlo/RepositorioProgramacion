package loops;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.Function;

public class ForNumberProductTable {
	
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Introduce a number between 1 and 10 ");
		number= sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			
			System.out.println( number +"X" + i+"="+ number*i);
			
		}
		
		
		
		
		Double d =8.1;
		double d1=8.1;
		
		Math.abs(-5);
		
		
		
		try {
			FileWriter fw =new FileWriter("C://dev//file.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
