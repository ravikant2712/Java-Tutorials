package java8;



import java.util.*;
import java.util.function.Predicate;

public class TestStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Predicate<Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number % 2 == 0;
            }
        };

        list.stream()
            .filter(isEven)
            .forEach(System.out::println);
    }
    
    public void name() {
		
	}
}
