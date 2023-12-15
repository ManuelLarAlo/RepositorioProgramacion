package ejercicios;

public class EjercicioOperadores {
	
	 public static void main(String[] args) {
		 
		 short s= 8;
		 
		 int i=1;
		 int j=3;
		 double d =3.2;
		 float f = 3.3f;
		 
		 double suma = i+d;
		 
		 int multiplicacion = s*i;
		 
		 long multiplicacion2 = i*5L;
		 
		 
		 
		 float mult3= multiplicacion2*f;
		 
		 double division = i/ (double) j;
		 
		 System.out.println("Division " + division);
		 
		 System.out.println(d+i);
		 
		 if (i%2==0)
			 System.out.println("El numero es par" + i);
		 
	 }

}
