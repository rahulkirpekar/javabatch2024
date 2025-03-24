package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> listOfNames = new ArrayList<String>();
		
		listOfNames.add("sagar");
		listOfNames.add("kunal");
		listOfNames.add("Rakesh");
		listOfNames.add("Brijesh");
		listOfNames.add("Vishnu");
		listOfNames.add("Sujal");
		listOfNames.add("Ankur");
		
		// Iterator--forward + Backward Direction Iterate
		ListIterator<String> litr =	listOfNames.listIterator();
		
		while(litr.hasNext()) 
		{
			String name = litr.next();
			System.out.println(name);
		}
		System.out.println("-----------------------------");
		
		while(litr.hasPrevious()) 
		{
			String name = litr.previous();
			System.out.println(name);
		}
/*		// Iterator--forward Direction Iterate
		Iterator<String> itr = listOfNames.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
*/		
	}
}