package exceptiontopic;

public class TestApp6 
{
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise exception---user defined Scenario
			throw new InvalidAgeException("\n\"Invalid Age,\n\tPlease enter grater than 18 age\"");
			
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		try 
		{
			isValidForVote(10);
			
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
		System.out.println("General Statements");
	}
}
