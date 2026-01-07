package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("userid");
        String pass = request.getParameter("password");

        if (user.equals("admin") && pass.equals("admin123")) {
            response.sendRedirect("home.jsp");
        } else {
            response.getWriter().println("Invalid login credentials");
        }
    }
}

