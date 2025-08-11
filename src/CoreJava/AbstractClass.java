package CoreJava;

abstract class AbstractClass {
	
	//Abstract Methods
	abstract void makeSound();
		
	//Concrete Method
	public void eat() {
		System.out.println("Animals eats food");
	}
	
	//Abstract Class
	AbstractClass(){
		System.out.println("Creating Constructor in Abstract Class");
	}
	
	//Instance variable
	public static String animalName = "Lion";
	
	//Final Variable
	@SuppressWarnings("unused")
	private final String animalBeh = "Attacker";
	
	
}


/* 

Abstract class

1. It is defined using the abstract keyword
2. Abstract methods + normal methods
3. Cannot create the object for abstract class
4. Child/ sub  classes access the data of the abstract classes


What is allowed in abstract class

1. Abstract methods
2. Normal methods
3. Constructors
4. Instance variables
5. Static variables / static methods
6. Final methods
7. Access modifiers for methods and fields are allowed
8. Inheritance
9. Interface implementation
10. Main method 

*/