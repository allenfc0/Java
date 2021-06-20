package stringClasses;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerEx {
	public static void main(String[] args) {
		
		//StringJoiner myst = new StringJoiner("|"); // only delimiter
		StringJoiner myst = new StringJoiner(", " ,  "["  , "]"); // delimiter, prefix and sufix
		myst.add("we");
		myst.add("can");
		myst.add("join");
		myst.add("more");
		myst.add("one");
		myst.add("String");
		myst.add("with");
		myst.add("the");
		myst.add("specific");
		myst.add("Delimiter");
		
		System.out.println(myst);
		
		
		 List<String> mylist = Arrays.asList("London", "Paris", "NewYork", "Karachi", "Bombay");
		 String dataCSV = String.join("||", mylist);
		 System.out.println(dataCSV);
		 
	}
}
