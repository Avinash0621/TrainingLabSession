package CoreJava;

public class ParameterizedMethods {
	public void add(int a, int b){
        System.out.println(a+b);
    }
    public void subtract(int a, int b){
        System.out.println(a-b);
    }
    public void multiply(int a, int b){
        System.out.println(a*b);
    }
    public void divide(int a, int b){
        System.out.println(a/b);
    }
	public static void main(String[] args) {
		
		ParameterizedMethods p1 = new ParameterizedMethods();
		p1.add(12,15);
		p1.subtract(20, 12);
		p1.multiply(8, 7);
		p1.divide(24, 6);
	}

}
