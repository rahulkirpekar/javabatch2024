package iotopic.seri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp3 
{
	public static void main(String[] args)
	{
		Student s[] = new Student[3];
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		
		try 
		{
			FileOutputStream fout  = new FileOutputStream("listrecords.txt");
		
			ObjectOutputStream out = new ObjectOutputStream(fout);
		
			out.writeObject(s);
		
			System.out.println("Success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
