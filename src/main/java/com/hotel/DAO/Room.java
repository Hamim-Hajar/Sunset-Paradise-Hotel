package com.hotel.DAO;

public class Room {
	 
	 
	 private int idroom;
	 private String roomtype;
	 private double price;
	 private String equipement;
	 private boolean dispo;
	 //getters and setters
	 public int getidroom() {
			return idroom;
		}
		public void setidroom(int idroom) {
			this.idroom = idroom;
		}
		
		
     public String getroomtype() {
    	 return roomtype;
     }
     public void setroomtype(String roomtype) {
			this.roomtype = roomtype;
		}
     
     public double getprice() {
    	 return price;
     }
     public void setprice(double price) {
			this.price = price;
		}
     public String getequipement() {
    	 return roomtype;
     }
     public void setequipement(String equipement) {
			this.equipement = equipement;
		}
     
     public boolean getdispo() {
    	 return dispo;
     }
     public void setdispo(boolean dispo) {
			this.dispo = dispo;
		}
     
}
