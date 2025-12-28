package java17;

//No need for explicit casting.
//Advantages
//No explicit casting → cleaner code.
//Can use the variable immediately inside the if block.
//Makes type checking + casting simpler and safer.
public class PatternMatchingInstanceOf {

	public static void main(String[] args) {
		
		//Before Java 16
		Object obj = "Hello Java 17";
		if (obj instanceof String) {
		    String s = (String) obj;
		    System.out.println(s.length());
		}
		System.out.println("-----------------------------------");
		// After java 17
		   Object obj1 = "Hello Java 17";

        if (obj1 instanceof String s) { // pattern matching, no explicit cast
            System.out.println("Value: " + s);
            System.out.println("Length: " + s.length());
        } else {
            System.out.println("Not a String");
        }
	
	
	}
}
