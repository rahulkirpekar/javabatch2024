package basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Console---System.in
//		java.util.Scanner sc = new java.util.Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		int no1,no2,ans;
		
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
		
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();
		
		ans = no1+no2;
		
		System.out.println("Addition : " + ans);
	}
}
