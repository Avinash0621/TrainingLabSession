package LabSession.July31;

import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.salary, e1.salary);
    }
}

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Raju", 55000));
        employees.add(new Employee("Ravi", 75000));
        employees.add(new Employee("Deepak", 60000));
        employees.add(new Employee("Zara", 90000));

        Collections.sort(employees, new SalaryComparator());

        System.out.println("Employees Sorted by Salary (Descending):");
        
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
