package CoreJava;

public class GC {
	
	public void finalize() {
		System.out.println("Object garbage is collected");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		GC obj = new GC();
		
		//By nulling the reference
		obj = null;
		
		GC obj1 = new GC();
		GC obj2 = new GC();
		obj1 = obj2;
		
		//Object is out of range
		GC obj4 = new GC();
		
		System.gc();
	}
}
