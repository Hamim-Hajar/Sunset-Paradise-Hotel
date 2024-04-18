package com.hotel.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReservationServlet
 */
@WebServlet("/ReservationServlet")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 private static final String JDBC_URL = "jdbc:mysql://localhost:3306/hotel";
	    private static final String JDBC_USER = "root";
	    private static final String JDBC_PASSWORD = "jujuRO55";
       
    
    public ReservationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String action = request.getParameter("action");

	        if (action != null) {
	            switch (action) {
	                case "searchRooms":
	                    
	                    searchRooms(request, response);
	                    break;
	                case "makeReservation":
	                   
	                    makeReservation(request, response);
	                    break;
	                case "viewReservations":
	                   
	                    viewReservations(request, response);
	                    break;
	                default:
	                    response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Action non valide");
	                    return;
	            }
	        } else {
	            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Action manquante");
	            return;
	        }
		doGet(request, response);
	}
	
	 private void viewReservations(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void makeReservation(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void searchRooms(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
	        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
	           
	            String sql = "SELECT * FROM rooms WHERE available = true";
	            PreparedStatement statement = conn.prepareStatement(sql);
	            ResultSet resultSet = statement.executeQuery();

	           
	            PrintWriter out = response.getWriter();
	            out.println("<html><body>");
	            out.println("<h2>Résultats de la recherche :</h2>");
	            while (resultSet.next()) {
	                
	                out.println("<p>Type de chambre : " + resultSet.getString("type") + "</p>");
	               
	            }
	            out.println("</body></html>");
	        } catch (SQLException e) {
	            e.printStackTrace();
	            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Erreur de base de données");
	        }
	    }


}
