package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectAllEmployees {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String pass = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        String sql = "SELECT * FROM employees";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
        	int id = rs.getInt("id");    
            String name = rs.getString("name");
            String dept = rs.getString("department");
            String sal = rs.getString("salary");
            
            System.out.println("ID : " + id);
            System.out.println("Name : " + name);
            System.out.println("Department : " + dept);
            System.out.println("Salary : " + sal);
            System.out.println("------------------------");
        }

        rs.close();
        st.close();
        con.close();
    }
}
