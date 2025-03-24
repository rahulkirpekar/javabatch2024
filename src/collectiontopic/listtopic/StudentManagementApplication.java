package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList<Student>();
		Student s = null;		
		int choice = 0;
		
		do 
		{
			System.out.println("Enter below choice : ");
			System.out.println("1) Insert Student---list        ");
			System.out.println("2) Update Student By Rno---list ");
			System.out.println("3) Delete Student By Rno---list ");
			System.out.println("4) Display All Student---list   ");
			System.out.println("5) Search Student By Name---list");
			System.out.println("6) Student Application Exit		");
			choice = sc.nextInt();
			
			switch(choice) 
			{
				case 1: System.out.println("Enter Student Rno : ");
						int rno = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Student Name : ");
						String name = sc.nextLine();
						System.out.println("Enter Student Std : ");
						int std = sc.nextInt();
	
						s = new Student(rno, name, std);
						
						list.add(s);
						System.out.println("Student record successfully Inserted");
						break;
						
				case 2:
						break;
	
				case 3:
						break;
						
				case 4:
						System.out.println("Rno\tName\tStd");
						for (int i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							System.out.println(s.getRno()+"\t" + s.getName()+"\t"+s.getStd());
						}
						break;
						
				case 5:
						break;
						
				case 6:
						break;
			}
		 }while(choice !=6);
	}
}
