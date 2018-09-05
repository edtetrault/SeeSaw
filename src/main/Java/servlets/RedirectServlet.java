package servlets;
import database.DBConnector;
//import sun.misc.Request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class RedirectServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ResultSet resultSet = null;
        Statement statement = null;
        ArrayList<String> animals_one = new ArrayList<String>();
        try {
            Connection conn = new DBConnector().getConn();
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT animals_one FROM animal_cards");
            while(resultSet.next()) {
                animals_one.add(resultSet.getString("animals_one"));
            }
            request.setAttribute("animals_one", animals_one);
            RequestDispatcher dispatcher = request.getRequestDispatcher("redirected.jsp");
            dispatcher.forward(request, response);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
