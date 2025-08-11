package LabSession.July24;

abstract class Employee {
    String name = "Avinash";
    int id = 82;
    abstract double calculateSalary();
}

class PermanentEmployee extends Employee {
    double monthlySalary = 22500;

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class ContractEmployee extends Employee {
    double hourlyRate = 500;
    int hoursWorked = 40;

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new PermanentEmployee();
        Employee emp2 = new ContractEmployee();

        System.out.println("Salary of Permanent Employee: " + emp1.calculateSalary());
        System.out.println("Salary of Contract Employee: " + emp2.calculateSalary());
    }
}
