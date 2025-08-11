package AccessPack;
import customers.Customer;

public class MainCustomer extends Customer {

	public static void main(String[] args) {
		MainCustomer cust = new MainCustomer();
		cust.printDetails();    // Accessing protected method
		
	}
}
