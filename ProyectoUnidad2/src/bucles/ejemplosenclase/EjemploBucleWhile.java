package bucles.ejemplosenclase;

public class EjemploBucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable contador
		int i=0;
		//variable de tipo de acumulador, suma en este caso
		int sum=0;
		//variable de tipo máximo;
		int max;
		
		//variable de tipo mínimo;
		int min;
		
		max=i;
		min=i;
		
		while (i<10) {
			
			System.out.println("el valor del contador es: " + i);
			sum+=i;//sum= sum +i;
			i=i+1;
			
			if (i>max)
					max=i;
			
			if (i<min) 
					min=i;
			
			//i++
		}
		// sum = 1 +2 +3 +4 +5 +6 +7 +8 +9
		
		System.out.println("suma de los numeros de 0 a "+ (i-1) + " es " +sum);
		System.out.println("El máximo es:"+  max);
		System.out.println("El mínimo es:" + min);
		
		//

	}

}
