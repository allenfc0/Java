package setInterface;

import java.util.EnumMap;
import java.util.Map.Entry;

public class EnumMapEx {
	public static void main(String[] args) {
		
		EnumMap<Days, String> emap = new EnumMap<Days, String>(Days.class);
		emap.put(Days.SUNDAY, "Ist day of the week");
		emap.put(Days.MONDAY, "2nd day of the week");
		emap.put(Days.TUESDAY, "3rd day of the week");
		emap.put(Days.WEDNESDAY, "4th day of the week");
		emap.put(Days.THURSDAY, "5thday of the week");
		emap.put(Days.FRIDAY, "6th day of the week");
		emap.put(Days.SATURDAY, "7th day of the week");
		
		for(Entry<Days, String> data: emap.entrySet())
		{
			System.out.println(data.getKey() + "--> "+ data.getValue());
		}
		
		for(String s: emap.values())
		{
			System.out.println(s);
		}
			
		for(Days mykey: emap.keySet())
		{
			System.out.println(mykey);
		}
			
	}
}
