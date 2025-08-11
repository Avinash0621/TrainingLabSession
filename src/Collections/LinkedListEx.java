package Collections;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		//Create LinkedList
		LinkedList<String> al = new LinkedList<>();
		
		//Insertion of data
		al.add("Ravi");
		al.add("Avinash");
		al.add("Abhishek");
		al.add("Pawan");
		al.add("Deepak");
		al.add("Raju");
		al.add("Avinash");			//can add duplicate
		al.add(null);				//can add null values
		al.addLast("Ravi");
		
		System.out.println(al);
		System.out.println(al.get(2));  			//Index retrieving
		System.out.println(al.indexOf("Pawan"));	//Can get index of elements
		System.out.println(al.isEmpty());			//Check if it is empty
		System.out.println(al.remove(1));			//remove by index
		System.out.println(al.remove("Raju"));
		System.out.println(al.set(5, "Raju"));		//set element at a specific index
		System.out.println(al.size());				//check size of array list
		System.out.println(al.lastIndexOf("Raju")); 	//return -1 because Avinash is removed
		System.out.println(al);

	}
}
