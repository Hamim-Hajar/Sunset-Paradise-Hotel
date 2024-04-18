package com.hotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class RoomDAOImpl implements RoomDAO{
	 private Connection connection;

	    public RoomDAOImpl(Connection connection) {
	        this.connection = connection;}
	@Override
	public List<Room> searchRooms(String startDate, String endDate, int numberOfPeople, String roomType) {
		 List<Room> availableRooms = new ArrayList<>();
	        try {
	            
	            String query = "SELECT * FROM rooms WHERE dispo = true AND roomtype = ? AND capacity >= ?";
	            PreparedStatement statement = connection.prepareStatement(query);
	            statement.setString(1, roomType);
	            statement.setInt(2, numberOfPeople);
	            ResultSet resultSet = statement.executeQuery();
	           
	            while (resultSet.next()) {
	                Room room = new Room();
	                room.setidroom(resultSet.getInt("idroom"));
	                room.setroomtype(resultSet.getString("roomtype"));
	                room.setprice(resultSet.getDouble("price"));
	                room.setequipement(resultSet.getString("equipement"));
	                room.setdispo(resultSet.getBoolean("dispo"));
	                availableRooms.add(room);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return availableRooms;
	}

	@Override
	public boolean makeReservation(int roomId, String reserveDate) {
		// TODO Auto-generated method stub
		return false;
	}

}
