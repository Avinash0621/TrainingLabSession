package IO.ByteStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class FilterOutputStreamEx {

	public static void main(String[] args) {
		
		//Filter Stream filter data as they read and write in the input
		//Filter it and pass it onto the underlying stream
		
		FileOutputStream fos = null;
		FilterOutputStream filterout = null;
		
		try {
			
			//Create file input stream to write to the file
			fos = new FileOutputStream("C:\\\\Users\\\\avina\\\\OneDrive\\\\Documents\\\\text1.txt");
			
			//Wrap file input stream with buffered input stream
			filterout = new BufferedOutputStream(fos);
			
			//Write and print the file content
			String text = "Hi How are you ??";
			filterout.write(text.getBytes());
			
			//fos.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
