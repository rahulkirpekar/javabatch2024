package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	// 1) Make credentials
	private static final String URLNAME = "jdbc:mysql://localhost:3306/test";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	// 2) create getConnection method
	public static Connection getConnection() 
	{
		Connection conn = null;
		try 
		{
			// 3) load Driver class--"Driver.class"---object
			Class.forName(DRIVERCLASS);
			
			// 4) pass credentials into DriverManager's getConnection
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
		} catch (SQLException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) 
	{
		Connection conn = DBConnection.getConnection();
		
		// 5) validate connection object
		if (conn!=null) 
		{
			System.out.println("Db connected : "+conn);
		} else 
		{
			System.out.println("Db not connected : "+conn);
		}
	}
}