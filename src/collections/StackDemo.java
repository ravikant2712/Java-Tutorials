package collections;

import java.util.Stack;

//Stack is a linear data structure that follows the Last In First Out (LIFO) principle and is defined in the java.util package.
// Internally, it extends the Vector class.
//Stack class maintains insertion order and allows duplicates and null values.
//Grows dynamically when its capacity is exceeded.
//All the methods of Stack are synchronized. It is thread-safe.
//Stack is considered a legacy class, introduced in early versions of Java and a preferred solution to implement
// Stack Data Structure (especially when thread synchronization is not needed) is either to use ArrayDeque or LinkedList
//Stack class implements List, RandomAccess, Cloneable, and Serializable interfaces.
public class StackDemo {

    static void main() {


        // Adding Value in Stack
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Android");
        stack.push("React");
        stack.push("Python");
        stack.push("C++");


        System.out.println(stack);


        // pop() return to top element from stack and remove from the stack
        System.out.println(stack.pop());

        System.out.println("After POP : " + stack);
        // peek return to top element from stack without removing from stack
        System.out.println("This is the peek() :  " + stack.peek());

        System.out.println("After Peek : " + stack);

        // Pop elements from the stack
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("After Poping all Element from Stack : " + stack.isEmpty());

    }

}
