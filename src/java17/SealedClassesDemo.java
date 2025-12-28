package java17;


// Sealed classes restrict which classes can extend them here Circle Class only extends this class.
// and Circle class should be final or non-sealed class
public sealed class SealedClassesDemo permits Circle {

    public void display() {
		System.out.println("Sealed Class Method call");
	}
}
