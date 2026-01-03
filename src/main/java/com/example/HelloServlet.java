package com.example;

import com.example.util.MathUtil;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        int a = 5, b = 7;
        int sum = MathUtil.add(a, b);
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h1>Tomcat Demo</h1>");
        resp.getWriter().println("<p>Time: " + LocalDateTime.now() + "</p>");
        resp.getWriter().println("<p>Sum(" + a + "," + b + ") = " + sum + "</p>");
        resp.getWriter().println("<p><a href='index.jsp'>Home</a></p>");
        resp.getWriter().println("</body></html>");
    }
}