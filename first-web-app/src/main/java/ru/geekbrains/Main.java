package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "Main", urlPatterns = "/first-http-servlet")

public class Main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Main</h1>");
        resp.getWriter().println("<a href=\"main\">Main</a>");
        resp.getWriter().println("<a href=\"product\">Product</a>");
        resp.getWriter().println("<a href=\"order\">Order</a>");
        resp.getWriter().println("<a href=\"catalog\">Catalog</a>");
        resp.getWriter().println("<a href=\"cart\">Cart</a>");

    }
}
