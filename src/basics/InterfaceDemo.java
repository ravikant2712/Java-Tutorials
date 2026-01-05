package basics;

// An interface contains method without implementation
// The class which implements this interface should provide implementation of all the unimplemented methods
// A class can implements multiple interfaces
// Java 8 + contains abstract, default, static, and private methods
// In Interface by default all methods are abstract which are declared

public interface InterfaceDemo {
    void sum();
    void sum(int a, int b);
    abstract void multiply();

    public default void display(){
        System.out.println("Display Default");
    }

    public static void display1(){
        System.out.println("Display Static");
    }

    private void display2(){
        System.out.println("Display private");
    }
}
