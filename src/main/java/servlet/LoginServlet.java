package servlet;

import dao.UserDAO;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebServlet("/login") // Optional if also mapped in web.xml
public class LoginServlet extends HttpServlet {

    private UserDAO userDAO;

    @Override
    public void init() {
        userDAO = new UserDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

//        System.out.println("[DEBUG] Received credentials: " + username + " / " + password);

        User loginUser = new User(username, password);

        try {
            if (userDAO.validate(loginUser)) {
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                session.setAttribute("password", password);
                response.sendRedirect("dashboard.jsp");
            } else {
                response.sendRedirect("index.jsp?error=true");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}