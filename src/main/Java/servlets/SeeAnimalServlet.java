package servlets;

import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.*;
import database.DBConnector;
import database.animalcardDAO;


    public class SeeAnimalServlet extends HttpServlet {


        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            PrintWriter writer = response.getWriter();

            animalcardDAO animalcardDAO = new animalcardDAO();
            //Make a UserDAO variable and from there,
            try {
                animalcardDAO.saveAnimalFlashcard(request.getParameter("animals_one"), request.getParameter("animals_two"),request.getParameter("animals_three"),request.getParameter("animals_four"),request.getParameter("animals_five"),request.getParameter("animals_six"));
                ///Integer.valueOf( request.getParameter("metArtist")), Integer.valueOf(request.getParameter("talkedToArtist")));
            } catch (SQLException e) {
                e.printStackTrace();
            }

            RequestDispatcher dispatcher = request.getRequestDispatcher("animal-created.jsp");
            dispatcher.forward(request, response);
        }
    }

