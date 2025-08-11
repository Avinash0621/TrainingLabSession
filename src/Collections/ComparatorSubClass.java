package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSubClass implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);  //Ascending Order
		//return e2.name.compareTo(e1.name);  //Descending Order
	}

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();

		emp.add(new Employee(101, "Avinash"));
		emp.add(new Employee(105, "Ravi"));
		emp.add(new Employee(103, "Pawan"));
		emp.add(new Employee(102, "Deepak"));
		emp.add(new Employee(104, "Zara"));
        
        Collections.sort(emp, new ComparatorSubClass());
        
        for(Employee e : emp) {
        	System.out.println(e);
        }

	}

}
