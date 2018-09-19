package servlets;

import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.*;
import database.DBConnector;
import database.ActivitycardDAO;


public class SeeActivityServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter writer = response.getWriter();

        ActivitycardDAO ActivitycardDAO = new ActivitycardDAO();

        try {
            ActivitycardDAO.saveActivityFlashcard(request.getParameter("activity_one"), request.getParameter("activity_two"),request.getParameter("activity_three"),request.getParameter("activity_four"),request.getParameter("activity_five"),request.getParameter("activity_six"));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("activity-created.jsp");
        dispatcher.forward(request, response);
    }
}

