package LabSession.July25;

interface Shape {
	void getarea();
}

//SubClass 1
class Rectangle implements Shape {
	 double l;
	 double b;
	 Rectangle(double l,double b){
		 this.l = l;
		 this.b = b;
	 }
	@Override
	public void getarea() {
		double area = l*b;
		System.out.println("Area of rectangle : " + area);
	}
 
}

//Subclass 2
class Circle implements Shape {
	 double radius;
	 Circle(double radius){
		 this.radius = radius;
	 }
	@Override
	public void getarea() {
		double area = Math.PI * radius * radius;
		System.out.println("Area of circle : " + area);
	}
 
}
class Triangle implements Shape {
	int base;
	int height;
	Triangle(int base,int height){
		this.base = base;
		this.height = height;
	}
	@Override
	public void getarea() {
		double area= 0.5 * base * height;
		System.out.println("Area of triangle : " + area);
	}
 
}
public class ShapeTest{
	public static void main(String[] args) {
		Circle c = new Circle(2);
		Rectangle r = new Rectangle(2,4);
		Triangle t = new Triangle(2,5);
		c.getarea();
		r.getarea();
		t.getarea();
		
	}
}
 
 