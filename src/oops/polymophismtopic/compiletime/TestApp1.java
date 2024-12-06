package oops.polymophismtopic.compiletime;

// Compiletime Polymorphism --- Method Overloadding
public class TestApp1 
{
	static int test(int no1,int no2)
	{
		int ans;
		ans = no1+no2;
		return ans;
	}
	static double test(double no1,double no2)
	{
		double ans;
		ans = no1+no2;
		return ans;
	}
	public void addFun() 
	{
		System.out.println("addFun()");
	}
	// char to ASCII
	public void addFun(short no1,short no2) 
	{
		System.out.println("NO1 : " + no1);
		System.out.println("NO2 : " + no2);
		double ans = no1+no2;
		System.out.println("int Tw args : addFun(int no1,int no2) : " + ans);
	}
	public void addFun(byte no1,byte no2) 
	{
		System.out.println("short Tw args : addFun(float no1,float no2)");
	}
	
	public void addFun(long no1,double no2) 
	{
		System.out.println("short Tw args : addFun(float no1,float no2)");
	}
	public void addFun(int no1,int no2,int no3) 
	{
		System.out.println("addFun(int no1,int no2,int no3)");
	}
	public void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("addFun(int no1,int no2,int no3,int no4)");
	}
	public static void main(String[] args) 
	{
		
		TestApp1 obj = new TestApp1();
		
		obj.addFun('a','b');
		
		
//		obj.addFun('a','b');// char value----- [double,float]---float
	}
}
/*
  Execution Sequence:-
  -------------------
		   
  	1) Argument count
  	---------------------
  		  |
	---------------------
  	2) Argument type---Excat arg Type Match
  	---------------------
  		  |
	---------------------  
  	3) Type Pramotion Rule
  
  
Type Pramotion Rule
----------------------
boolean---X
			byte
		 	 |
		   short
		     |
char------->int
		     |
		   long
		     |
		   float
		     |
		   double
		   
		   
		   
----------------------------------------------------------		   
Rules of Method Overloadding(CompileTime Polymorphism):-
----------------------------------------------------------		   
		   ===> Overloadded method must belong to the same class.
		   ===> Same Method Name(All Overloadded methods must have the same method name.)
		   ===> Different Number of Parameters
		   ===> if Parameters are same then Different Types of Parameters in overloadded methods.
		   ===> Different Order of Parameters(CompileTime Error-->Ambiguity Error--->Duplication)
		   ===> ReturnType Does not Matter
		   		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
   
   
 */

