package java_essential.inheritance;

public class Cat extends Animal {
    private boolean isLovedBoxes;

    public Cat(String name, boolean isLovedBoxes) {
        super(name);
        this.isLovedBoxes = isLovedBoxes;
    }

    public boolean isLovedBoxes() {
        return isLovedBoxes;
    }

    public void setLovedBoxes(boolean lovedBoxes) {
        isLovedBoxes = lovedBoxes;
    }
}
