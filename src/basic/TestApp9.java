package basic;

import java.util.Iterator;
import java.util.Scanner;

public class TestApp9 
{
	public static void main(String[] args) 
	{
		// 3 student -- 2 sem --- 5 subjects
		int a[][][] = new int[3][2][5];

		System.out.println("a.length : " + a.length);
		System.out.println("a[0].length : " + a[0].length);
		System.out.println("a[0][0].length : " + a[0][0].length);
		
		Scanner sc = new  Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				for (int k = 0; k < a[i][j].length; k++) 
				{
					System.out.println("Enter A["+i+"]["+j+"]["+k+"] : ");	
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				for (int k = 0; k < a[i][j].length; k++) 
				{
					System.out.println("A["+i+"]["+j+"]["+k+"] : "+a[i][j][k]);	
				}
			}
		}
	}
}
