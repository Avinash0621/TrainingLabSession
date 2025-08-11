package IO.CharacterStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C://Users//avina//OneDrive//Documents//File 1.txt"));
		Student s = (Student)in.readObject();
		
		//Printing the object details
		System.out.println("Id : " + s.id + ", Name : " + s.name);
		
		in.close();
		
	}

}
