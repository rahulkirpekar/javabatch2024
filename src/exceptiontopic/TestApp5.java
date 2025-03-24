package exceptiontopic;

public class TestApp5
{
	public static void main(String[] args) 
	{
		int no1,no2,ans=0;
		
		no1=10;
		no2=0;
		
		try 
		{
			ans =no1/no2;
			
		} catch (ArithmeticException e) 
		{
			System.out.println("Catch Block");
			e.printStackTrace();
		}finally 
		{
			System.out.println("Finally Close");
		}
		System.out.println("Ans : " + ans);
	}
}
