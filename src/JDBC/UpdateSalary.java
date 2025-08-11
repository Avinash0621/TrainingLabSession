package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateSalary {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String pass = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        String sql = "UPDATE employees SET salary = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setDouble(1, 70000);
        ps.setInt(2, 104);

        int rows = ps.executeUpdate();
        System.out.println(rows + " row updated.");

        ps.close();
        con.close();
    }
}
