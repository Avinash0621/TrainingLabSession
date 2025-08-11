package Collections;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//Create ArrayList
		ArrayList<String> al = new ArrayList<String>();
		
		//Insertion of data
		al.add("Ravi");
		al.add("Avinash");
		al.add("Abhishek");
		al.add("Pawan");
		al.add("Deepak");
		al.add("Raju");
		al.add("Avinash");			//can add duplicate
		al.add(null);				//can add null values
		
		System.out.println(al);
		System.out.println(al.get(2));  			//Index retrieving
		System.out.println(al.indexOf("Pawan"));	//Can get index of elements
		System.out.println(al.isEmpty());			//Check if it is empty
		System.out.println(al.remove(1));			//remove by index
		System.out.println(al.remove("Raju"));
		System.out.println(al.set(3, "Raju"));		//set element at a specific index
		System.out.println(al.size());				//check size of array list
		System.out.println(al.lastIndexOf("Raju")); 	//return -1 because Avinash is removed
		System.out.println(al);

	}
}
