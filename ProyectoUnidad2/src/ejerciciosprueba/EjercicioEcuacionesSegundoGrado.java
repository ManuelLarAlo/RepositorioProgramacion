package ejerciciosprueba;
import java.util.Scanner;

public class EjercicioEcuacionesSegundoGrado {
	
	public static void main(String[] args) {
		
		int a, b, c;
		double d, e, f;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce el primer coeficiente: ");
			a = sc.nextInt();
			
			System.out.println("Introduce el segundo coeficiente: ");
			b = sc.nextInt();
			
			System.out.println("Introduce el tercer coeficiente: ");
			c = sc.nextInt();
		}
		
		d=((b*b)-4*a*c);
		
		if (d>0) {
			
			f=(-b+Math.sqrt(d)/(2*a));
			e=(-b-Math.sqrt(d)/(2*a));
			System.out.println("La ecuacion tiene dos soluciones. f es:" + f + "y e es:" + e);
			
		} else if (d==0) {
			
			f= -b/2*a;
			
			System.out.println("La ecuación tiene una solución. f es: " + f);
		
		}
		
	}
	
}
			
			






