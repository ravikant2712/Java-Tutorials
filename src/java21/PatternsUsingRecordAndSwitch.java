package java21;

import java17.Person;


// A record pattern allows you to deconstruct a record directly in conditions (like if or switch) without calling getters manually.
public class PatternsUsingRecordAndSwitch {

    public static void main(String[] args) {

        //instanceof Person(String name, int age):
        //Checks if obj is a Person
        //Deconstructs it into name and age
        //No need to call obj.name() or obj.age()
        Object obj = new Person("Ravi", 35);
        if(obj instanceof Person(String name, int age))
        {
            System.out.println(name + " is " + age + " Year Old");
        }

        System.out.println("---------------------------------------");

        // Using Record Patterns in Switch Check the function
        System.out.println(process(new Point(3, 4)));
    }

    static String process(Object obj) {
        return switch (obj) {
            case Point(int x, int y) -> "Point at (" + x + "," + y + ")";
            case String s -> "String: " + s;
            default -> "Unknown";
        };
    }
}

record Point(int x, int y) {}
