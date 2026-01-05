package collections;

import java.util.TreeSet;

//  TreeSet is a collection class that stores unique elements in a sorted order.
//  It is part of java.util package that implements the SortedSet interface, and internally uses a
//  Red-Black tree to maintain sorting.
//  Does not allow duplicates and null values. From JDK 7 onward, inserting null throws NullPointerException.
//  Implements the NavigableSet interface and provides navigation methods like higher(), lower(), ceiling() and floor().
//  TreeSet is not synchronized. it must be synchronized using Collections.synchronizedSet().
public class TreeSetDemo {
    static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Java");
        treeSet.add("Android");
        treeSet.add("Python");
        treeSet.add("React");

        // Print Sorted List
        System.out.println(treeSet);

        // Print the first element in the TreeSet
        System.out.println("First Value " + treeSet.first());

        // Print the last element in the TreeSet
        System.out.println("Last Value " + treeSet.last());

        String val = "Python";

        // Find the values just greater and smaller than the
        // above string
        System.out.println("Higher " + treeSet.higher(val));
        System.out.println("Lower " + treeSet.lower(val));

        System.out.println("Initial TreeSet " + treeSet);

        // Removing a specific existing element inserted
        // above
        treeSet.remove("Python");

        // Printing the updated TreeSet
        System.out.println("After removing element " + treeSet);

        // Now removing the first element using pollFirst()
        // method
        treeSet.pollFirst();

        // Again printing the updated TreeSet
        System.out.println("After removing first " + treeSet);

        // Removing the last element using pollLast() method
        treeSet.pollLast();

        System.out.println("After removing last " + treeSet);
    }
}
