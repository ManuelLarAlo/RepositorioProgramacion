package ejerciciosprueba;
import java.util.Scanner;

public class EjercicioSwitchPrueba3 {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			int x;
			int y;
			
			System.out.println("Introduce un punto de coordenadas: ");
			x = sc.nextInt();
			
			System.out.println("Introduce otro punto de coordenadas: ");
			y = sc.nextInt();
			
			if (x>0 && y>0) {
				
				System.out.println("La coordenada " + x + y + " está en el primer cuadrante");
				
			} else if (x<0 && y>0) {
				
				System.out.println("La coordenada " + x + y + " está en el segundo cuadrante");
				
			} else if (x<0 && y<0) {
				
				System.out.println("La coordenada " + x + y + " está en el tercer cuadrante");
				
			} else if (x>0 && y<0) {
				
				System.out.println("La coordenada " + x + y + " está en el cuarto cuadrante");
				
			} else if (x==0 || y==0) {
				
				System.out.println("La coordenada " + x + y + " no está en ningun cuadrante");
				
			} 
		}
	}
	
	

}
