package CoreJava;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("hello");
		
		System.out.println(sb);
		System.out.println(sb.append(" World!"));
		System.out.println(sb.isEmpty());
		System.out.println(sb.delete(2,2));
		System.out.println(sb.substring(4));
		System.out.println(sb.substring(2,4));
		System.out.println(sb.replace(0,1,"H"));
		System.out.println(sb.indexOf("World"));
		System.out.println(sb.length());
		System.out.println(sb.insert(2,"t"));
		System.out.println(sb.reverse());
		//System.out.println(sb.repeat());
		System.out.println(sb);


	}

}
