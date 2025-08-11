package Collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class EqualsMethodJDBC {
	
	int id;
	String name;
	
	EqualsMethodJDBC(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		
		Employee other = (Employee)obj;
		return this.id == other.id && this.name.equals(other.name);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}
	
	@Override
	public String toString() {
        return id + " - " + name;
    }

	public static void main(String[] args) throws SQLException {
		
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
		String username = "root";
		String password = "root";
		
		//create a connection to database
		Connection con = DriverManager.getConnection(dbURL, username, password);
		
		
		//Execute the queries
		
		//String stquery = "CREATE TABLE employees (id INT PRIMARY KEY, name VARCHAR(50))";
		//Statement st = con.createStatement();
	    //st.executeUpdate(stquery);
	    //System.out.println("Table 'employees' created.");
	    
		
		String sql = "SELECT * FROM employees where id = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1,2);
		
		//st1.setString(2,"Avinash");
		//st1.setInt(1,2);
		//st1.setString(2,"Abhishek");
		
		//int rows = st1.executeUpdate();
		//System.out.println(rows + " row inserted.");
		
		//Statement st = con.createStatement();
		
        //Statement st = con.createStatement();
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
        	int id = rs.getInt("id");    
            String name = rs.getString("name");
            
            System.out.println("ID : " + id);
            System.out.println("Name : " + name);
            System.out.println("------------------------");
        }
		
		/*List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1,"Raju"));
        employees.add(new Employee(4,"Ravi"));
        employees.add(new Employee(3,"Deepak"));
        employees.add(new Employee(3,"Deepak"));
        employees.add(new Employee(2,"Zara"));
        
        for (Employee e : employees) {
            System.out.println(e);
        }*/


	}
}
