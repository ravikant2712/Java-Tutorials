package basics;

// An Abstract Class can't be initiated
// A class can extend only one abstract class
// Can have abstract and concrete methods
// Can have instance variables
// Can have constructors
public abstract class AbstractClass {

    int intVariable = 5;
    abstract void sum();
    public void display(){
        System.out.println("Abstract Concrete method");
    }

    public static void display1(){
        System.out.println("Call Static method");
    }

    public void display3(){

    }
}
