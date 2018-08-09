package servlets;
import database.LoadDatabase;

import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import javax.servlet.*;

import static java.lang.System.out;

public class HelloServlets extends HttpServlet {

    Connection c = new LoadDatabase().getConn();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        response.setContentType("text/html");

        PrintWriter writer= response.getWriter();
        writer.print("Welcome to See-Saw");

        writer.print("<html><body>");
        writer.print("<h2>Hello World</h2>");
        writer.print("<hr>");
        writer.print("Time on the server is:" + new java.util.Date());
        writer.print("</body></html>");
    }


}

//how to create a database statement in the servlet
//use post when you are sending information, particularly sensitive information to the server