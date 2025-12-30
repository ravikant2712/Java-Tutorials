package java17;


//Rectangle Class extends Circle Class But not SealedClassesDemo Class
public class Rectangle extends Circle {
	
	  public static void main(String[] args) {
		    Circle sealedClassesDemo = new Circle();
		    sealedClassesDemo.display();
		    sealedClassesDemo.circleDisplay();
	}
}
