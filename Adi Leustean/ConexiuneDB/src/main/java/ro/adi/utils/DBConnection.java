package ro.adi.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DBConnection {

	 private static Connection conn = null;
	   
	    public static Connection getConnection() {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	           
	        }
	        try {

	            if (conn == null) {

	                conn = DriverManager.getConnection("jdbc:mysql://" + Configuration.DATABASE_URL + ":"
	                        + Configuration.DATABASE_PORT + "/" + Configuration.DATABASE_NAME + "?" + "user="
	                        + Configuration.DATABASE_USER + "&password=" + Configuration.DATABASE_PASSWORD + "&autoReconnect=true");

	              
	            }
	            if (conn.isClosed()) {

	                conn = DriverManager.getConnection("jdbc:mysql://" + Configuration.DATABASE_URL + ":"
	                        + Configuration.DATABASE_PORT + "/" + Configuration.DATABASE_NAME + "?" + "user="
	                        + Configuration.DATABASE_USER + "&password=" + Configuration.DATABASE_PASSWORD + "&autoReconnect=true");
	            }

	        } catch (SQLException ex) {
	            // handle any errors
	            System.out.println("SQLException: " + ex.getMessage());
	            System.out.println("SQLState: " + ex.getSQLState());
	            System.out.println("VendorError: " + ex.getErrorCode());
	           

	        }
	        return conn;
	    }
	
}
