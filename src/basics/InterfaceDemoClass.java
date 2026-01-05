package basics;

public class InterfaceDemoClass implements InterfaceDemo{

    static void main() {
        InterfaceDemo interfaceDemo = new InterfaceDemoClass();
        interfaceDemo.sum();
        interfaceDemo.display();
        interfaceDemo.sum(4,6);
        interfaceDemo.multiply();
        InterfaceDemo.display1();
    }

    @Override
    public void sum() {
        System.out.println("Sum");
    }

    @Override
    public void sum(int a, int b) {
        System.out.println("Sum 2");
    }

    @Override
    public void multiply() {
        System.out.println("Multiply");
    }
}
