package jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
	public ArrayList<StudentBean> getAllStudentRecords() 
	{
		String selectQuery = "select rno,name,std,marks from student";
		ResultSet rs = null;
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		StudentBean sbean = null;
		ArrayList<StudentBean> list = new ArrayList<>();
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(selectQuery);
				while(rs.next()) 
				{
					int rno = rs.getInt(1);//rs.getInt("rno");
					String name = rs.getString(2);//rs.getString("name");
					int std = rs.getInt(3);//rs.getInt("std");
					int marks = rs.getInt(4);//rs.getInt("marks");

					sbean =  new StudentBean(rno, name, std, marks);
					
					list.add(sbean);
//					System.out.println(rno+" " + name+" " + std +" " + marks);	
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--getAllStudentRecords() Db not connected");
		}
		return list;
	}
	public static void main(String[] args) 
	{
		StudentDao dao = new StudentDao();
		
		ArrayList<StudentBean> list = dao.getAllStudentRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
		
/*		
//		----------UPDATE Query-------------------------	
		Scanner sc = new Scanner(System.in);
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








