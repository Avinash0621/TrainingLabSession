package CoreJava;

public class Area {
	
	public double p = 3.14;
	
	public void area(int r) {
		double a = p*r*r;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a1 = new Area();
		a1.area(5);
	}

}
