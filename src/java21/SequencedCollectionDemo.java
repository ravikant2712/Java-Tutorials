package java21;

import java.util.List;

// Uniform way to access first & last elements. Works with:
//List
//Set
//Deque
public class SequencedCollectionDemo {
    static void main() {

        List<String> list = List.of("A", "B", "C");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
