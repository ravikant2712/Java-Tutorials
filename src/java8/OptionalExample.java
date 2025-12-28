package java8;

import java.util.Optional;



//Optional class avoid NullPointerExceptions
public class OptionalExample {

	
	public static void main(String[] args) {
		
		 Optional<String>  iOptional = Optional.ofNullable(null);
		 
		 iOptional.ifPresent(v -> System.out.println(v));
	}
}
