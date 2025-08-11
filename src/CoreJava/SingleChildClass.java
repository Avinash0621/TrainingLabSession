package CoreJava;

public class SingleChildClass extends SingleChildClass2  {
	
	String model = "Mustang";
	
	public void display() {
		System.out.println("Brand is " + brand);   //Inherited
		System.out.println("Model is " + model);
	}
	
	public static void main(String[] args) {
		
		SingleChildClass obj = new SingleChildClass();
		obj.start();
		obj.display();
		obj.color();    //Multilevel Inheritance

	}

}
