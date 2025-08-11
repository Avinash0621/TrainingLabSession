package LabSession.July25;

interface Animal {    
    static void bark() {
    	System.out.println("Animals Speak");
    }
}

class Dog implements Animal {
	public void bark() {
        System.out.println("Dog is barking");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
    	
        Animal.bark();

        Dog d = new Dog();
        d.bark();
    }
}
