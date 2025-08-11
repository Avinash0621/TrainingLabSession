package CoreJava2;

public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 100;
			int b = 0;
			int c = a/b;
			
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
