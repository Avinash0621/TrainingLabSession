package CoreJava;

public class InterfaceABChild implements InterfaceA,InterfaceB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceABChild it = new InterfaceABChild();
		InterfaceA.display();
		it.display();

	}
}
