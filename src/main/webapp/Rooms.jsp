<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.hotel.DAO.Room" %>
<%@ page import="com.hotel.DAO.RoomDAO" %>
<%@ page import="com.hotel.DAO.RoomDAOImpl" %>
<%@ page import="com.hotel.DAO.Conn" %>

<%

RoomDAO roomDAO = new RoomDAOImpl(Conn.getConnection());


String startDate = request.getParameter("startDate");
String endDate = request.getParameter("endDate");
int numberOfPeople = Integer.parseInt(request.getParameter("numberOfPeople"));
String roomType = request.getParameter("roomType");

// Effectuez la recherche des chambres disponibles en utilisant RoomDAO
List<Room> availableRooms = roomDAO.searchRooms(startDate, endDate, numberOfPeople, roomType);
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des Chambres d'Hôtel Disponibles</title>
</head>
<body>
    <h1>Liste des Chambres d'Hôtel Disponibles</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Type de Chambre</th>
                <th>Prix</th>
                <th>Équipement</th>
                <th>Disponibilité</th>
            </tr>
        </thead>
        <tbody>
            <% for (Room room : availableRooms) { %>
            <tr>
                <td><%= room.getidroom() %></td>
                <td><%= room.getroomtype() %></td>
                <td><%= room.getprice() %></td>
                <td><%= room.getequipement() %></td>
                <td><%= room.getdispo() ? "Disponible" : "Non Disponible" %></td>
            </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
