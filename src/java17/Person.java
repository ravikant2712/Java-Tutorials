package java17;

// Records Automatically provides:
// constructor
// getters
// equals()
// hashCode()
// toString()
// Can have method
// Can Implements interfaces
// Can extend another class - No

public record Person (String  name, int age){
    public boolean isPassed() {
        return age >= 40;
    }
}
