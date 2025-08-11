package IO.ByteStream;

import java.io.*;

public class ByteArrayInputStreamEx {

	public static void main(String[] args) {
		
		//read the array of Input Data
		byte[] array = {1,2,3,4,5};
		
		try {
			
			ByteArrayInputStream input = new ByteArrayInputStream(array);
			
			for (int i=0; i<array.length; i++) {
				int data = input.read();
				System.out.println(data);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
