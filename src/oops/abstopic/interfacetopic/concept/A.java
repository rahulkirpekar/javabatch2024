package oops.abstopic.interfacetopic.concept;

public interface A 
{
	// 1) Dm's
	int no = 100;// [public static final] 
	
	// 2) define methods
	//--------------------
		// 1) Abstract method---[public abstract] 
		void test1();// 
		
		// 2) Non-abstract method
		
		// 1) private method(java-9)
		private void test2() 
		{
			System.out.println("A--private test2()");
		}
		// 2) default method(java-8)
		default void test3() 
		{
			test2();
			System.out.println("A--default test3()");
		}
		// 3) static method(java-8)
		static void test4() 
		{
			System.out.println("A--static test4()");
		}
}
