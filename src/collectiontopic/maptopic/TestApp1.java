package collectiontopic.maptopic;

import java.util.Map;
import java.util.TreeMap;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		HashMap<Integer, String> mapObj = new HashMap<>();
//		LinkedHashMap<Integer, String> mapObj = new LinkedHashMap<>();
		TreeMap<Integer, String> mapObj = new TreeMap<>();
		
		
		mapObj.put(14, "rahul");// Key,Value---Entry
		mapObj.put(21, "ankur");
		mapObj.put(13, "sagar");
		mapObj.put(47, "brijesh");
		mapObj.put(50, "pavan");
		
		
		for(Map.Entry<Integer, String> e :	mapObj.entrySet()) 
		{
			System.out.println(e.getKey()+" " + e.getValue());
		}
	}
}
