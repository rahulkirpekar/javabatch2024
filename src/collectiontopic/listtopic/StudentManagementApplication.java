package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int i = 0;
		ArrayList<Student> list = new ArrayList<Student>();
		Student s = null;		
		int choice = 0;
		
		do 
		{
			System.out.println("Enter below choice : ");
			System.out.println("1) Insert Student---list        ");
			System.out.println("2) Update Student By Rno---list ");
			System.out.println("3) Delete Student By Name---list ");
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
						System.out.println("Enter Student Rno Which you want to Update : ");
						rno = sc.nextInt();
						sc.nextLine();
						
						flag = false;
						for (i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							
							if (s.getRno()==rno) 
							{
								flag = true;
								break;
							}
						}
						if (flag) 
						{
							
							System.out.println("Enter Name : ");
							String nameU = sc.nextLine();
							System.out.println("Enter Std : ");
							std = sc.nextInt();
							
							s.setName(nameU);
							s.setStd(std);
							
							list.set(i, s);
							System.out.println(nameU+" student record is successfullt updated from Student records.");
							
						} else 
						{
							System.out.println("Student record is not found in student records.");
						}
						break;
				case 3: 
						sc.nextLine();
						System.out.println("Enter Student Name Which you want to remove from record");
						name = sc.nextLine();
						System.out.println("Delete Name : " + name);
						flag = false;
						for (i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							
							if (s.getName().equalsIgnoreCase(name)) 
							{
								flag = true;
								break;
							}
						}
						if (flag) 
						{
							list.remove(i);
							System.out.println(name+" is successfullt removed from Student records.");
							
						} else 
						{
							System.out.println(name+ " is not found in student records.");
						}
						break;
						
				case 4:
						System.out.println("Rno\tName\tStd");
						for (i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							System.out.println(s.getRno()+"\t" + s.getName()+"\t"+s.getStd());
						}
						break;
						
				case 5:	sc.nextLine();
						System.out.println("Enter Student Name which you want to Search :  ");
						String nameS = sc.nextLine();
						
						flag = false;
						for (i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							
							if (s.getName().equalsIgnoreCase(nameS)) 
							{
								flag = true;
								break;
							}
						}
						if (flag) 
						{
							System.out.println(nameS+ " is found in student records.");
							s.disp();
						}else 
						{
							System.out.println(nameS+ " is not found in student records.");
						}
						break;
				case 6:
						System.out.println("Student Application will be shutdown");
						try 
						{
							Thread.sleep(1000);
						} catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
						break;
			}
		 }while(choice !=6);
	}
}
