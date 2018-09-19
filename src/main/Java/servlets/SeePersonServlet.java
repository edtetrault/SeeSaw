package servlets;

import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.*;
import database.DBConnector;
import database.PersoncardDAO;


public class SeePersonServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter writer = response.getWriter();

        PersoncardDAO PersoncardDAO = new PersoncardDAO();

        try {
            PersoncardDAO.savePersonFlashcard(request.getParameter("people_one"), request.getParameter("people_two"),request.getParameter("people_three"),request.getParameter("people_four"),request.getParameter("people_five"),request.getParameter("people_six"));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("person-created.jsp");
        dispatcher.forward(request, response);
    }
}

