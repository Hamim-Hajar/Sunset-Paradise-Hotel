package com.hotel.DAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ReservationDAOImpl implements ReservationDAO {
	 private Connection connection;

	    public ReservationDAOImpl(Connection connection) {
	        this.connection = connection;
	    }
	@Override
	public List<Reservationclasse> getReservationsByUserId(int userId) {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}

}
