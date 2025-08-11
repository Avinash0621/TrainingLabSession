package Collections;

import java.util.Vector;

public class VectorsEx {

	public static void main(String[] args) {
		
		//Create Vector
		Vector<String> al = new Vector<>();
		
		//Insertion of data
		al.add("Ravi");
		al.add("Avinash");
		al.add("Abhishek");
		al.add("Pawan");
		al.add("Deepak");
		al.add("Raju");
		al.add("Avinash");			//can add duplicate
		al.add(null);				//can add null values
		
		//https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html
		
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.firstElement());  	
		System.out.println(al.lastElement());
		System.out.println(al.indexOf("Pawan"));	//Can get index of elements
		System.out.println(al.isEmpty());			//Check if it is empty
		System.out.println(al.remove(1));			//remove by index
		System.out.println(al.remove("Raju"));
		System.out.println(al.firstElement());
		System.out.println(al.set(3, "Raju"));		//set element at a specific index
		System.out.println(al.size());				//check size of array list
		System.out.println(al.lastIndexOf("Raju")); 	//return -1 because Avinash is removed
		//al.trimToSize();
		System.out.println(al.capacity());
		System.out.println(al);
		System.out.println(al.elements());
		System.out.println(al.iterator());
		System.out.println(al.toString());

	}
}


		//Growable array of objects
		//Zero based Index
		//Maintains the insertion order
		//Stores duplicate elements
		//Capacity Incement
		//Null Values are Allowed
		//Synchronise in Nature
