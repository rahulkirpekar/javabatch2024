package iotopic.seri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\javabatch2024\\listrecords.txt");

			ObjectInputStream oin = new ObjectInputStream(fin);
		
			Student s[] = (Student[])oin.readObject();
		
			for (int i = 0; i < s.length; i++) 
			{
				System.out.println(s[i].getRno()+" " + s[i].getName()+" " + s[i].getStd());
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
