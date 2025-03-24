package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add("rahul");// string---0 <===itr
		list.add(12);// integer---1
		list.add('r');//char---2
		list.add(12L);//long---3
		list.add(34.654f);//float---4
		list.add(564.324);//double---5
		
		Student s1= new Student(1, "rahul",12);
		
		list.add(s1);// object---6
		
		System.out.println("list.size() : "+list.size());

		// Traditional Way
		Iterator itr =	list.iterator();
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			if (obj instanceof Student) 
			{
				Student s= (Student)obj;
				s.disp();
				
			} else 
			{
				System.out.println(obj);
			}
		}
/*-----------------------------------------------------------------		
		// Advanced for..loop / Enhanced for..loop / for each loop
		for(Object obj : list) 
		{
			if (obj instanceof Student) 
			{
				Student s= (Student)obj;
				s.disp();
				
			} else 
			{
				System.out.println(obj);
			}
		}
		
//		for(int i = 0 ; i < list.size() ; i++)
//		{
//			System.out.println("list.get("+i+") : " + list.get(i));
		}		
*/		
	}
}