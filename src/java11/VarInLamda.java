package java11;

import java.util.function.BiFunction;


// You can use var in lambda parameters.
public class VarInLamda {
	
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> sum =
		        (var a, var b) -> a + b;

		System.out.println(sum.apply(5, 10));
	}

}
