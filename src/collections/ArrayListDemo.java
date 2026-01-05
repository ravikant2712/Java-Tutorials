package collections;

import java.util.ArrayList;

// An ArrayList in Java is a resizable (or dynamic) array from the java.util package that can grow or shrink automatically
// as elements are added or removed, unlike regular arrays with a fixed size.
//Indexed Access: Elements can be accessed using their index, just like arrays.
//Allows Duplicates: Duplicate elements are allowed.
//Maintains Insertion Order: Elements are stored in the order they are inserted.
//Not Synchronized: ArrayList is not thread-safe. To make it thread-safe, you must wrap it manually
public class ArrayListDemo {
    static void main() {

        // Creating an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // Adding Element in ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(10);

        System.out.println(arrayList);

        // Adding Elements at the specific index
        arrayList.add(1, 6);

        System.out.println("After Adding element at index 1 : "+ arrayList);

        // 2. Removing Element using index
        if(arrayList.contains(6))
        {
            arrayList.remove(6);
        }

        System.out.println("Element removed from index 0 : "+ arrayList);

        // Removing Element using the value
    //    arrayList.remove(6);

        System.out.println("Element Geeks removed : "+ arrayList);

        // 3. Updating value at index 0
        arrayList.set(0, 7);

        System.out.println("List after updation of value : "+arrayList);

    }
}

