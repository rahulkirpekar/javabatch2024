package iotopic.seri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\javabatch2024\\records.txt");

			ObjectInputStream oin = new  ObjectInputStream(fin);
			
			Student s = (Student)oin.readObject();

			System.out.println(s.getRno()+ " " + s.getName()+" " + s.getStd());
		
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
