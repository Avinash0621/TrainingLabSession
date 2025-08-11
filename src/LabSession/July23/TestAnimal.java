package LabSession.July23;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat barks");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound();  // Output: Cat barks
    }
}
