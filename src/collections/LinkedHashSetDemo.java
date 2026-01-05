package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

// LinkedHashSet in Java implements the Set interface
// LinkedHashSet in Java implements the Set interface of the Collections Framework.
// It combines the functionalities of a HashSet with a doubly-linked list to maintain the insertion order of elements.
// LinkedHashSet stores unique elements only and allows a single null.
// Implements Set, Cloneable and Serializable interfaces.
public class LinkedHashSetDemo {
    static void main() {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Android");
        linkedHashSet.add("React");
        linkedHashSet.add("Python");

        // Allow Single null
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);

        // Remove Elements
        linkedHashSet.remove("Python");
        System.out.println("After Removing Element : " + linkedHashSet);

        Iterator itr = linkedHashSet.iterator();

        while (itr.hasNext())
            System.out.print(itr.next() + ", ");

    }
}
