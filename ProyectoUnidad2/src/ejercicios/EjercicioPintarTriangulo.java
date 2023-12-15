package ejercicios;

public class EjercicioPintarTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 pintarTriangulo(10);
		 pintarTrianguloImpares(7);

	}

	
	public static void pintarTriangulo(int n) {
		
		for (int i=1 ; i <=n ; i ++) {
			
			for (int j=1; j<=i ; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}

	public static void pintarTrianguloImpares(int n) {
		
		for (int i=1 ; i <=n ; i ++) {
			
			for (int j=i; j>=1 ; j--) {
				
				System.out.print(2*j-1+ " ");
			}
			
			System.out.println();
			
		}
		
	}


}
