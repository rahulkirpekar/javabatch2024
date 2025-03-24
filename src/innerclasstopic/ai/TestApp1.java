package innerclasstopic.ai;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		A obj = new A() 
		{
			// Anonymous Innerclass
			@Override
			public void test1() 
			{
				System.out.println("TestApp1--test1()");
			}
		};
		
		obj.test1();
	}
}
