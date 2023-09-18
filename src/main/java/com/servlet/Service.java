package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Service {
		
		public static boolean validateUser(String username, String password) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/mzos","root","Onkar@4721");
				System.out.println("Got Connection...");
				
				Statement smt = con.createStatement();
				ResultSet rs= smt.executeQuery("select * from details");
				
				while(rs.next()) {
					String user = rs.getString(1);
					String pass = rs.getString(2);
					
					if(username.equalsIgnoreCase(user) && password.equals(pass)) {
						return true;		
					}else {
			 		return false;
					}
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		} 
 		
	}


