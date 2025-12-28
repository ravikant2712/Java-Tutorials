package java9;

public interface PrivateMethodInteface {

	void abtractMethod();
	
	private void thisIsPrivateMethod() {	 	
 	   System.out.println("Introduce in java 9");
	}
	
    default void method() {
 	   System.out.println("Introduce in java 8");
   	
    }
    
    static void method2() {
    	System.out.println("Introduce in java 8");
    }
}
