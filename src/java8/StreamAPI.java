package java8;

import java.lang.foreign.ValueLayout;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//The features of Java streams are mentioned below:

//A Stream is not a data structure; it just takes input from Collections, Arrays or I/O channels.
//Streams do not modify the original data; they only produce results using their methods.
//Intermediate operations (like filter, map, etc.) are lazy and return another Stream, so you can chain them together.
//A terminal operation (like collect, forEach, count) ends the stream and gives the final result.

public class StreamAPI {

	public static void main(String [] args) {
		 List<Integer> list = Arrays.asList(1,2,9,5,9, 7,14, 13, 3,4,5,6);
		 
		 
		 System.out.println("=========================filter===========================");
		 //
		 //Intermediate Operations are the types of operations in which multiple methods are chained in a row like filters in this below example
		 list.stream().filter(x -> x % 2 == 0).forEach(v -> System.out.println(v));
		 
		 System.out.println("=========================filter chain===========================");
		 
		 //multiple methods are chained in a row like filters in this below example
		 list.stream().filter(x -> x % 2 == 0).filter(x -> x/6 == 1).forEach(v -> System.out.println(v));
		 
		 System.out.println("=========================map===========================");
		 
		 //Use Of map -   map() is used to transform each element of a stream into another form.
		 list.stream().map(x -> x * x).forEach(System.out::println);
		 
		 List<String> names = Arrays.asList("ram", "shyam");
		 names.stream().map(String::toUpperCase).forEach(System.out::println);
		
		 System.out.println("==========================sorted==========================");
			
		 // sorted() - sorted(): The sorted method is used to sort the stream.
		 list.stream().filter(x -> x % 2 == 0).sorted().forEach(v -> System.out.println(v));
	
		 System.out.println("=========================flatMap===========================");
		 
	//	 Transforms each element
	//	 AND flattens nested structure (List of List, Stream of Stream)
	//	 map() is used for simple transformation (1-to-1).
	//	 flatMap() is used when each element produces multiple values (1-to-many) and you want to flatten the result.
	//	 Use flatMap() when working with nested structures like List<List<T>> or when splitting, extracting, or expanding data.
		 
		 List<List<String>> flist = Arrays.asList(
				    Arrays.asList("A", "B"),
				    Arrays.asList("C", "D")
				);
		 
		 flist.stream().flatMap(inner -> inner.stream()).forEach(System.out::println);
		 
		 System.out.println("===========================distinct=========================");
		 
		 // distinct(): Removes duplicate elements. It returns a stream consisting of the distinct elements
		 list.stream().distinct().sorted().forEach(System.out::println);
		 
		 System.out.println("===========================peek=========================");
		 
		 //peek() is an intermediate operation used to see (peek) the elements as they flow through the pipeline.
		
		 //Think of it like:
		 //“Just show me what is happening, but don’t change anything.”
		 //It is mainly used for:
		 //Debugging
		 //Logging
		 //Watching intermediate values
		 list.stream()
		    .filter(n -> n % 2 == 0)
		    .peek(n -> System.out.println("After filter: " + n))
		    .map(n -> n * n)
		    .peek(n -> System.out.println("After map: " + n))
		    .forEach(System.out::println);
		 
		 
		 System.out.println("===========================collect=========================");
		 
		//Terminal Operations
		// collect(): The collect method is used to return the result of the intermediate operations performed on the stream.
		// The collect() method in Java Stream API is a terminal operation used to convert a stream into a:
		//	 List,Set,Map,String,Custom object Or perform aggregation (joining, grouping, partitioning)
		 List<String> listList = list.stream().map(v -> v.toString()).collect(Collectors.toList());
		 System.out.println(listList.size());
		 
		 Set<Integer> set = list.stream().collect(Collectors.toSet());
		 System.out.println(set.size());
	
		 
		 System.out.println("=========================foreach===========================");
		// forEach(): The forEach method is used to iterate through every element of the stream.
		 
		 System.out.println("=========================reduce===========================");
		 
		 // reduce() = Reduce multiple elements → one output
		 //The reduce() method in Java Stream API is a terminal operation used to combine all elements of a stream into a single result (one value).
		 int sum = list.stream().reduce(0, Integer::sum);
		 System.out.println(sum);
			
		 System.out.println("========================count============================");
		// count(): Returns the count of elements in the stream.
		 long count = list.stream().count();
		 System.out.println(count);
		 System.out.println("=======================findFirst========================");
		 //findFirst(): Returns the first element of the stream, if present.
		 
	     Optional<Integer> firstelement = list.stream().findFirst();
	     firstelement.ifPresent(System.out::println);
	     
		 System.out.println("==========================allMatch==========================");
		 //allMatch(): Checks if all elements of the stream match a given predicate  (all the elements should match with provided value)
		  
		 boolean b = list.stream().allMatch(Value -> Value.equals(45));
		 System.out.println(b);
		 
		 System.out.println("========================anyMatch===========================");
		 
		 //anyMatch(): Checks if any element of the stream matches a given predicate. (return true if found any match with provided value)

		 boolean any = list.stream().anyMatch(Value -> Value.equals(13));
		 System.out.println(any);

		 
	}
	
	
}
