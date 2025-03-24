package exceptiontopic;

import java.io.FileNotFoundException;

class A{}
class B extends A{}
class C extends A{}
public class TestApp2 
{
	public static void main(String[] args) 
	{
		int ans = 10 / 0;// raise ArithmeticException exception 
		
		A obja = new B();
		C objc = (C)obja;// raise ClassCastException
		
//		String name = null;
//		// java.lang.NullPointerException
//		System.out.println("name.length() : " + name.length()); 
		
		//			   01234
//		String name = "royal";
//		// StringIndexoutofBoundException
//		System.out.println(name.charAt(5));

		
//		int a[] = new int[5];
//		// ArrayIndexoutofBoundException
//		a[5] =  100;
		

//		String value = "123";
//		int no = Integer.parseInt(value);
//		System.out.println("No : " + no);
		
//		FileNotFoundException
	}
}
