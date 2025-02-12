package com.example.my_project.service;

import java.sql.*;
public class Database{
	public static void main(String[] args)  throws Exception{
		String url = "jdbc:mysql://localhost:3306/rentfinder";
		String uname = "root";
		String pass = "Pandu@7463";
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

