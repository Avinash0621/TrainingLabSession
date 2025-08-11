package Package1;

public class SamePackSubClass extends Class1 {
	
	public void read() {
		System.out.println("Reading in Sub Class");
	}

	public static void main(String[] args) {
		
		SamePackSubClass obj =new SamePackSubClass();
		obj.display();
		obj.read();
		obj.fetchEmployeeId();
		obj.fetchAddress();
	}

}
