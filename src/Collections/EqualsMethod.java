package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class EqualsMethod {
	
	int id;
	String name;
	
	EqualsMethod(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		
		Employee other = (Employee)obj;
		return this.id == other.id && this.name.equals(other.name);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}
	
	@Override
	public String toString() {
        return id + " - " + name;
    }

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1,"Raju"));
        employees.add(new Employee(4,"Ravi"));
        employees.add(new Employee(3,"Deepak"));
        employees.add(new Employee(3,"Deepak"));
        employees.add(new Employee(2,"Zara"));
        
        for (Employee e : employees) {
            System.out.println(e);
        }
	}

}
