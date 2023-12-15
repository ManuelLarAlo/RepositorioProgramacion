package ejercicios;

public class EjercicioBucleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador=0;
		
		//El do while se hace una o mas veces
		//primero se ejecuta y luego se 
		//evalua la condición. Si la condición
		//es falsa se entra una vez en el
		//bucle
		do {			
			
			System.out.println("Bucle do while Iteración: "
			+ contador);
			contador++;
			
			
		} while (contador<10);
				
		 contador=0;
		 
		 //El while se hace 0 o más veces
		 //porque primero se evalua la
		 //condicion. Si la condición es falsa
		 //nunca se entra en el bucle
		while(contador<10) { 
			
			System.out.println("Bucle while iteración:"+
						contador);			
			contador++;			
		}
		
		
		
		do {
			
			System.out.println("Condicion falsa pero Entra");
			
		} while(false);
		/*
		while(false) {
			
			//System.out.println("Nunca entra por aqui");
		}*/
		
		
		
		
	}

}
