package LabSession.July24;

abstract class Vehicle {
    abstract void move();
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is moving on four wheels");
    }
}

class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("Bike is moving on two wheels");
    }
}

class Bus extends Vehicle {
    @Override
    void move() {
        System.out.println("Bus is moving on six wheels");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        car.move();
        bike.move();
        bus.move();
    }
}
