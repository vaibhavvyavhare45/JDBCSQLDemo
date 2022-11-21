package com.prowings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args) {
		try {
			Connection con=null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/companies";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url,username,password);
			String q="select * from car";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(q);
			while(rs.next()) {
				int id=rs.getInt(1);
				String nm=rs.getString(2);
				double price=rs.getDouble(3);
				String color=rs.getString(4);
				System.out.println("carid: "+ id +"\tcarname: "+nm+"\t\tcarprice: "+price+"\t\t\tcar color: "+color);

			}
			
		} catch (Exception e) {
			
		}
	}

}
