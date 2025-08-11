package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HandlingResultSet {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Fetch DbUrl, username, password
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
		String username = "root";
		String password = "root";
		
		//Load MySql driver file or upload the jar file
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create a connection to database
		Connection con = DriverManager.getConnection(dbURL, username, password);
		
		//Create a statement Object
		Statement st = con.createStatement();
		
		//Execute the queries
		String stquery = "SELECT * FROM persons order by PersonId;";
		
		//Pass the select query to resultset
		ResultSet rs = st.executeQuery(stquery);	
		
		//Result set in JDBC
		while (rs.next()) {
			int id = rs.getInt(1);    //Can also give ColumnNumber
            String name = rs.getString("FirstName");
            String address = rs.getString(4);
            String city = rs.getString("city");
            
            System.out.println("ID : " + id);
            System.out.println("Name : " + name);
            System.out.println("Address : " + address);
            System.out.println("City : " + city);
            System.out.println("----------------------------");
        }  
		con.close();
	}
}
