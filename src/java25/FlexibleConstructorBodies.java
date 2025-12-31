package java25;

// Before Java 25, super(...) had to be the first statement in a constructor.
// Now you can do custom logic before calling super().
public class FlexibleConstructorBodies {
    static void main() {
        new Employee(25);
    }
}


class Employee extends Person {

    Employee(int age) {
        // ✅ Custom logic BEFORE super()
        if (age < 18) {
            throw new IllegalArgumentException("Employee must be 18+");
        }

        super(age);   // ✅ allowed in Java 25

        System.out.println("Employee created");
    }
}

class Person {
    Person(int age) {}
}