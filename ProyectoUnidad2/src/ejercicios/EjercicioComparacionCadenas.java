package ejercicios;

public class EjercicioComparacionCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cadena1="holf4aaaaaaaaaaaaaaaa";
		String cadena2="hola1bbbbbbbbbbbbbbbbb";
		
		System.out.println(cadena1.compareTo(cadena2));
		
		if (cadena1.compareTo(cadena2)>0) {
			
			System.out.println(cadena1 + "-" + cadena2);
		} else if (cadena1.compareTo(cadena2)==0) {
			
			
			
		} else  {
			
			
		}
		
		//compareTo()
		// devuelve mayor que cero si cadena1 es mayor que cadena2
		// devuelve cero si son iguales
		// devuelve menor que cero si cadena1 es menor que cadena2
		
		
	}

}
