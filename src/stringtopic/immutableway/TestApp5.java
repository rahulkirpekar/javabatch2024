package stringtopic.immutableway;

public class TestApp5 
{
	public static void main(String[] args) 
	{
//		String name1 = "royal";
//		String name2 = "technosoft";
		
//		String name3 = name1.concat(name2);
//		System.out.println("Name3 : " +  name3); 

		//			   01234567890123456789012345678901 	
		String name = "Royal is Technosoft is private Limited";
		
//		String value = name.substring(6);// Technosoft private Limited
//		String value = name.substring(6 , 16);// Technosoft
//		System.out.println("Value : "+value);
		

//		String value = name.replace("is", "was");
//		System.out.println("Value : "+value);
		String value = name.replaceFirst("is", "was");
		System.out.println("Value : "+value);
		
	}
}
