package IO.CharacterStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterReaderEx {

	public static void main(String[] args) throws IOException {
		
		//Reading and Writing line by line to file using Buffer reader and writer
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\avina\\OneDrive\\Documents\\text1.txt"));
		bw.write("I am a buffered file writer");
		bw.close();
		
		//Read from file using file reader
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\avina\\OneDrive\\Documents\\text.txt"));
		String Line;
		
		while ((Line = br.readLine()) != null) {
			System.out.println(Line);
		}
		br.close();		
	}

}
