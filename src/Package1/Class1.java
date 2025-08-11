package Package1;

public class Class1 {
	
	//Private variable & method
	private static String employeeSalary= "1278345";
	private void fetchsalary() {
		System.out.println("Salary is " + employeeSalary);
	}
	
	//Public method
	public void display() {
		System.out.println("Displaying the Data in Parent Class");
	}
	
	//Default variable & method
	int employeeId = 454;
	void fetchEmployeeId() {
		System.out.println("Employee ID is " + employeeId);
	}
	
	//Protected variable & method
	protected String address = "123, LN-21054";
	protected void fetchAddress() {
		System.out.println("Address is " + address);
	}

	public static void main(String[] args) {
		
		Class1 obj = new Class1();
		obj.display();
		obj.fetchsalary();
		obj.fetchEmployeeId();
		obj.fetchAddress();

	}

}
