package collectiontopic.queuetopic;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("rahul");
		queue.add("ankur");
		queue.add("rakesh");
		queue.add("brijesh");
		queue.add("pavan");
		
		
		while(!queue.isEmpty()) 
		{
			String name = queue.poll();
			System.out.println(name);
		}
		
		
//		Iterator<String> itr = 	queue.iterator();
//		while (itr.hasNext()) 
//		{
//			String name = (String) itr.next();
//			System.out.println(name);
//		}
	}
}
