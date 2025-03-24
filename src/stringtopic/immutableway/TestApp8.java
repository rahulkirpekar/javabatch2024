package stringtopic.immutableway;

public class TestApp8 
{
	public static void main(String[] args) 
	{
		//				012345678901
		String value = "This is Java developed is James Golsing ";
		char a[] = new char[5];
		value.getChars(8, 12, a, 0);
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("a["+i+"] : " + a[i]);
		}
//		System.out.println("value.startsWith(\"This\") : " + value.startsWith("this"));
//		System.out.println("value.endsWith(\"Java\") : " + value.endsWith("Java"));
//		System.out.println("value.indexOf(\"is\") : " + value.indexOf("is"));
//		System.out.println("value.lastIndexOf(\"is\") : " + value.lastIndexOf("is"));
		
//		String words[] = value.split("\\s");
//		for (int i = 0; i < words.length; i++) 
//		{
//			System.out.println("words["+i+"] : "  +words[i]);
//		}
		
//		char val2[] =	value.toCharArray();
//		for (int i = 0; i < val2.length; i++) 
//		{
//			System.out.println("val2["+i+"] : " +val2[i]);
//		}
	}
}
