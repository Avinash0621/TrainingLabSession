package LabSession.July25;

public class Interface1Child implements Interface1 {
	
	@Override
	public void display() {
		System.out.println("Displaying in child class");
		
	}

	@Override
	public void read() {
		System.out.println("Reading in child class");
		
	}

	public static void main(String[] args) {
		
		Interface1Child it = new Interface1Child();
		it.display();             //Abstract
		it.read();				  //Abstract
		it.write();               //Default
		Interface1.show();        //Static
		System.out.println("Name : " + employeeName);
		System.out.println("Id : " + employeeId);

	}	
}
