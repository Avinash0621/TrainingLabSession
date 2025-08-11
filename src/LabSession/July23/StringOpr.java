package LabSession.July23;

public class StringOpr {

	public static void main(String[] args) {
		
		String s1 = "Core Java";
		String s2 = "Selenium";
		
		System.out.println(s1);
		System.out.println(s2);
		
		//String Methods 
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equalsIgnoreCase(s1));
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains(s2));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1,4));
		System.out.println(s2.replace('m','M'));
		System.out.println(s1.replaceAll(s1,"Ajay"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.endsWith("e"));
		System.out.println(s1.compareTo(s2));
		
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}