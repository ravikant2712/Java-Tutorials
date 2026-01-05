package basics;

public class AbstractDemo extends AbstractClass {

    static void main() {
        AbstractClass.display1();
        AbstractClass abstractClass = new AbstractDemo();
        abstractClass.display();
        abstractClass.sum();
        System.out.println(abstractClass.intVariable);
    }

    @Override
    public void sum() {
        System.out.println("Sum ");

    }
}
