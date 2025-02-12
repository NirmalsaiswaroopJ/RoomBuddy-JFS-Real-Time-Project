package com.example.my_project.service;
// This file was done for testing purpose of connection establishment with my database
import java.sql.*;
public class Database{
	public static void main(String[] args)  throws Exception{
		String url = "YOUR LOCAL HOSTING SQL URL";
		String uname = "YOUR_USERNME";
		String pass = "YOUR_PASSWORD";
		String query = "select id from users;";
		Class.forName("com.mysql.jdbc.Driver"); //class forName
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()){
			int userData = rs.getInt(1);
			System.out.println(userData);
		}
		st.close();
		con.close();
	}
}

