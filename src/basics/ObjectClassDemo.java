package basics;

// Object class is the root class of all classes
// Every class in java automatically directly or indirectly extends Object class
// Like in this class we are not extending the Object class,
// but indirectly it is extending, and we can access all the method of this class

import java.util.HashSet;

// The Object class provides some common methods that every java object can use them
// toString(), equals(), hashcode(), clone(), getClass(), wait(), notify(), notifyAll()
public class ObjectClassDemo {

    static void main() {
        // toString - return String representation of the object
        // toString - return the combination of two things getClass().getName() + "@" + Integer.toHexString(hashCode())
        Object o =new Object();  //  stored at memory location A
        Object o2 =new Object();  // stored at memory location B
        Object o3 =o;  //  point to memory location A
        System.out.println(o.toString());   // this return something like java.lang.Object@27716f4  , the first part id class name and second id hex code


        System.out.println("---------------------------------------");
        // equals(Object obj) - Checks whether two objects are “equal”.
        // So it compares reference (same memory object), not content.
        System.out.println(o.equals(o2));  // return false  Even though both are Object, they are two different objects in memory.
        System.out.println(o.equals(o3)); // return true   Because both point to same memory.


        System.out.println("---------------------------------------");
        // hashcode() - Returns an int used by hash-based collections like:
            //HashMap
            //HashSet
        // Hash collections do:
            //Use hashCode() to find a bucket quickly
            //Then use equals() to confirm the exact match
        // If a.equals(b) is true → a.hashCode() == b.hashCode() must be true

        HashSet<User> set = new HashSet<>();
        set.add(new User(1, "a@mail.com"));  // to check remove hashcode from User class
        System.out.println(set.contains(new User(1, "a@mail.com"))); // may be false ❌  Because it may search a different bucket.


        System.out.println("---------------------------------------");
        // getClass() -   Returns the runtime class info: Class<?>
        Object x = new String("hi");
        System.out.println(x.getClass());


        System.out.println("-----------------------------------");
        // clone() - Creates a field-by-field copy (shallow copy) of the object.
        // Important points
            //clone() is protected in Object → you must override it to make it public
            //Your class must implement Cloneable otherwise it throws CloneNotSupportedException
            //Default clone is shallow: references inside are copied, not deep-copied

        ClonableDemo clonableDemo = new ClonableDemo();
        System.out.println(clonableDemo);
        try {
            System.out.println(clonableDemo.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("-------------------------------------");
        // wait(), notify(), notifyAll()
        // Used for thread communication
        // Critical rules
            //Must be called inside synchronized(obj) block
            //Otherwise: IllegalMonitorStateException
        // wait() → current thread pauses and releases the lock
        // notify() → wakes one waiting thread
        // notifyAll() → wakes all waiting threads
        // Why these method are in object class?
        // Every object in Java can be used as a monitor (lock), and these methods are part of the monitor mechanism.
        // wait(), notify(), notifyAll() are in Object class because every object in Java can be used as a monitor for thread communication.

    }

}
