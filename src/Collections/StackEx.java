package Collections;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		//Create Stack (LIFO)
		Stack<Integer> al = new Stack<>();
		
		//Insertion of data
		al.add(2);
		al.add(30);
		al.add(50);
		al.add(60);
		al.add(10);
		al.add(30);
		al.add(40);	
		al.add(60);					//can add duplicate
		al.add(null);				//can add null values
		
		System.out.println(al);
		System.out.println(al.peek());  			//Index retrieving
		System.out.println(al.push(120));
		System.out.println(al);
		System.out.println(al.indexOf(60));			//Can get index of elements
		System.out.println(al.empty());				//Check if it is empty
		System.out.println(al.remove(1));			//remove by index
		System.out.println(al.pop());
		System.out.println(al.set(3, 100));			//set element at a specific index
		System.out.println(al.size());				//check size of array list
		System.out.println(al.lastIndexOf(60)); 	//return -1 because Avinash is removed
		System.out.println(al.indexOf(60));
		System.out.println(al);
		System.out.println(al.capacity());
		System.out.println(al);
		System.out.println(al.elements());
		System.out.println(al.iterator());
		System.out.println(al.toString());

	}
}
