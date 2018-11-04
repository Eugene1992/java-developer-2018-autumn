package homeworks.javaEssential.homework04;

public interface Stack {

    public boolean push(Object object);

    public boolean pushAll(Object[] objectsArray);

    public Object pull();

    public int size();

    public void print();
}
