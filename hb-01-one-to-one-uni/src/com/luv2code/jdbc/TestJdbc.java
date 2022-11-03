package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbc = "jdbc:mysql://localhost:3306/hb-one-to-one-uni?useSSL=false";
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try {
			System.out.println("Connecting to db:"+jdbc);
			Connection myCon = DriverManager.getConnection(jdbc, user, pass);
			System.out.println("Connection success");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
