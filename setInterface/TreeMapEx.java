package setInterface;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		//TreeMap<Integer, Integer> tmap1 = new TreeMap<Integer, Integer> ();
		//TreeMap<Double, String> tmap2 = new TreeMap<Double, String>();
		
		tmap.put(9, null);
		tmap.put(6, "NYC");
		tmap.put(7, "PHX");
		tmap.put(3, "NC");
		tmap.put(4, "TX");
		tmap.put(5, "Alabama");
		tmap.put(1, "Cal");
		tmap.put(2, "San");
		tmap.put(8, null);
		
		
		
		tmap.remove(5);
		for(Entry<Integer, String> m: tmap.entrySet())
		{
			System.out.println(m.getKey() +" "+ m.getValue() );
		}
		
		System.out.println("Desc Order:" + tmap.descendingMap());
		
	//headMap() return key-value pairs whose keys are less than or equal to the specified key
		
		System.out.println(tmap.headMap(7));
		
		System.out.println(tmap.tailMap(7, true));
		
	}
}
