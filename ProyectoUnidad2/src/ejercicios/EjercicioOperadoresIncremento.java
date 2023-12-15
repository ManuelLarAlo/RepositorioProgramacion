package ejercicios;

public class EjercicioOperadoresIncremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=0;
		
		System.out.println("Incremento despues");
		//Porque este escribe cero
		//Tomar nota explicarlo con vuestras palabras
		// Cuando pongo el ++ a a la derecha, estoy
		// diciendo que lo ultimo que se hace en esta
		//linea es sumar 1 el incremento
		//primero se escribe en pantalla
		System.out.println(contador++);
		
		System.out.println(contador);
		
		contador=0;
		
		System.out.println("Incremento antes");
		//Y este escribe uno
		System.out.println(++contador);
		
		System.out.println(contador);
		
		
		

	}

}
