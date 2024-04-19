package com.hotel.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/hotel";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "jujuRO55";
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
