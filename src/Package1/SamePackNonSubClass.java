package Package1;

public class SamePackNonSubClass {
	
	public void write() {
		System.out.println("Writing in sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SamePackNonSubClass obj1 = new SamePackNonSubClass();
		Class1 obj = new Class1();
		obj.display();
		obj1.write();
		obj.fetchEmployeeId();
		obj.fetchAddress();
	}

}
