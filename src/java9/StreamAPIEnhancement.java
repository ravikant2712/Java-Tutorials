package java9;

import java.util.List;
import java.util.stream.Stream;


// Added new methods: takeWhile(), dropWhile(), ofNullable()
public class StreamAPIEnhancement {
	
	public static void main(String[] args) {

		List<Integer> list = List.of(1,5,7,3,7,9);
		// It takes all element after condition met
        list.stream().takeWhile(v -> v < 7).forEach(System.out::println);
        System.out.println("-----------------");
        // It drop all element before condition met
        list.stream().dropWhile(v -> v < 7).forEach(System.out::println);
        System.out.println("-----------------");
        // Avoid NullPointerException in Stream Creation
        Stream.ofNullable(null).forEach(System.out::println);

	}
}
