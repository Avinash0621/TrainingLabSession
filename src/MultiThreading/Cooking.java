package MultiThreading;

public class Cooking extends Thread {

	private String task;
	
	Cooking(String task){
		this.task = task;
	}
	
	public void run() {
		System.out.println(task + " is being prepared by " + Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		

	}
}

/*
 * class Test1 { public static void main(String[] args) { // TODO Auto-generated
 * method stub NewThreadEx t1 = new NewThreadEx(); t1.run();
 * 
 * }
 * 
 * }
 */