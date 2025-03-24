package exceptiontopic.li;

public class A 
{
	private int no = 100;
	
	void show() 
	{
		// Local Innerclass
		class B
		{
			void disp() 
			{
				System.out.println("NO : " + no);
			}
		}
		B obj = new B();
		obj.disp();
	}
	public static void main(String[] args) 
	{
		A obj = new A();
		
		obj.show();
	}
}
