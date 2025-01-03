package oops.abstopic.interfacetopic.concept;

public class B implements A
{
	@Override
	public void test1() 
	{
		System.out.println("B--test1()");
	}

	public static void main(String[] args) 
	{
		B obj = new B();
		
		obj.test1();
		obj.test3() ;
		
		A.test4();
	}
}
