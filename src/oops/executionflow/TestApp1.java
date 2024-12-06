package oops.executionflow;

// Class Execution Flow
public class TestApp1 
{
	int no;
	
	static String schoolName;
	
	// 1) Static Block
	static
	{
		System.out.println("1)--------Static Block---------");
		schoolName = "DPS";
	}

	// Instance Block
	{
		System.out.println("4)--------Instance Block---------"+this);
		no=100;
	}

	// Default Constructor
	public TestApp1() 
	{
		System.out.println("5)--------Default Constructor---------"+this);
	}
	// Para Constructor
	public TestApp1(int no) 
	{
		System.out.println("5)--------Parameterised Constructor---------"+this);
	}
	// Static test2()--method
	public static void test1() 
	{
		System.out.println("3)--------Static test1()--method---------");
	}
	// Non-Static test2()--method
	public void test2() 
	{
		System.out.println("6)--------Non-Static test2()--method---------"+this);
		System.out.println("No : " + no);
	}
	// 2) main method
	public static void main(String[] args) 
	{
		System.out.println("2)------START :: main Method------");
		TestApp1.test1();
		TestApp1 obj1 = new TestApp1();
		TestApp1 obj2 = new TestApp1();
		obj1.test2();
		obj2.test2();
		System.out.println("7)------EXIT :: main Method------");
	}
}
