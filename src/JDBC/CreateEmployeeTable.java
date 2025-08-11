package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateEmployeeTable {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String pass = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        String sql = "CREATE TABLE employees (id INT PRIMARY KEY, name VARCHAR(50), department VARCHAR(50), salary DOUBLE)";

        Statement st = con.createStatement();
        st.executeUpdate(sql);

        System.out.println("Table 'employees' created.");
        st.close();
        con.close();
    }
}
