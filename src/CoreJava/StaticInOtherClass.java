package CoreJava;

public class StaticInOtherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticNonStactic.studName);
		
		StaticNonStactic sv = new StaticNonStactic();
		System.out.println(sv.studId);


	}

}
