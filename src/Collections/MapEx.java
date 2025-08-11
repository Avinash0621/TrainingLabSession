package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Advik");
		map.put(2, "Avinash");
		map.put(3, "Abhishek");
		map.put(4, "Raj");
		map.put(5, "Ravi");
		
		//Converting Map to Set
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Entry ent = (Map.Entry)(itr.next());
			System.out.println(ent.getKey() + " - " + ent.getValue());
		}	
	}
}


	/*
	An Object that map keys to values
	Each key can map atmost one value
	It is sorted based on keys
	Only one null as key is allowed
	Multiple null values are allowed
	*/

