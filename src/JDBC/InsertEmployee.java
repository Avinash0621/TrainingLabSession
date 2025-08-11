package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEmployee {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String pass = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        String sql = "INSERT INTO employees (id, name, department, salary) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, 101);
        ps.setString(2, "Avinash");
        ps.setString(3, "Devloper");
        ps.setDouble(4, 80000);

        int rows = ps.executeUpdate();
        System.out.println(rows + " row inserted.");

        ps.close();
        con.close();
    }
}
