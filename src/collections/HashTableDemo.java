package collections;


import java.util.Hashtable;
import java.util.Map;

//It is similar to HashMap, but is synchronized.
//Hashtable stores key/value pair in hash table.
//In Hashtable we specify an object that is used as a key, and the value we want to associate to that key.
// The key is then hashed, and the resulting hash code is used as the index at which the value is stored within
// the table.
//The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
//HashMap doesn't provide any Enumeration, while Hashtable provides not fail-fast Enumeration.
public class HashTableDemo {

    static void main() {
        Hashtable<String, Integer> ht = new Hashtable<>();
        // Adding elements to the Hashtable
        ht.put("One", 1);
        ht.put("Two", 2);
        ht.put("Three", 3);

        System.out.println(ht);


        // Update the value at key 2
        ht.put("Two", 5);

        // print the updated map
        System.out.println("Updated Map " + ht);

        // Remove the map entry with key 4
        ht.remove("Three");

        // Final Hashtable
        System.out.println("Updated map : " + ht);

        // Iterating using enhanced for loop
        for (Map.Entry<String, Integer> e : ht.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

    }
}

// Internal Working of Hashtable
//Hashtable datastructure is an array of buckets which stores the key/value pairs in them. It makes use of hashCode() method
// to determine which bucket the key/value pair should map.
//The hash function helps to determine the location for a given key in the bucket list. Generally, hashcode is a non-negative
// integer that is equal for equal Objects and may or may not be equal for unequal Objects. To determine whether two objects
// are equal or not, hashtable makes use of the equals() method.
//
//It is possible that two unequal Objects have the same hashcode. This is called a collision. To resolve collisions,
// hashtable uses an array of lists. The pairs mapped to a single bucket (array index) are stored in a list and list reference
// is stored in the array index.
