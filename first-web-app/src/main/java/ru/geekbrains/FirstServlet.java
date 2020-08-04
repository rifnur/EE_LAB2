package ru.geekbrains;

import javax.servlet.*;
import java.io.IOException;

public class  FirstServlet implements Servlet {
    private transient ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config=config;
    }

    @Override
    public ServletConfig getServletConfig() {

        return this.config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse res) throws IOException {
        res .getWriter().println("<h1> Hello from servlet!!!<h1>");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
