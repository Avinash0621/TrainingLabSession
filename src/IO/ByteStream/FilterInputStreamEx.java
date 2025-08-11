package IO.ByteStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class FilterInputStreamEx {

	public static void main(String[] args) {
		
		//Filter Stream filter data as they read and write in the input
		//Filter it and pass it onto the underlying stream
		
		FileInputStream fis = null;
		FilterInputStream filterinput = null;
		
		try {
			
			//Create file input stream for the file
			fis = new FileInputStream("C:\\\\Users\\\\avina\\\\OneDrive\\\\Documents\\\\text.txt");
			
			//Wrap file input stream with buffered input stream
			filterinput = new BufferedInputStream(fis);
			
			//Read and print the file content
			int data;
			while((data = filterinput.read()) != -1) {
				System.out.print((char)data);
			}
			fis.close();
			
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
