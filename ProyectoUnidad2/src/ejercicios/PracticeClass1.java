package ejercicios;

import java.util.Scanner;

public class PracticeClass1 {
	
	public static void main(String[] args) {
		
		int CAN1;
		int CAN2;
		int SUM;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce CAN1: ");
			CAN1 = sc.nextInt();
			
			System.out.println("Introduce CAN2:");
			CAN2 = sc.nextInt();
		}
		
		SUM = CAN1 + CAN2;
		
		System.out.println("La suma es " +SUM);
	}

}
