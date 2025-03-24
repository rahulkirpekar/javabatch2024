package stringtopic.immutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		String name1 = "royal";
//		System.out.println(name1+"----"+name1.hashCode());
//		name1 = name1.concat(" techno");// royal techno
//		System.out.println(name1+"----"+name1.hashCode());
		
//		String name1 = "royal";
//		String name2 = "royal";
//		String name3 = "techno";
//		String name4 = name1;

//		String name5 = name1 +" " + name3;// royal techno
		
//		System.out.println("name1==name2 : " + (name1==name2));// 1) true
//		System.out.println("name1==name3 : " + (name1==name3));// 2) false
//		System.out.println("name3==name4 : " + (name3==name4));// 3) false
		
//		System.out.println("name1.equals(name2) : " + name1.equals(name2));// true
//		System.out.println("name1.equals(name2) : " + name1.equals(name3));// false
//		System.out.println("name3.equals(name4) : " + name3.equals(name4));// false
		
		
		String name7 = "royal";
		String name8 = new String("royal");
		String name9 = "royal";
		
		System.out.println("name7==name8 : " + (name7==name8));// false
		System.out.println("name7.equals(name8) : " + name7.equals(name8));// true
		System.out.println("name7.equals(name9) : " + name7.equals(name9));// true
		System.out.println("name7==name9 : " + (name7==name9));// true
				
	}
}




