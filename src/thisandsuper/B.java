package thisandsuper;

// Child class
public class B extends A
{
	int no1,no2,ans;
	
	void test() 
	{
		super.no1 = 10;//C.E
		no1 = 20;
		no2 = 20;
		ans = no1+no2;
	}

}
