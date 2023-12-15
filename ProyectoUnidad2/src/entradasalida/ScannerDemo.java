package entradasalida;
import java.util.Scanner;

public class ScannerDemo
{
    public static void main(String[] args)
    {
        // Declarar el objeto e inicializar con
        // el objeto de entrada estándar predefinido

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce Nombre:");
        // entrada de una cadena
        String name = sc.nextLine();
        System.out.println("Introduce GENERO: H/M");
        // entrada de un carácter
        char gender = sc.next().charAt(0);

        // Entrada de datos numéricos
        // byte, short y float
        System.out.println("Introduce edad");
        int age = sc.nextInt();
        System.out.println("Introduce mobile");
        long mobileNo = sc.nextLong();
        System.out.println("Introduce media");
        double average = sc.nextDouble();

        // Imprima los valores para verificar si la entrada
        // fue obtenida correctamente.
        System.out.println("Nombre: "+name);
        System.out.println("Género: "+gender);
        System.out.println("Edad: "+age);
        System.out.println("Teléfono: "+mobileNo);
        System.out.println("Promedio: "+average);
    }
}