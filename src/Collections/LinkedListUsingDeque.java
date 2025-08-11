package Collections;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListUsingDeque {

	public static void main(String[] args) {
		
		Deque<String> dqu = new LinkedList<>();
		
		dqu.add("Ravi");
		dqu.add("Avinash");
		dqu.add("Abhishek");
		dqu.add("Deepak");
		dqu.add("Avinash");			//can add duplicate
		dqu.add(null);				//can add null values
		dqu.addLast("Ravi");		//Present in Deque not in queue
		
		System.out.println(dqu);
		System.out.println(dqu.peek());  			//Give first element	
		System.out.println(dqu.poll());				//Give first element and delete it
		System.out.println(dqu.isEmpty());			//Check if it is empty
		//System.out.println(dqu.remove(3));			//remove by index
		System.out.println(dqu);
		System.out.println(dqu.removeLast());
		System.out.println(dqu);
		System.out.println(dqu.size());				//check size of array list
		System.out.println(dqu);
		
		
	}

}
