package switchstatement;

	
	
	// A Java program to demonstrate working on enum
	// in switch case (Filename Test. Java)
import java.util.Scanner;


	  


public class ExampleEnumMonthOfTheYear {
	
	// An Enum class
	enum Month
	{
	    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
	    JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	}
	  
	// Driver class that contains an object of "day" and
	// main().
	  
	    // Driver method
	    public static void main(String[] args)
	    {
	    	
			String monthName;
			Scanner sc= new Scanner(System.in);
			Month month;
			
			System.out.println("Introduce the name of the month:");
			
			monthName= sc.nextLine();
			
			month= Month.valueOf(monthName.toUpperCase());
	        
	       
	        
	        switch (month)
	        {
	        case DECEMBER,JANUARY,FEBRUARY:
	            System.out.println("Cold, sometimes windy, others snowy.");
	            break;
	        case MARCH, APRIL, MAY:
	            System.out.println("Spring is here, weather betters.");
	            break;
	        case JUNE, JULY, AUGUST:
	        	
	        	System.out.println("Summer time, have a break and enjoy the weather, hot and humid.");
            break;
	        case SEPTEMBER, OCTOBER, NOVEMBER:
	            System.out.println("Good weather, enjoy outside activities until november take over.");
	            break;
	        default:
	            System.out.println("Did you forget one month?");
	            break;
	        }
	        
	        
	       
	    }
	}

