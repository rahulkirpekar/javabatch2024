package oops.thisandsuper;

public class Student extends Person
{
	// Data---Dm's---private
	
	// 1) Data Members / Instance Variables
	private int rno;
	private String name;// original-name
	private int std;

	public Student() 
	{
	}
	Student(int rno,String name,String nickName , int std)
	{
		this.rno = rno;
		this.name = name;
		super.name = nickName;
		this.std = std;
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + " " + super.name +" "+std);
	}
	public static void main(String[] args) 
	{
		Student s = new Student(1, "Pranav","rahul" ,12);
		
		s.dispData();
	}
}