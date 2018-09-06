package servlets;

import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.*;
import database.DBConnector;


public class SeeAnimalServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();

        ResultSet resultSet = null;
        Statement statement = null;
        try {
            Connection conn = new DBConnector().getConn();
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT animal_name FROM animal_cards");
            writer.print("Hello, ");
            while(resultSet.next()){
                System.out.println(resultSet.getString("animal_name"));
                writer.print(resultSet.getString("animal_name") + ", ");
            }
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        }finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException sqlEx) {
                    System.out.println(sqlEx);
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException sqlEx) {
                    System.out.println(sqlEx);
                }
            }
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();

        PreparedStatement statement = null;
        String sql = "INSERT INTO animal_cards (animals_one) values (?)";
        String name = request.getParameter("animals_one");
         try {
            Connection conn = new DBConnector().getConn();
            statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            int i=statement.executeUpdate();
            writer.print(i+" records inserted");


        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        }
    }


}
