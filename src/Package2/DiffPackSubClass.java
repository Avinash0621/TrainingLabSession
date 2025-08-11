package Package2;
import Package1.Class1;

public class DiffPackSubClass extends Class1 {
	public void create() {
		System.out.println("Creating in sub class");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiffPackSubClass obj = new DiffPackSubClass();
		obj.create();
		obj.display();
		obj.fetchAddress();

	}
}
