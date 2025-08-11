package CoreJava;

public class Stringex {

	public static void main(String[] args) {
		
		String s1 = "World!";
		char[] ch = {'h','e','l','l','o'};
		String s2 = new String(ch);
		String s3 = new String ("Hello");
		String text = "Java is a Programming Language";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//String Methods 
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.concat(s1));
		System.out.println(s1.contains(s2));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1,4));
		System.out.println(s2.replace('h','H'));
		System.out.println(s3.replaceAll(s3,"Ajay"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.endsWith("e"));
		System.out.println(s1.compareTo(s2));
		
		String[] result = text.split(" ");
		for (String str :result) {
			System.out.print(str + ",");
		}
	}
}
