package basic;

import java.util.Scanner;

public class TestApp8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[3][6];
		
		
		/*
		 *  a[0][0]
		 *  a[0][1] 
		 *  a[0][2]
		 *  a[0][3]
		 *  a[0][4] 
		 *  a[0][5] = a[0][0] + a[0][1]  a[0][2] + a[0][3] + a[0][4]
		 *  
		 *  
		 */
		
//		System.out.println("a.length : " + a.length);
//		System.out.println("a[0].length : " + a[0].length);
		
		
		int sum = 0 ;
		

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < (5); j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : " );
				a[i][j] = sc.nextInt();
				
				sum = sum + a[i][j];
			}
			a[i][5] = sum;
			sum = 0;
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] : " + a[i][j]);
			}
		}
		
//		int [][]a = new int[3][5];
//		int[][] a = new int[3][5];
//		int []a[] = new int[3][5];


//		int a[][] = null;
//		a = new int[3][5];
	}
}