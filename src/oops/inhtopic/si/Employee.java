package oops.inhtopic.si;

import java.util.Scanner;

// Child / Derived / Sub
public class Employee extends Person
{
	int id;
	int salary;
	String dsgn;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();

		System.out.println("Enter Employee id : ");
		e.id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		e.name = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		e.salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Dsgn : ");
		e.dsgn = sc.nextLine();
		
		System.out.println(e.id+" " + e.name+" " + e.salary+" " + e.dsgn);
	}
}
