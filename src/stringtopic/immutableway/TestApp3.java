package stringtopic.immutableway;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		String name1 = "royal";
		String name2 = " ";
		String name3 = "";
		String name4 = null;

		System.out.println("name1.isBlank() : " + name1.isBlank());//false
		System.out.println("name2.isBlank() : " + name2.isBlank());//true
		System.out.println("name3.isBlank() : " + name3.isBlank());//true
		System.out.println("name4.isBlank() : " + name4.isBlank());// java.lang.NullPointerException:
		
//		System.out.println("name1.isEmpty() : " + name1.isEmpty());//false
//		System.out.println("name2.isEmpty() : " + name2.isEmpty());//false
//		System.out.println("name3.isEmpty() : " + name3.isEmpty());//true
//		System.out.println("name4.isEmpty() : " + name4.isEmpty());// java.lang.NullPointerException:
	}
}
