package collections;

import java.util.LinkedList;

//It implements a doubly-linked list data structure where elements are not stored in contiguous memory.
// Each node contains three parts: the data, a reference to the next node, and a reference to the previous node
//Dynamic Size: LinkedList grows or shrinks dynamically at runtime.
//Maintains Insertion Order: Elements are stored in the order they are added.
//Allows Duplicates: Duplicate elements are allowed.
//Not Synchronized: By default, LinkedList is not thread-safe. To make Thread-safe use of Collections.synchronizedList().
//Efficient Insertion/Deletion: Adding or removing elements at the beginning or middle is faster compared to ArrayList.
//It implements the List and Deque interfaces, both of which are sub-interfaces of the Collection Interface.
public class LinkedListDemo {

    static void main() {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding Elements in Linked List
        linkedList.add("Java");
        linkedList.add("Android");
        linkedList.add("React");

        // Adding as Index based
        linkedList.add(1, "For");

        System.out.println(linkedList);

        // Update the elements
        linkedList.set(1, "Python");
        System.out.println("After Updates : " + linkedList);

        // Removing the element using index
        linkedList.remove(1);
        System.out.println("After Remove by index 1 : " + linkedList);
        // Removing by object
        linkedList.remove("React");
        System.out.println("After Remove by Object Name React: " + linkedList);

        // Using the for each loop
        for (String str : linkedList)
            System.out.println(str + " ");

       // Retrieves and removes the head (first element) of this list.
        // Returns: the head of this list, or null if this list is empty
        System.out.println("Apply Poll: " + linkedList.poll());
        System.out.println("After Poll: " + linkedList);

    }
}
