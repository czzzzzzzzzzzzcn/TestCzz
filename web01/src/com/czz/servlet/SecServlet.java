package com.czz.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SecServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html;charset=utf-8");
        ServletContext application = this.getServletContext();
        String get = (String) application.getInitParameter("get");
        PrintWriter writer = servletResponse.getWriter();
        writer.write("<h1>"+get+"</h1>");
    }
}
