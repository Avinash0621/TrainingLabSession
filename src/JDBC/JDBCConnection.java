package JDBC;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

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
		String stquery = "SELECT * FROM persons;";
		
		//Pass the select query to resultset
		ResultSet rs = st.executeQuery(stquery);	
		
		//Result set in JDBC
		while (rs.next()) {
			int id = rs.getInt(1);
            String name = rs.getString("FirstName");
            String address = rs.getString("Address");
            String city = rs.getString("city");
            
            System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address + ", City: " + city);
        }
		//Close database Connection
		con.close();
	}
}
