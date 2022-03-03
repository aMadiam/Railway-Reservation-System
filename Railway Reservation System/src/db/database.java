package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class database {
	public static Connection getConnection(){
		Connection con= null;
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/passengerdatabase", "root", "admin12345");
				PreparedStatement ps = con.prepareStatement("insert into reg values(?,?,?,?,?)");
				}
			catch(Exception e){
				System.out.println(e);
			}
			return con;
		}
}