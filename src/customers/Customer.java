package customers;

public class Customer {
    protected String customerName = "Bob";
    protected int customerId = 303;
    protected String customerDepartment = "Retail";


    protected void printDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Department: " + customerDepartment);
    }
}
