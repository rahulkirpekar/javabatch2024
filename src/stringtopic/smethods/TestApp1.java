package stringtopic.smethods;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name=  sc.nextLine();// madam
								//	   i   j
		boolean flag = true;
		for (int i = 0 , j = (name.length()-1); i < name.length(); i++,j--) 
		{
			if (name.charAt(i)!=name.charAt(j)) 
			{
				flag = false;
				break;
			}
		}
		if (flag) 
		{
			System.out.println(name+" is Palindrome");
		} else 
		{
			System.out.println(name+" is not Palindrome");
		}
		//			   012345678901234567890123456789012345678901234567 
//		String name = "This is Java which is Developed By James Gosling";
		
//		for (int i = 0; i < name.length(); i++) 
//		{
//			System.out.println("name.charAt("+i+") : " + name.charAt(i));
//		}
	}
}
