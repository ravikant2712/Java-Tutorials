package collections;


//ConcurrentHashMap is a thread-safe implementation of the Map interface.
// It allows multiple threads to read and write data simultaneously, without the need for locking the entire map.
// Unlike a regular HashMap, which is not thread-safe, ConcurrentHashMap ensures that the operations are thread-safe,
// making it ideal for scenarios where multiple threads need to access and modify the map concurrently.

import java.util.concurrent.ConcurrentHashMap;

// Provides thread-safe operations without locking the entire map.
//Allows multiple threads to operate concurrently by dividing the map into segments.
//Supports atomic operations like putIfAbsent(), replace() and remove()
//The default concurrency level of ConcurrentHashMap is 16
//Inserting null objects is not possible in ConcurrentHashMap as a key or value.
public class ConcurrentHashMapDemo {

    static void main() {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Adding elements to the map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Map size: " + map.size());

        // Getting values from the map
        System.out.println("Value of A: " + map.get("A"));

        // Removing elements from the map
        map.remove("B");
        System.out.println("After removal map size is: " + map.size());


        // create an instance of
        // ConcurrentHashMap
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

        // Insert mappings using
        // put method
        concurrentHashMap.put(100, "Hello");
        concurrentHashMap.put(101, "Geeks");
        concurrentHashMap.put(102, "Geeks");

        // Here we cant add Hello because 101 key
        // is already present in ConcurrentHashMap object
        concurrentHashMap.putIfAbsent(101, "Hello");

        // We can remove entry because 101 key
        // is associated with For value
        concurrentHashMap.remove(101, "Geeks");

        // Now we can add Hello
        concurrentHashMap.putIfAbsent(103, "Hello");

        // We cant replace Hello with For
        concurrentHashMap.replace(101, "Hello", "For");
        System.out.println(concurrentHashMap);
    }
}
