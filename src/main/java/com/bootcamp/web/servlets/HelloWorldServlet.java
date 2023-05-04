package com.bootcamp.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = 2466326697168189098L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        response.setContentType("text/html");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Hello World</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Hello World</h1><hr/>");
        out.print("</body>");
        out.print("</html>");
        out.flush();
        out.close();
    }
}
