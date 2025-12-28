package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


//Used to gather results like list, set, joining etc
public class StreamCollectors {

	public static void main(String[] args) {
		
	     List<String> names = Arrays.asList("Ram", "Shyam", "Mohan");
	     String value = names.stream().collect(Collectors.joining(", "));
	     System.out.println(value);
	     List<String> valueList = names.stream().collect(Collectors.toList());
	     valueList.forEach(System.out::println);
	     Set<String> valueSet = names.stream().collect(Collectors.toSet());
	     valueSet.forEach(System.out::println);
	}
}
