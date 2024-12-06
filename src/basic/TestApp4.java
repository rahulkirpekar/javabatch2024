package basic;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		// Array Declaration
//		int a1[] = new int[5];

//		int[] a2 = new int[5];
		
//		int []a3 = new int[5];
		
//		int [] a4 = new int[5];

//		int a5[] = null;
//		a5 = new int[5];

// Array Declaration with Initialisation

//		int a6[] = {10,20,30,40,50};
//		int a7[] = new int[] {10,20,30,40,50};

		Scanner sc = new Scanner(System.in);
		
		int a1[] = new int[5];

		for (int i = 0; i < a1.length; i++) 
		{
			// i--[0,1,2,3,4]
			System.out.println("Enter A["+ i +"] : ");
			a1[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a1.length; i++) 
		{
			System.out.println("A["+ i +"] : "+ a1[i]);
		}
	}
}
