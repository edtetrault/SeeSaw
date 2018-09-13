package servlets;

import database.DBConnector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


public class CreatedAnimalServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();

        ResultSet resultSet = null;
        Statement statement = null;
        try {
            Connection conn = new DBConnector().getConn();
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT activity_two FROM activity_cards");
            writer.print("Hello, ");
            while(resultSet.next()){
                System.out.println(resultSet.getString("activity_name"));
                writer.print(resultSet.getString("activity_name") + ", ");
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
        String sql = "INSERT INTO activity_cards (activity_one) values (?)";
        String name = request.getParameter("activity_one");
         try {
            Connection conn = new DBConnector().getConn();
            statement = conn.prepareStatement(sql);
            statement.setString(1, "activity_one");
            int i=statement.executeUpdate();
            writer.print(i +" records inserted");
             RequestDispatcher dispatcher = request.getRequestDispatcher("animal-created.jsp");
             dispatcher.forward(request, response);


        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        } catch (ServletException e) {
             e.printStackTrace();
         }
    }


}
