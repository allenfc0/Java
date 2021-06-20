package streamClasses;

import java.util.ArrayList;

public class AllMatchEx {
	public static void main(String[] args) {
		ArrayList<String> listobj = new ArrayList<String>();
	    listobj.add("One flew over the cuckoo's nest");
	    listobj.add("one To kill a muckingbird");
	    listobj.add("One One Gone with the wind");
	   
	    //Stream<String> mystreamList =  listobj.stream();
	    Boolean allmatchRessult =   listobj.stream()
	    		.anyMatch( (value)-> { return value.startsWith("o"); } );
	    System.out.println(allmatchRessult);
	}
}
