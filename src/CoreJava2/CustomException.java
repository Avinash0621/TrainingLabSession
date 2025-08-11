package CoreJava2;

public class CustomException {
	
	public static void checkage(int age) throws Exception{
		// TODO Auto-generated method stub
		
		if (age<18) {
			System.out.println("Create a new exception");
			throw new Exception("Age must be above 18");
		}
		else {
			System.out.println("person is not eligible.");
		}

	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CustomException ce = new CustomException();
		CustomException.checkage(15);
		
	}

}
