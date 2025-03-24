package stringtopic.immutableway;

public class TestApp4 
{
	public static void main(String[] args)  
	{
		String name1 = "royal";
		String name2 = "royal";
		String name3 = "Royal";
		String name4 = "royalll";
		
		
		System.out.println("name1.equals(name2) : " + name1.equals(name2));// true
		System.out.println("name1.equals(name3) : " + name1.equals(name3));// false
		System.out.println("name1.equalsIgnoreCase(name3) : " + name1.equalsIgnoreCase(name3));// true
		System.out.println("----------------------------------------------------------------------------");

		System.out.println("name1.compareTo(name2) : " + name1.compareTo(name2));// 0 / [+ , -]
		System.out.println("name1.compareTo(name3) : " + name1.compareTo(name3));// 
		System.out.println("name1.compareToIgnoreCase(name3) : " + name1.compareToIgnoreCase(name3));// 0
		System.out.println("name1.compareTo(name4) : " + name1.compareTo(name4));// 
	}
}
