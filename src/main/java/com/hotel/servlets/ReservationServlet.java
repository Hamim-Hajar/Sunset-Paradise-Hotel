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

import com.hotel.DAO.ReservationDAO;
import com.hotel.DAO.RoomDAO;
import com.hotel.DAO.RoomDAOImpl;
import com.hotel.DAO.Conn;

/**
 * Servlet implementation class ReservationServlet
 */
@WebServlet("/ReservationServlet")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
      private RoomDAO roomDAO;
      private ReservationDAO reservationDAO;
      private Connection connection; 
	    
     
	    @Override
	    public void init() throws ServletException {
	          super.init();
	         
	          connection = Conn.getConnection();
	          
	          roomDAO = new RoomDAOImpl(connection);
	          // Vous devez initialiser reservationDAO ici si vous en avez un
	      }
    
    public ReservationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		RoomDAO roompl =new RoomDAOImpl();
       
            try {
                request.setAttribute("rooms", roompl.displayRoom());
              
            } catch (ClassNotFoundException | SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            this.getServletContext().getRequestDispatcher("/WEB-INF/hotel.jsp").forward(request, response);
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
	        
	}


}
