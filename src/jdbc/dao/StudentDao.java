package jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbc.util.DBConnection;

// StudentDao---Student Table
public class StudentDao 
{
	// Insert Query
	public int insertStudent(String name,int std,int marks) 
	{
		int rowsAffected = 0;
		// 1) create SQL query
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES ('"+ name +"',"+std+","+marks+")";
		
		System.out.println("insertQuery :" + insertQuery) ;
		
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
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		
		int rowsAffected = 0 ;
		
		StudentDao studentDao = new StudentDao();
		
		rowsAffected = studentDao.insertStudent(name,std,marks);
		
		if (rowsAffected > 0 )
		{
			System.out.println("Student record successfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
	}
}








