package MultiThreading;

public class Restaurent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Cooking("Dosa");
		Thread t2 = new Cooking("Rice");
		Thread t3 = new Cooking("Dessert");
		Thread t4 = new Cooking("Dal");
		Thread t5 = new Cooking("Chapati");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
