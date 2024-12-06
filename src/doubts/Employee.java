package doubts;

import java.util.Scanner;

public class Employee extends Person
{
	int id,salary;
	String name,dsgn;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		name = sc.nextLine();
		System.out.println("Enter Home Name : ");
		super.name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Dsgn : ");
		dsgn= sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn);
	}
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.scanData();
		e.dispData();
	}
}
