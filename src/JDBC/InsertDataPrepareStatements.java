package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataPrepareStatements {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Fetch DbUrl, username, password
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
		String username = "root";
		String password = "root";
		
		//Load MySql driver file or upload the jar file
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create a connection to database
		Connection con = DriverManager.getConnection(dbURL, username, password);
		
		//For User Input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Person ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter City: ");
        String city = sc.nextLine();
		
		//Execute the queries
		String insertQuery = "INSERT INTO Persons (PersonId, FirstName, LastName, Address, City) VALUES (?, ?, ?, ?, ?)";
		
		//Create a prepare Statement
		PreparedStatement ps = con.prepareStatement(insertQuery);
		
		//Set the data
		ps.setInt(1, id);
        ps.setString(2, firstName);
        ps.setString(3, lastName);
        ps.setString(4, address);
        ps.setString(5, city);
		
		
		int rows = ps.executeUpdate();
        if (rows > 0) {
        	System.out.println("Record inserted successfully!");
        } else {
        	System.out.println("Failed to insert record.");
        }
	}
}
