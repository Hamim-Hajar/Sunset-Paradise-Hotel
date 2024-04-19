package com.hotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomDAOImpl implements RoomDAO {
	private Connection connection;

   
    public RoomDAOImpl(Connection connection) {
        this.connection = connection;
    }
    

    


	public RoomDAOImpl() {
		// TODO Auto-generated constructor stub
	}





	@Override
    public List<Room> searchRooms(String startDate, String endDate, int numberOfPeople, String roomType) {
    	 List<Room> availableRooms = new ArrayList<>();
	        try {
	            
	            String query = "SELECT * FROM room WHERE dispo = true AND roomtype = ? AND capacity >= ?";
	            PreparedStatement statement = connection.prepareStatement(query);
	            statement.setString(1, roomType);
	            statement.setInt(2, numberOfPeople);
	            ResultSet resultSet = statement.executeQuery();
	           
	            while (resultSet.next()) {
	                Room room = new Room();
	                room.setidroom(resultSet.getInt("idroom"));
	                room.setroomtype(resultSet.getString("roomtype"));
	                room.setprice(resultSet.getDouble("price"));
	                room.setEquipement(resultSet.getString("equipement"));
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
        try {
           
            String query = "INSERT INTO reservations (roomId, reserveDate) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, roomId);
            statement.setString(2, reserveDate);
          
            int rowsAffected = statement.executeUpdate();
            
            if (rowsAffected > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public List<Room> displayRoom() throws ClassNotFoundException, SQLException{
        List<Room> room=new ArrayList<Room>();
           String requet = "SELECT * FROM room";
           PreparedStatement statement = Conn.getConnection().prepareStatement(requet);
           ResultSet resultat = statement.executeQuery();

           while (resultat.next()) {
               int idroom = resultat.getInt("idroom");
               String roomtype= resultat.getString("roomtype");
               double price  = resultat.getDouble("price");
               String equipement= resultat.getString("equipement");
               Boolean dispo=resultat.getBoolean("disponibilité");


               Room Room = new Room(idroom, roomtype,price,equipement,dispo );

               room.add(Room);
           }
           System.out.print(room.get(0).getidroom());


           return room;
   }

}
