package oops.statictopic;

import java.util.Scanner;

public class Student 
{
	int rno;// Per Object 
	String name;// Per Object 
	int std;// Per Object 
	static String schoolName;// Single(One Copy) for a Class
	
	// static Property --->static method
	public static void setSchoolName(String schoolName) 
	{
		Student.schoolName = schoolName;
	}
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno+" "+ name + " "+std+" " + schoolName) ;
	}
	public static void main(String[] args) 
	{
		Student.setSchoolName("DPS");
		
		Student s1 = new Student();// s1---->[rno name std]
		Student s2 = new Student();// s2---->[rno name std]
		Student s3 = new Student();// s3---->[rno name std]			[schoolName]--DPS
		Student s4 = new Student();// s4---->[rno name std]
		Student s5 = new Student();// s5---->[rno name std]
		
		s1.scanData(); // 1 rahul 12 DPS
		s2.scanData(); // 2 kunal 10 DPS
		s3.scanData(); 
		s4.scanData(); 
		s5.scanData(); 
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
		s4.dispData();
		s5.dispData();
		
		s1.setSchoolName("AnandNiketan");
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
		s4.dispData();
		s5.dispData();
	}
}
// JVM---Execution Flow
//----------------------

/*
 * ---> 1) class load
 * ---> 2) static dm's memory allocation 
 * ---> 3) main method
 * 			ClassName.static method----static dm's--access -->Nonstatic---X
 * 
 * 
 * ---> 4) object create---->memory allocation of [Dm's]  
 * ---> 5) object --call---Non-Static method --->Nonstatic Dm's + Static Methods + static Dm's
 */




