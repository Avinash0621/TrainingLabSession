package IO.ByteStream;

import java.io.*;

public class ByteArrayOutputStreamEx {

	public static void main(String[] args) {
		
		//read the array of Input Data
		String data  = "This is a Training Session";
		
		try {
			
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] array = data.getBytes() ;
			
			out.write(array);
			
			String st = out.toString();
			System.out.println("Output Stream : " + st);
			
			out.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
