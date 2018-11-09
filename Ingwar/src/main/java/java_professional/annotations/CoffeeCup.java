package java_professional.annotations;

@JsonEntity
public class CoffeeCup {
    @JsonField
    private String color;

    public CoffeeCup(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CoffeeCup{" +
                "color='" + color + '\'' +
                '}';
    }
}
