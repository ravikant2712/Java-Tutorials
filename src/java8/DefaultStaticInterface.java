package java8;


//Interface can contains default and static methods
//Interface can have multiple default and static methods
//Static method are called by  using interface name : DefaultStaticInterface.show1();

public interface DefaultStaticInterface {
	
	default void display1() {
		System.out.println("Display 1 Method");
	}
	default void display2() {
		System.out.println("Display 2 Method");
	}
	default void display3() {
		System.out.println("Display 3 Method");
	}
	static void show1() {
		System.out.println("Show 1 Method");
	}
	static void show2() {
		System.out.println("Show 2 Method");

	}
	static void show3() {
		System.out.println("Show 3 Method");

	}
	

}
