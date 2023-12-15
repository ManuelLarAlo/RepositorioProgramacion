package variablescopepassingparameters;

public class PersonPassinParameters {
	
	
	
	private String name ="";
	private String lastName="";
	private int age;
	
	
	public PersonPassinParameters() {
		
		
	}
	
	
	
	
	public PersonPassinParameters(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public void parameterAsReferenceCapitalize(PersonPassinParameters person) {
		
		
		
		person.setName(person.getName().substring(0,1).toUpperCase()
				+ person.getName().substring(1,person.getName().length()));
		
		person.setLastName(person.getLastName().substring(0,1).toUpperCase()
				+ person.getLastName().substring(1,person.getLastName().length()));
		
	}

	
	public void parameterByValueAge(int age) {
		
		age = age+1;
		
		System.out.println("Age parameter value after modified:" + age);
		
		this.setAge(age);
		
	}


	
	
	
	
	@Override
	public String toString() {
		return "PersonPassinParameters [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
	}




	// m method
    public static void main(String[] args)
    {
    	
    	int newAge =45;
    	PersonPassinParameters person1=  new PersonPassinParameters("johny", "shotgun", 40);
    	
  
		
    	person1.parameterByValueAge(newAge);
    	
    	System.out.println("newAge variable after passing by value:" + newAge);
    	
    	
    	System.out.println("Person1 before passed by reference:" + person1  );
    	
    	person1.parameterAsReferenceCapitalize(person1);
    	
    	
    	System.out.println("Person1 after passed by reference:" + person1  );
    	
    	
    
    }

}
