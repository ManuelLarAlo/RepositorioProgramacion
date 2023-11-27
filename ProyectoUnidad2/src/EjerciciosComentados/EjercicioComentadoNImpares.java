package EjerciciosComentados;

import java.util.Scanner;

public class EjercicioComentadoNImpares {

    public static void main(String[] args) {
        
        // Variable to store the user input for the number of odd numbers to display
        int n = 0;
        
        // Using a try-with-resources statement to automatically close the Scanner
        try (Scanner sc = new Scanner(System.in)) {
            
            // Requesting the user to enter the number up to which odd numbers should be displayed
            System.out.println("Introduce el número hasta que hay que mostrar impares");
            
            // Reading user's input for the value of "n"
            n = sc.nextInt();
            
            // Variable "i" to store the odd numbers and a loop to look through odd numbers up to "n" and display them
            for (int i = 1; i <= n; i = i + 2) {
                // Checking if the next odd number is the last one to be displayed
                if (i + 2 > n) {
                    // Printing the odd number without a comma if it's the last one
                    System.out.print(i);
                } else {
                    // Printing the odd number with a comma if it's not the last one
                    System.out.print(i + ",");
                }
            }
        }
    }
}
