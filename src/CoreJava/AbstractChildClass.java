package CoreJava;

public class AbstractChildClass extends AbstractClass {
	
	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Animals make Sound");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChildClass obj = new AbstractChildClass();
		obj.makeSound();
		obj.eat();
		System.out.println(animalName);
		//System.out.println(obj.animalBeh);

	}

	
}
