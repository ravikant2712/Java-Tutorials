package java8;

public class DefaultStaticInterfaceImpl implements DefaultStaticInterface{

	 public static void main(String[] args) {
		DefaultStaticInterface.show1();
		DefaultStaticInterface.show2();
		DefaultStaticInterface.show3();
		
		DefaultStaticInterfaceImpl defaultStaticInterfaceImpl = new DefaultStaticInterfaceImpl();
		defaultStaticInterfaceImpl.display1();
	}
}
