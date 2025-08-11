package LabSession.July25;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        setSalary(salary); 
    }


    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary for employee ID : " + id);
            this.salary = 0;
        }
    }

    public void displayDetails() {
        System.out.println("Employee ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
}
