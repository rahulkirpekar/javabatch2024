package oops.polymophismtopic.runtime.task2;

public class School extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("School :: Student behave");
	}
	public void getAttendAnnualFunction() 
	{
		System.out.println("School :: Student :: getAttendAnnualFunction");
	}
}
