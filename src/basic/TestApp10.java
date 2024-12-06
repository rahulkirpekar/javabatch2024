package basic;

import java.util.Scanner;
public class TestApp10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[4][];
		
		a[0] = new int[3];
		a[1] = new int[4];
		a[2] = new int[5];
		a[3] = new int[2];
		
		System.out.println("a.length : " + a.length);
		System.out.println("a[0].length : " + a[0].length);
		System.out.println("a[1].length : " + a[1].length);
		System.out.println("a[2].length : " + a[2].length);
		System.out.println("a[3].length : " + a[3].length);
	
		for (int i = 0; i < a.length; i++) 
		{
			// i-0--a[0].length---3
			// i-1--a[1].length---4
			// i-2--a[2].length---5
			// i-3--a[3].length---2
			
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] : " + a[i][j]);
			}
		}
	}
}












