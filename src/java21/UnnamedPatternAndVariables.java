package java21;

import java17.Person;

// Ignore unused variables.
public class UnnamedPatternAndVariables {

    static void main() {

        Object obj = new Person("Ravi", 35);
        if(obj instanceof Person(String name, _ ))  // _ is the unnamed Pattern
        {
            System.out.println(" My name Is " + name );
        }

    }
}
