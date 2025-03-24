package exceptiontopic;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter NO1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter NO2 : ");
		int no2 = sc.nextInt();
		
		int ans = 0;
		
		// Nested try...catch block
		try 
		{
			
				try 
				{
					ans = no1 /  no2;
				} catch (ArithmeticException e) 
				{
					e.printStackTrace();
				}
				
				try 
				{
					String name = null;
					System.out.println("name.length() : " + name.length());// NullPointerException
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				try 
				{
					int a[] = new int[5];
					a[5] = 100;
					
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			
		}catch(Exception e) 
		{
			System.out.println("Exception Handled By Catch Block");
		}
		System.out.println("Addition : " + ans);	
		
	}

}
