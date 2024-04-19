package com.hotel.DAO;

public class Room {
	 
	 
	 private int idroom;
	 private String roomtype;
	 private double price;
	 
	 private String equipement;
	 private boolean dispo;
	 public Room(int idroom2, String roomtype2, double price2, String equipement2, Boolean dispo2) {
		// TODO Auto-generated constructor stub
	}
	public Room() {
		// TODO Auto-generated constructor stub
	}
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
    
     
     public boolean getdispo() {
    	 return dispo;
     }
     public void setdispo(boolean dispo) {
			this.dispo = dispo;
		}
	public String getEquipement() {
		return equipement;
	}
	public void setEquipement(String equipement) {
		this.equipement = equipement;
	}
     
}
