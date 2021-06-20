package setInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//HashMap<String, String> map2 = new HashMap<String, String>();
		//HashMap<Integer, Double> map3 = new HashMap<Integer, Double>();
		
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "banana");
		map.put(101, "Orange");
		map.put(5, "Pineapple");
		map.put(6, "Grapes");
		map.put(null, null);
		map.put(7, null);
		map.put(1, "Watermellon");
		
		System.out.println("size of map is: " + map.size());
		for(String s: map.values())
		{
			System.out.println(s);
		}
			
		for(Integer mykey: map.keySet())
		{
			System.out.println(mykey);
		}
			
		
		
		for(Entry<Integer, String> data : map.entrySet() )
		{
			System.out.println(data.getKey() + " " +  data.getValue());
		}
		
		System.out.println("=================forEach=====================");
		
		map.forEach((a,b) -> { System.out.println(a + " " + b); } );
		
		System.out.println("============Using Iterator=============================");
		
		Iterator<Map.Entry<Integer, String>> itr  =  map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> data = itr.next();
			System.out.println(data.getKey() + " "+ data.getValue());
		}
		
		System.out.println("============Convert map into set=============================");
		Set<Entry<Integer, String>> myset = map.entrySet();
		Iterator<Entry<Integer, String>> myitr = myset.iterator();
		
		while(myitr.hasNext())
		{
		//converted to map.Entry so that we can get key and value separately
			Entry<Integer, String> entry =  myitr.next();
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}

	}

}
