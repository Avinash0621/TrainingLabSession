package CoreJava;

public class Circle implements CircleShape{
	
	//Method from Circle
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	//Method from CircleShape
	@Override
	public void radius() {
		System.out.println("Radius is 5 units");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.draw();    
		c.radius();  

	}
}
