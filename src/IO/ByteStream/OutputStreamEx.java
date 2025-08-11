package IO.ByteStream;

import java.io.FileOutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "I am attending the Java training Class";
		
		try {
			
			FileOutputStream output = new FileOutputStream("C:\\Users\\avina\\OneDrive\\Desktop\\output.txt");
			byte[] array = data.getBytes();
			output.write(array);
			output.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
