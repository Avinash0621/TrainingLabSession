package LabSession.July25;

public class EmployeeTest {
    public static void main(String[] args) {

    	Employee emp1 = new Employee("Rahul", 101, 5000);
        Employee emp2 = new Employee("Avinash", 102, -2000);
        Employee emp3 = new Employee("Raj", 103, 0);
        Employee emp4 = new Employee("Saurabh", 104, 1000);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
        emp4.displayDetails();
    }
}
