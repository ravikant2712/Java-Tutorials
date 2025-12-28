package java8;


//An interface with exactly one abstract method is call Functional Interfaces .
// You can add Default and Static Methods in Interface
public interface Vehicle {
    public void start();
    
    default void vehicleColor () {
    	System.out.print("Default Method in intefaces");
    } 
    
    
    static void display() {
    	System.out.println("static Method in intefaces ");
    }
    
}
