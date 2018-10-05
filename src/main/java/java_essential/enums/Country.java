package java_essential.enums;

/**
 * Created by Evgeniy on 05.10.2018.
 */
public enum Country {
    UKRAINE("Ukraine"),
    USA("United States of America");

//    public static final Country UKRAINE = new Country("Ukraine");
//    public static final Country USA = new Country("United States of America");

    private String name;

    Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
