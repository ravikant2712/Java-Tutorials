package java11;

import java.util.Optional;


// isEmpty() method added in Optional Class
public class OptionalMethod {

	public static void main(String[] args) {
		Optional<String> opt = Optional.empty();
		System.out.println(opt.isEmpty());
	}
}
