package dao;

import model.User;
import util.DBUtil;

import java.sql.*;

public class UserDAO {
    private static final String LOGIN_QUERY = "SELECT username, password FROM users WHERE username = ? AND password = ?";

    public boolean validate(User user) {
        boolean status = false;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(LOGIN_QUERY)) {

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());

            try (ResultSet rs = ps.executeQuery()) {
                status = rs.next(); // true if user exists
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}
