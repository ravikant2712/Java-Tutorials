package collections;

// HashSet in Java implements the Set interface of the Collections Framework.
// is used to store the unique elements, and it doesn't maintain any specific order of elements.
//HashSet does not allow duplicate elements.
//Uses HashMap internally which is an implementation of hash table data structure.
//Also implements Serializable and Cloneable interfaces.
//HashSet is not thread-safe. To make it thread-safe, synchronization is needed externally.

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    static void main() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Android");
        hashSet.add("Python");
        hashSet.add("React");
        hashSet.add("Java");

        // Does't allow duplicate element
        System.out.println(hashSet);

        // Removing the element B
        hashSet.remove("Android");
        System.out.println("After Removing element from this list : " + hashSet);

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + ", ");


    }
}
