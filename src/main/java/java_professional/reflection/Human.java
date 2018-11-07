package java_professional.reflection;

public class Human {
    private String firstName;

    public Human() {
    }

    public Human(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}
