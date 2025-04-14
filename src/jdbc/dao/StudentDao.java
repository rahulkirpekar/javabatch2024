package jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.util.DBConnection;

// StudentDao---Student Table
public class StudentDao 
{
	// Insert Query
	public int insertStudent() 
	{
		int rowsAffected = 0;
		// 1) create SQL query
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES ('krishna',8,70)";
		
		// 2) get Db Connection
		Connection conn = DBConnection.getConnection();
		
		// 3) validate conn object
		if (conn != null) 
		{
			try 
			{
				// 4) conn object ===> create statement 
				Statement stmt = conn.createStatement();

				// 5) execute sql query by executeUpdate()
				rowsAffected = stmt.executeUpdate(insertQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--insertStudent() Db not connected");
		}
		return rowsAffected;
	}
	// Update Query
	public void updateStudent() 
	{

	}
	// Delete Query
	public void deleteStudent() 
	{

	}
	// Select Query
	public void getAllStudentRecords() 
	{

	}
	public static void main(String[] args) 
	{
		int rowsAffected = 0 ;
		
		StudentDao studentDao = new StudentDao();
		
		rowsAffected = studentDao.insertStudent();
		
		if (rowsAffected > 0 )
		{
			System.out.println("Student record successfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
	}
}








