package doubts;

import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter Age for Vote : ");
		int age = sc.nextInt();
		try 
		{
			isValidForVote(age);// jvm stop
		} catch (InvalidAgeException e) 
		{
			System.out.println("Catch Block--Exception Handled");
			e.printStackTrace();
		}
		System.out.println("=======Exit Main=======");
	}
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise exception cause age below 18
			throw new InvalidAgeException("Invalid for Age,\n\tPlease enter age greater than 18.");
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
}