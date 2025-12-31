package basics;

public class ClonableDemo implements Cloneable {

    int x;

    @Override
    public ClonableDemo clone() throws CloneNotSupportedException {
        return (ClonableDemo) super.clone();
    }
}
