package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteEmployee {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String pass = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        String sql = "DELETE FROM employees WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, 101);

        int rows = ps.executeUpdate();
        System.out.println(rows + " row deleted.");

        ps.close();
        con.close();
    }
}
