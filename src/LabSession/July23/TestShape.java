package LabSession.July23;

class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

public class TestShape {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Area of rectangle: " + rect.getArea());  
    }
}
