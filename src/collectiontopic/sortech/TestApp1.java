package collectiontopic.sortech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(5);
//		list.add(4);
//		list.add(3);
//		list.add(2);
//		list.add(1);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("rahul");
		list.add("yash");
		list.add("tithi");
		list.add("prachi");
		list.add("jalay");
		list.add("vishwek");
		list.add("vrutik");
		
		for (int i = 0; i < list.size(); i++) 
		{
			String value = list.get(i);
			System.out.println(value);
		}
		System.out.println("After Sorting : ");
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) 
		{
			String value = list.get(i);
			System.out.println(value);
		}
	}
}
