package iotopic.byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();// abc
		
		//name---write---byte(data)-----file
		
		byte b[] = name.getBytes();// b[0]--65 , b[1]--66 , b[2]--67
		
		try 
		{
			FileOutputStream fout = new FileOutputStream("test1.txt");

			fout.write(b);
			
			System.out.println("Success");
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}