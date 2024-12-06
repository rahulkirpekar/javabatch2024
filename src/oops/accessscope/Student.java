package oops.accessscope;

public class Student 
{
	// Dm's
	 int rno;
	 String name;
	 int std;

	// Mf's
	 void test1() 
	{
		
	}
	

	// Constructor(default,private,public)
	 Student() 
	{
		
	}

	public static void main(String[] args) 
	{
		// local variable----X---Access scope
		int no1;
		
		Student s =new Student();
	}
}
