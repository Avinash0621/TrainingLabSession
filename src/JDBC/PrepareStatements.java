package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatements {

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
        System.out.print("Enter First Name: ");
        String firstNameInput = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastNameInput = sc.nextLine();
		
		//Execute the queries
		String query = "SELECT * FROM persons where FirstName = ? or LastName = ?;";
		
		//Create a prepare Statement
		PreparedStatement ps = con.prepareStatement(query);
		
		//Set the data
		ps.setString(1, firstNameInput);
        ps.setString(2, lastNameInput);
		
		//Pass the select query to resultset
		ResultSet rs = ps.executeQuery();	
		
		//Result set in JDBC
		while (rs.next()) {
			int id = rs.getInt(1);    
            String Fname = rs.getString("FirstName");
            String Lname = rs.getString("LastName");
            String address = rs.getString(4);
            String city = rs.getString("city");
            
            System.out.println("ID : " + id);
            System.out.println("First Name : " + Fname);
            System.out.println("Last Name : " + Lname);
            System.out.println("Address : " + address);
            System.out.println("City : " + city);
            System.out.println("----------------------------");

        }  
		con.close();
	}
}
