package CoreJava;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("hello");
		
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
		//System.out.println(sb.repeat());    //Not available in latest versions
		System.out.println(sb);


	}

}
