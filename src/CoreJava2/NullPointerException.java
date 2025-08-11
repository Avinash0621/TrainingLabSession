package CoreJava2;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String S1 = null;
			System.out.println(S1.length());
		}
		catch(Exception n) {
			System.out.println(n);
		}
		finally {
			System.out.println("Code is executed.");
		}

	}

}
