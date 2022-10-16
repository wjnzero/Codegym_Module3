package com.example.demosystime;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MenuServlet", value = "/menu")
public class MenuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String button = request.getParameter("choose");


        RequestDispatcher requestConvert = request.getRequestDispatcher("convertMoney.jsp");
        RequestDispatcher requestDic = request.getRequestDispatcher("simpleDic.jsp");
        RequestDispatcher requestPdc = request.getRequestDispatcher("productDiscountCalculator.jsp");
        String contextPath = request.getContextPath();


        PrintWriter writer = response.getWriter();
        if ("convert".equals(button)) {
            requestConvert.forward(request, response);
        }
        else if ("time".equals(button)){
//            requestSysTime.forward(request,response);
            response.sendRedirect(contextPath+"/ServerTimeServlet");
        }
        else if ("dictionary".equals(button)){
            requestDic.forward(request,response);
        } else if ("pdc".equals(button)) {
            requestPdc.forward(request,response);
        } else {
            writer.println("<html>");
            writer.println("<h1>ccc</h1>");
            writer.println("</html>");
        }
    }
}
