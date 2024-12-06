package basic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Name : ");
//		String name = sc.next();// Single word
		String name = sc.nextLine();// SingleLine---Mulltiple words
		

		System.out.println("Name : " + name);
	}
}
