package com.hotel.DAO;

import java.sql.Connection;
import java.sql.*;
import java.util.*;



public interface RoomDAO {
	 List<Room> searchRooms(String startDate, String endDate, int numberOfPeople, String roomType);
	    boolean makeReservation(int roomId, String reserveDate);
}
