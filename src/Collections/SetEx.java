package Collections;

import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {

		Set<String> al = new TreeSet<>();
		
		//Insertion of data
		al.add("Ravi");
		al.add("Avinash");
		al.add("Abhishek");
		al.add("Pawan");
		//al.add(null);				//can't add null values but in quotes
		al.add("Deepak");
		al.add("Raju");
		al.add("Avinash");			//can't add duplicate
					
		
		//https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
		
		System.out.println(al);
		System.out.println(al.isEmpty());			//Check if it is empty
		System.out.println(al.remove("Raju"));
		//System.out.println(al.remove(2));
		System.out.println(al.size());				//check size of array list
		System.out.println(al);
		System.out.println(al.iterator());
		System.out.println(al.toString());

	}

}
