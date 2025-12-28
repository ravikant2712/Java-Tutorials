package java8;

import java.util.Arrays;
import java.util.List;

//Sort form of lamda ::
public class MethodRefs {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C");
        list.forEach(MethodRefs::print); // method reference
	}

	private static void print(String string1) {
		System.out.println(string1);
	}
}
