package controller;


import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String studentId = request.getParameter("studentId");
        String name = request.getParameter("name");
        String marks = request.getParameter("marks");

        // For now, just print to console
        System.out.println("Student Added: " + studentId + ", " + name + ", " + marks);

        response.getWriter().println("Student Added Successfully!<br><a href='home.jsp'>Back to Home</a>");
    }
}

