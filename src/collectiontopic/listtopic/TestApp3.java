package collectiontopic.listtopic;

import java.util.Iterator;
import java.util.Vector;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Vector<String> list = new Vector<String>();
		
		list.add("rahul");
		list.add("ankur");
		list.add("rakesh");
		list.add("sagar");
		list.add("kunal");
		list.add("brijesh");
		list.add("aman");
		list.add("ramesh");
		
		
		Iterator<String> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}
