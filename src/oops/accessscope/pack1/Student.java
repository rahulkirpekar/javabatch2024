package oops.accessscope.pack1;

public class Student 
{
	// private---within class
	private int rno;
	
	// default--within package
	String name;
	
	// protected--within package + Outside package(IS-A relation)
	protected int std;
	
	public int marks;

	public static void main(String[] args) 
	{
		Student s  = new Student();
		s.rno=1;
		s.name="abc";
		
	}
}
