package CoreJava;

//Super Class
class An {
	public void eat() {
		System.out.println("Animals eat");
	}
}

//Subclass 1
class dog extends An {
	public void bark(){
		System.out.println("Dog barks");
	}
}

//Subclass 2
class cat extends An{
	public void meow() {
		System.out.println("Cat meows");
	}
}

//Subclass 3
class cow extends An{
	public void moo() {
		System.out.println("Cow moos");
	}
}

class Animal {
	public static void main (String[] args) {
		
		dog d = new dog();
		d.eat();
		d.bark();
		
		cat c = new cat();
		c.eat();
		c.meow();
		
		
		cow cw = new cow();
		c.eat();
		cw.moo();
	}
}
