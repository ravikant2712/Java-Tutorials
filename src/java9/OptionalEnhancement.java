package java9;

import java.util.Optional;

//Added ifPresentOrElse().
public class OptionalEnhancement {
	public static void main(String[] args) {
		
		Optional<String> listOptional = Optional.of("Some Value");
		// added in Stream APi ifPresentOrElse().
		listOptional.ifPresentOrElse(
			    val -> System.out.println("Value: " + val),
			    () -> System.out.println("No value")
			);
		}

}
