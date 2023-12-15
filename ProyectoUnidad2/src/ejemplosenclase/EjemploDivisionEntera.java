package ejemplosenclase;

public class EjemploDivisionEntera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1 =3;
		
		int num2=9;
		
		//division entera, cuidado que si el dividendo es más
		//pequeño que el divisor nos da cero
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		//division decimal con enteros
		
		System.out.println(num1/(num2*1.0)); //0.3333333333333333
		System.out.println(num1/(double) num2);//0.3333333333333333
		System.out.println((double) num1/ num2);//0.3333333333333333
		System.out.println((double) (num1/ num2));//0.0

	}

}
