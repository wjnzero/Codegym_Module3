package com.example.demosystime;



import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");

        PrintWriter writer = response.getWriter();

        if ("admin".equals(username) && "admin".equals(password)) {
            dispatcher.forward(request,response);
        } else {
            writer.println("<html>");
            writer.println("<h1>NGUUUUUUUU!!!!!!</h1>");
            writer.println("</html>");
        }


    }
}
