package Collections;

import java.util.Queue;
import java.util.LinkedList;

public class LinkedListUsingQueue {

	public static void main(String[] args) {
		
		Queue<String> qu = new LinkedList<String>();
		
		qu.add("Ravi");
		qu.add("Avinash");
		qu.add("Abhishek");
		qu.add("Raju");
		qu.add("Avinash");			//can add duplicate
		qu.add(null);				//can add null values
		//qu.addLast("Ravi");			//Present in Deque not in queue
		
		System.out.println(qu);
		System.out.println(qu.peek());				//Give first element	
		System.out.println(qu.poll());				//Give first element and delete it  			
		System.out.println(qu.isEmpty());			//Check if it is empty
		//System.out.println(qu.remove(1));			//remove by index
		System.out.println(qu.remove("Raju"));
		System.out.println(qu.size());				//check size of array list
		System.out.println(qu);

	}
}
