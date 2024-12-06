package oops.classobj;

import java.util.Scanner;

public class Student 
{
	// 1) Data Members---Store----Data---into---Data Members
	int rno,std;
	String name;
	
	//scanData method
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno : ");
		rno =  sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name =  sc.nextLine();
		System.out.println("Enter Std : ");
		std =  sc.nextInt();
	}
	// dispData method
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std);
	}
	public static void main(String[] args) 
	{
		// class type variable----->object
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();
	
		Student s[] = new Student[5];
		
		for(int i = 0 ; i < s.length ; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		for(int i = 0 ; i < s.length ; i++) 
		{
			s[i].dispData();	
		}
	}
}
/*

===> 6--oops features

	1) class(User Defined DataType) 
	2) object
	3) encapsulation
	4) inheritance
	5) polymorphism
	6) abstrcation

===> string
		Immutable		Mutable
		==>String		==>StringBuilder
					==>StringBuffer

===> exception
		checked Exception		Unchecked Exception
===> io
===> inner class
===> collection
===> multi threadding
===> jdbc
-----------------------------------------
	Jsp-Servlet
-----------------------------------------

*/