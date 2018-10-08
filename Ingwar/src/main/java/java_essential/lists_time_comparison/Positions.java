package java_essential.lists_time_comparison;

public enum Positions {
    START("Start"),
    MIDDLE("Middle"),
    END("End");

    private String name;

    Positions(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
