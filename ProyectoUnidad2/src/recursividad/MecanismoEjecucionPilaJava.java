package recursividad;
public class MecanismoEjecucionPilaJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first_func();
	}

	public static void first_func() {
		second_func();
	}

	public static void second_func() {
		System.out.println("Hello World");
	}

}
