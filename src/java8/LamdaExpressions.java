package java8;

// => Lambda = Anonymous function → used to write cleaner code, especially with functional interfaces.
// => An interface with exactly one abstract method.
// => You can add Default and Static Methods in Interface
// => Streams API - Used to process collections in a functional style.

public class LamdaExpressions {
	
	//Without Lamda
	Vehicle vehicle = new Vehicle() {
		@Override
		public void start() {
            System.out.println("Vehicle Stated");			
		}
	}; 

	
	 public static void main(String[] args) {
	
		//With Lamda Expression	 
		 Vehicle vehicle2 = () -> System.out.println("Veehicle Started"); 
		 vehicle2.start();
		 Vehicle.display();
			
	 }
	 
 
}
