package oops.polymophismtopic.runtime.task2;

public class PublicPlace extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("PublicPlace :: Citizen behave");
	}
	public void getParticipaneInElection() 
	{
		System.out.println("PublicPlace :: Citizen :: getParticipaneInElection");
	}

}
