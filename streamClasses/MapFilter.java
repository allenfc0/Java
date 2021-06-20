package streamClasses;

import java.util.ArrayList;

public class MapFilter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("haseeb");
		stringList.add("perscholas");
		stringList.add("teksystem");	
		stringList.add("teksystem");
		stringList.add("haseeb");
		
		stringList.stream()
		.map( (value) -> {
			System.out.println("map:" + value); return value.toUpperCase(); 
		}
		).filter(value -> { 
			System.out.println("filter:" + value); 
			return value.startsWith("H");
			}
		).forEach(value->{
			System.out.println(value);
		}
		);
}
}
