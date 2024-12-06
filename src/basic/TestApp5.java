package basic;

import java.util.Scanner;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];

		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = sc.nextInt();
		} 
		for (int i = 0; i < a.length; i++) 
		{
			int no = a[i];
			boolean fc = true ;
			for (int j = 2; j < no; j++) 
			{
				if (no % j == 0) 
				{
					fc = false;
					break;
				} 
			}
			if (fc) 
			{
				System.out.println("A["+i+"] : " + a[i]);
			}
		} 
	}
}