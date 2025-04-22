package jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbc.bean.StudentBean;
import jdbc.util.DBConnection;

// StudentDao---Student Table
public class StudentDao 
{
	// Insert Query
	public int insertStudent(StudentBean sbean) 
	{
		int rowsAffected = 0;
		// 1) create SQL query
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES ('"+ sbean.getName() +"',"+ sbean.getStd()+","+sbean.getMarks()+")";
		
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
	public int updateStudent(StudentBean sbean ,int rno) 
	{
		String updateQuery = "UPDATE student SET name='"+sbean.getName()+"' , std="+sbean.getStd()+" , marks="+sbean.getMarks()+"  WHERE rno = "+rno;
		System.out.println("updateQuery : " + updateQuery);
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		int rowsAffected = 0 ;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(updateQuery);
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--updateStudent() Db not connected");
		}
		return rowsAffected;
	}
	// Delete Query
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno = "+rno;
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(deleteQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("Db not conneected : " + conn);
		}
		return rowsAffected;
	}
	// Select Query
	public void getAllStudentRecords() 
	{

	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		----------UPDATE Query-------------------------	
		System.out.println("Enter Rno which you want to Update : ");
		int rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		int rowsAffected = 0 ;
		
		StudentDao studentDao = new StudentDao();
		
		rowsAffected = studentDao.updateStudent(sbean,rno);
		
		if (rowsAffected > 0 )
		{
			System.out.println("Student record successfully Updated : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Updated : " + rowsAffected);
		}
		
		
		
		/*		
		 * 
		 * ----------DELETE Query-------------------------	
		System.out.println("Enter Rno wwhich you want to remove : ");
		int rno = sc.nextInt();
		
		int rowsAffected = 0 ;
		
		StudentDao studentDao = new StudentDao();
		
		rowsAffected = studentDao.deleteStudent(rno);
		
		if (rowsAffected > 0 )
		{
			System.out.println("Student record successfully Deleted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}
		
		
//----------INSERT Query-------------------------		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		int rowsAffected = 0 ;
		
		StudentDao studentDao = new StudentDao();
		
		rowsAffected = studentDao.insertStudent(sbean);
		
		if (rowsAffected > 0 )
		{
			System.out.println("Student record successfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
*/	}
}








