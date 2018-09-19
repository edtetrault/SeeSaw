package servlets;

import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.*;
import database.DBConnector;
import database.vehiclecardDAO;


public class SeeVehicleServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter writer = response.getWriter();

        vehiclecardDAO vehiclecardDAO = new vehiclecardDAO();

        try {
            vehiclecardDAO.saveVehicleFlashcard(request.getParameter("vehicle_one"), request.getParameter("vehicle_two"),request.getParameter("vehicle_three"),request.getParameter("vehicle_four"),request.getParameter("vehicle_five"),request.getParameter("vehicle_six"));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("vehicle-created.jsp");
        dispatcher.forward(request, response);
    }
}

