package fundamentals;

public class StringExample {
	
	
public static void main(String[] args) {

	String myString= "You can concat almost every primitive type with Strings in Java.";
	
	double average= 24.1;
	int myAge= 35;
	final boolean STATEMENTTRUE=true;
	
	
	
	myString = myString + "\n" + "The age average is " + average ;
	myString =  myString + "\n" + "Nevertheless, my age is " + myAge ;
	
	myString =  myString + "\n" + "As a result, I am over the average age " + true;
	
		System.out.println(myString);
		
		
	}

}
