package servlet;

import dao.UserDAO;
import model.User;
import  javax.servlet.*;

import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet{

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

        User loginUser = new User(username, password);

        if (userDAO.validate(loginUser)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("dashboard.jsp");
        } else {
            request.setAttribute("errorMessage", "Invalid username or password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

}
