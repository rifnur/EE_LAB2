package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "FirstHttpServlet", urlPatterns = "/first-http-servlet")

public class FirstHttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1> Привет First Http Servlet!!!</h1>");
        resp.getWriter().println("<p> con Hello First Http Servlet!!!</p>");
    }
}
