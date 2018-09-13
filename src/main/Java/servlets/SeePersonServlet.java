package servlets;

import database.DBConnector;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


public class SeePersonServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();

        ResultSet resultSet = null;
        Statement statement = null;
        try {
            Connection conn = new DBConnector().getConn();
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT person_two FROM person_cards");
            writer.print("Hello, ");
            while(resultSet.next()){
                System.out.println(resultSet.getString("person_name"));
                writer.print(resultSet.getString("person_name") + ", ");
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
        String sql = "INSERT INTO person_cards (person_one) values (?)";
        String name = request.getParameter("person_one");
         try {
            Connection conn = new DBConnector().getConn();
            statement = conn.prepareStatement(sql);
            statement.setString(1, "person_one");
            int i=statement.executeUpdate();
            writer.print(i +" records inserted");


        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        }
    }


}