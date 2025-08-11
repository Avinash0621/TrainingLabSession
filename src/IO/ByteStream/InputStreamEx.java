package IO.ByteStream;

import java.io.FileInputStream;

public class InputStreamEx {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream input = new FileInputStream("C:\\Users\\avina\\OneDrive\\Documents\\text.txt");
			System.out.println("Data in the file");
			
			//reads the byte
			int i = input.read();
			
			while (i != -1) {
				System.out.print((char) i);
				//reads next byte from file
				i= input.read();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
