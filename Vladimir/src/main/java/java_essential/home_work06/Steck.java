package java_essential.home_work06;

public class Steck {
    private int capasity;
    private int size;
    private Object[] steck;

    public Steck() {
        this.capasity = 10;
        steck = new Object[capasity];
    }

    private Object[] increaseArrayCapasity(Object[] steck) {
        int newCapasity = (int) (steck.length * 1.5);
        Object[] newBiggerArray = new Object[newCapasity];
        System.arraycopy(newBiggerArray, 0, steck, 0, steck.length);
        return new Object[newCapasity];
    }

    public void push(Object someElement) {
        if (size == steck.length) {
            steck = increaseArrayCapasity(steck);
            steck[size] = someElement;
            size++;
        } else {
            steck[size] = someElement;
            size++;
        }
    }

    public void pull() {
        steck[size - 1] = null;
        size--;
    }

    public int size() {
        return size;
    }
}
