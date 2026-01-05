package collections;

import java.util.Vector;

// Vector is a dynamic array that can grow or shrink in size as elements are added or removed.
// It is part of the java.util package and extends the AbstractList class.
//Maintains insertion order and allows duplicate and null values.
//Dynamically grows its size when capacity is exceeded.
//Implements List, RandomAccess, Cloneable, and Serializable interfaces.
//Vector is a Legacy class that was introduced in early versions of Java.
//Thread-safe: All methods are synchronized for safe multi-threaded access.
//ArrayList is preferred over vector in general when in-built thread synchronization is not required..
public class VectorDemo {

    static void main() {
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Android");
        vector.add("React");
        System.out.println(vector);

        // Adding Custom Elements
        Vector vector1 = new Vector();
        vector1.add(1);
        vector1.add("fsdsdfsdf");

        System.out.println(vector1);

        // Updating Element
        vector1.set(1, "Ravi");
        System.out.println(vector1);

        // Removing Element
        vector1.removeFirst();
        System.out.println(vector1);

        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Elements : " + vector.get(i));
        }
    }
}
