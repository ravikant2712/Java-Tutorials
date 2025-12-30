package java17;

//Records are immutable data carriers with less boilerplate.
// Automatically provides:
// constructor
// getters
// equals()
// hashCode()
// toString()
// Can have method
// Can Implements interfaces
// Can extend another class - No
public class RecordsDemo {

    public static void main(String[] args) {
        Person p = new Person("Ravi", 25);
        System.out.println(p.name());
        System.out.println(p.age());
        System.out.println(p.toString());
    }
}
