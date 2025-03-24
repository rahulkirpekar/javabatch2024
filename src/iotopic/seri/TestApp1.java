package iotopic.seri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args)  
	{
		// s1---write---file
		Student s1 = new Student(1, "rahul", 12);
		try 
		{
			FileOutputStream fout = new FileOutputStream("records.txt");

			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s1);
			
			out.close();
			fout.close();
		
			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}