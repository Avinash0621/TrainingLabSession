package IO.CharacterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		
		//Write to file using file writer
		FileWriter fw = new FileWriter("C:\\Users\\avina\\OneDrive\\Documents\\text1.txt");
		fw.write("I am a file writer");
		fw.close();
		
		//Read from file using file reader
		FileReader fr = new FileReader("C:\\Users\\avina\\OneDrive\\Documents\\text1.txt");
		int i;
		
		while ((i=fr.read()) != -1) {
			System.out.print((char)i);
		}
		fr.close();		
	}

}
