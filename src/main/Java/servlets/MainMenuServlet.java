package servlets;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.*;
import database.DBConnector;

public class MainMenuServlet extends HttpServlet {

    public void getPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.print("Hello this is where I will put the web page. eventually.");

    }
}
