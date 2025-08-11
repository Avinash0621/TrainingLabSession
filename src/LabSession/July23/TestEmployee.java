package LabSession.July23;

class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 25000.0;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing employees");
    }

    void addEmployee() {
        System.out.println("HR Manager adds a new employee");
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();             
        System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee();
    }
}
