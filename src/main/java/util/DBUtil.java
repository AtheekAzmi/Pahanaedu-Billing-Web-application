package util;

import java.sql.*;

public class DBUtil {
    private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/billing_schema";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "@Athk9782#";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC Driver not found.", e);
        }
    }
//    public static void main(String[] args) {
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/billing_schema", "root", "@Athk9782#");
//
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM user_table");
//
//            while (resultSet.next()) {
//                System.out.print(resultSet.getString("U_id"));
//                System.out.print("\t");
//                System.out.print(resultSet.getString("username"));
//                System.out.print("\t");
//                System.out.print(resultSet.getString("password"));
//                System.out.print("\n");
//            }
//        }
//
//        catch(SQLException e){
//            e.printStackTrace();
//        }
//    }
}
