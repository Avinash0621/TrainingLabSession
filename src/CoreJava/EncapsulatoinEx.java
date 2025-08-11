package CoreJava;

public class EncapsulatoinEx {
	
	//Private Fields : Hidden from outside access
	private String name;
	private int age;
	
	//Public getter methods
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//Public setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		
		EncapsulatoinEx en = new EncapsulatoinEx();
		en.setName("Avinash");
		en.setAge(22);
		System.out.println("Name : "+ en.getName());
		System.out.println("Age : "+ en.getAge());

	}

}
