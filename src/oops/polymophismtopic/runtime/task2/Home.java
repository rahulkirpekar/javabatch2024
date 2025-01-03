package oops.polymophismtopic.runtime.task2;

public class Home extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("Home :: Child behave");
	}
	public void getMovieTime() 
	{
		System.out.println("Home :: Child :: getMovieTime()");
	}
}
