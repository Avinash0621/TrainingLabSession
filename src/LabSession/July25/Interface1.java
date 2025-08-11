package LabSession.July25;

public interface Interface1 {
	
	//Abstract Method
	abstract void display();
	
	//By default abstract
	void read();
	
	//Static Method
	static void show() {
		System.out.println("Showing in parent class");
	}
	
	//Default Method
	default void write() {
		System.out.println("Writing in parent class");
	}
	
	//Variables
	public static final String employeeName = "Rohil";
	int employeeId = 4546;   //By default public static final
	
	//Can't have Constructors
	/*public static void main(String[] args) {
		Interface1 it = new Interface1();
	}*/
}