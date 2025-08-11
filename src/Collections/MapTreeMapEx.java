package Collections;

import java.util.TreeMap;
import java.util.Map;

public class MapTreeMapEx {
	public static void main(String[] args){
		
		Map<Integer, String > tm = new TreeMap<>();

	    tm.put(1,"Avinash");
	    tm.put(2,"Abhishek");
	    tm.put(4,"Advik");
	    tm.put(3,"Ravi");
	    tm.put(7,null);


	    System.out.println(tm.keySet()); 		// It returns set of keys
	    System.out.println(tm.entrySet()); 		// It shows the all entries

	    System.out.println(tm.containsValue("Abhishek"));
	    System.out.println(tm.containsKey(5));


	    // Yha traverse kr raha hu that will prove treeset stores the value in sorted manner
	    for(Map.Entry<Integer, String> t : tm.entrySet()){
	    	System.out.println(t.getKey() + " : "+ t.getValue());
	    }

	    System.out.println(tm.get(4));
	    System.out.println(tm.size());
	    tm.put(1,"Doreamon");
	    System.out.println(tm.entrySet());

	}
}

	 

/*
1. An object that maps keys to values
2. A map cannot contain duplicate keys
3. Each key can map to at most one value
4. Ordering - it is sorted based on the natural ordering of its keys
5. Values can be duplicated
6. No null as key is allowed
7. Multiple null values are allowed  
8. not synchronized 
 */

