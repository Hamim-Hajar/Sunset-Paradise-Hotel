package com.hotel.DAO;

import java.util.List;

public interface ReservationDAO {
	 List<Reservationclasse> getReservationsByUserId(int userId);
}
