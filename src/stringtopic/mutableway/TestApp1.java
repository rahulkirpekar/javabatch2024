package stringtopic.mutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// 1) String----Immutableway operation
		
//		String name1 = "rahul";
//		System.out.println("Name1 : " + name1+" --- " + name1.hashCode());
//		name1= name1.concat(" kirpekar");
//		System.out.println("Name1 : " + name1+" --- " + name1.hashCode());
		
		// 2) StringBuilder / StringBuffer----Mutableway operation		
		
//		StringBuilder sb = new StringBuilder("rahul");
		StringBuffer sb = new StringBuffer("rahul");
		
		System.out.println(sb+"----"+sb.hashCode());
		
		sb.append(" kirpekar");
		
		System.out.println(sb+"----"+sb.hashCode());
	}
}
