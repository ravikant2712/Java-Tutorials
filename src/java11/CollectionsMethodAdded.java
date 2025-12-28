package java11;

import java.util.Arrays;
import java.util.List;

public class CollectionsMethodAdded {

	public static void main(String[] args) {
		
	    List<String> iList = List.of("A", "B", "C");
	    System.out.println(Arrays.toString( iList.toArray(String[]::new)));
	    //Equivalent to String[] arr = iList.toArray(new String[0]);
	    
	}
}
