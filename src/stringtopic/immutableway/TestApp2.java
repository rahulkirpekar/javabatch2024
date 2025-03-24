package stringtopic.immutableway;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		String name1 = "Royal";
		String name2 = "Techno";

		System.out.println("Name1 : " + name1+"------"+name1.hashCode());// RoyalTechno
		System.out.println("Name2 : " + name2+"------"+name2.hashCode());// Techno
 
// 		******************************
//		Immutable Behavior of String:
// 		******************************			
//			In Java, the String class is immutable, meaning once a String object is created, 
//		its content cannot be changed. Any modification to a String actually creates a new String object.
		name1 = name1.concat(name2);// RoyalTechno
		
		System.out.println("Name1 : " + name1+"------"+name1.hashCode());// RoyalTechno
		System.out.println("Name2 : " + name2+"------"+name2.hashCode());// Techno
		
		// Mutable Behaviour
/*
 * ******************************************************
 * Mutable Behavior of StringBuilder and StringBuffer:
 * ******************************************************
	Unlike String, StringBuilder and StringBuffer are mutable, meaning 
	their content can be modified without creating a new object. 
	These classes allow you to manipulate strings more efficiently, 
	especially when performing multiple modifications.
 * 
 * */		
		
		
		
		
		
//		StringBuilder sb   = new StringBuilder("Royal");// NOt ThreadBased Application
		StringBuffer sb   = new StringBuffer("Royal");// MultiThreadding concept implement--ThreadsafeStringBuffer
		
		System.out.println(sb+"---"+sb.hashCode());
		sb.append(" techno");
		System.out.println(sb+"---"+sb.hashCode());
	}
}
