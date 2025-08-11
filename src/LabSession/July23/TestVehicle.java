package LabSession.July23;

class Vehicle {
    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();  // Output: Repairing a car
    }
}
