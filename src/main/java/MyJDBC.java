import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/billing_schema", "root", "@Athk9782#");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user_table");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("Usaer_name"));
                System.out.println(resultSet.getString("U_password"));
            }
        }

        catch(SQLException e){
            e.printStackTrace();
        }
    }

}
