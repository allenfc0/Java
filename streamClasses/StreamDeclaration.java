package streamClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDeclaration {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// empty stream object will be declare
		//Stream<String> stmOne =  Stream.empty();
		//Stream<Integer> stmTwo =  Stream.empty();
		 
		// create stream along with initial values
		 
		 //Stream<Integer> stmthree =  Stream.of(1,2,3,6,5,8,8,5);
		 //Stream<String> stmfour =  Stream.of("A", "B", "c");
		 Stream<Object> stmFive = Stream.of(1,"a",3,23.3);
		 stmFive.forEach( (b) -> {System.out.println(b); } );
		
		 // Arraysof Stream
		 String[] stAarray = {"A", "B", "C", "D"};
		 Stream<String> arrayofStream =  Arrays.stream(stAarray);
		 arrayofStream.forEach( (a)-> { System.out.println(a);} );
		
		
	    List<String> mylist = new ArrayList<String>();
	    mylist.add("Haseeb");
	    mylist.add("Perscholas");
	   
	   
	    Stream<String> listOfStream = mylist.stream();
	    //listOfStream.forEach( (p)-> {System.out.println(p);} );
	    System.out.println("==================Examaple of method reference ===============");
	    listOfStream.forEach( System.out::println);
	   
	   
	   
	    ArrayList<String> listobj = new ArrayList<String>();
	    listobj.add("One flew over the cuckoo's nest");
	    listobj.add("One To kill a muckingbird");
	    listobj.add("two One Gone with the wind");
	   
	    //Stream<String> mystreamList =  listobj.stream();
	    Boolean allmatchRessult =   listobj.stream()
	    		.allMatch( (value)-> { return value.startsWith("One"); } );
	    System.out.println(allmatchRessult);
	   
	   
	   
	    System.out.println("==============collect() Result=================");
	   
	  List<String> convertStreamToList =  listobj.stream().collect(Collectors.toList());
	  convertStreamToList.forEach( s -> System.out.println(s));
	   
	   
	  Character[] ch = { 'P', 'e', 'r', 'S', 'c','h', 'o', 'l','a', 's' };
	   
	 //Stream<Character> StreamOfcharacter =  Arrays.stream(ch);
	
	  Stream<Character>	StreamOfcharacter = Stream.of(ch);
	  String aa = StreamOfcharacter
			  .map( (a)-> { return a.toString();})
			  .collect(Collectors.joining(", ", "%%%\t", "\t%%%"));
	 
	  System.out.println(aa);
	 
	 
	 
	List<String>  countryList =   Arrays.asList("usa","japan","germany","canada");
	 Stream<String> countryStream =  countryList.stream();
	String abc = countryStream.map( x -> x.toUpperCase()).collect(Collectors.joining(", ") );
	System.out.println(abc);
	
	//countryStream.forEach( (a)-> { System.out.println(a);} );
	
	
	
	System.out.println("==============skip() Result=================");
	
	Integer arr[] = {10, 1, 3, 5, 11, 7, 9, 2, 4, 6, 8};
	Arrays.stream(arr).skip(2).sorted().skip(2).forEach(n -> System.out.println(n));
	
	
	
	System.out.println("==============reduce() Result=================");
	
	Double arr1[] = {5.0, 2.0, 5.0};
	double total = Stream.of(arr1).reduce(3.0, (Double a, Double b) -> a * b);
	
	System.out.println("Total = " + total);
	
	}
	
	
}






















