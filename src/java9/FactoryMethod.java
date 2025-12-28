package java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethod {
	// factory method like   List.of
	public static void main(String[] args) {
		
		List<String> list = List.of("Java","Android","Python");
		Set<Integer> set = Set.of(1, 2, 3);
		Map<Integer, String> map = Map.of(1, "One", 2, "Two");
	}

}
