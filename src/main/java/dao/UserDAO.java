package dao;

import model.User;
import util.DBUtil;

import java.sql.*;

import static util.DBUtil.*;

public class UserDAO {

    private static final String LOGIN_QUERY = "SELECT username, password FROM user_table WHERE username= ? AND password= ?";

    public boolean validate(User user) throws ClassNotFoundException{
        boolean status = false;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(LOGIN_QUERY)) {

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());

            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

}
