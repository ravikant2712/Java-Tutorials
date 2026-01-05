package collections;

import java.util.HashMap;
import java.util.Map;

// Implements the Map interface.
// It stores elements in key-value pairs, where, Keys are unique. and Values can be duplicated.
// Internally uses Hashing Algorithm,
// Allow one null key and values
// HashMap is not thread-safe, to make it synchronized, use Collections.synchronizedMap().
public class HashMapDemo {

    static void main() {

        HashMap<String, Integer> hashMap  = new HashMap<>();
        // Add elements to the HashMap
        // Adding Element in HashMap
        hashMap.put("John", 25);
        hashMap.put("John", 30);
        hashMap.put("Jim", 35);
        hashMap.put(null, null);
        hashMap.put(null, null);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet())
        {
            System.out.println("Key: " + entry.getKey() + " Value: " +  entry.getValue());
        }


        hashMap.put("John", 67);
        System.out.println("Updated Map : " + hashMap);

        // Removing element from hash map
        hashMap.remove("Jim");
        System.out.println("Mappings after removal are : "
                + hashMap);
    }
}
