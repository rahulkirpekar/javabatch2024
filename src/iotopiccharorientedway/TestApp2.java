package iotopiccharorientedway;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args)  
	{
		try 
		{
			FileReader fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\javabatch2024\\royal1.txt");
			
			int temp ; 
			
			while(	(temp = fr.read()) != -1	) 
			{
				char value = (char)temp;
				
				System.out.print(value);
			}
			
			fr.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
