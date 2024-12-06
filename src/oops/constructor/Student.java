package oops.constructor;

public class Student 
{
	int rno,std;
	String name;
	// Default Constructor
	public Student() 
	{
		System.out.println("Before Default Constructor-----" + rno+" " + name +" " + std+"----"+this);
		rno=1;
		name="rahul";
		std=12;
		System.out.println("After Default Constructor-----" + rno+" " + name +" " + std);
	}
	// Parametersied Constructor 
	public Student(int rno,String name , int std)//<---local variables 
	{
		//<==dm's
		System.out.println("Before Para Constructor : " + rno+" " + name+" " + std+"----"+this);
		this.rno = rno;
		this.name = name;
		this.std = std;
		System.out.println("After Para Constructor : " + rno+" " + name+" " + std+"----"+this);
	}
	
	// Copy Constructor
	public Student(Student s) 
	{
		System.out.println("=====Before Copy Constructor=====" );
		rno = s.rno;
		name = s.name;
		std = s.std;
		System.out.println("=====After Copy Constructor=====" );
	}
	public static void main(String[] args) 
	{
		// JVM-----Default Constructor---Default Values
		Student s1 = new Student(1,"Ankur",12);
		Student s2 = new Student(2,"Sagar",10);
		
		System.out.println("Main Method --- "+s1.rno+" " + s1.name+" " + s1.std+"---"+s1);
		System.out.println("Main Method --- "+s2.rno+" " + s2.name+" " + s2.std+"---"+s2);
		
		// copy constructor
		
		Student s3 = new Student(s2);
		
		System.out.println("Main Method --- "+s3.rno+" " + s3.name+" " + s3.std+"---"+s3);
	}	
}