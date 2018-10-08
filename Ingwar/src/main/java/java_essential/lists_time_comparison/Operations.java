package java_essential.lists_time_comparison;

public enum Operations {
    ADD("add"),
    GET("get"),
    SET("set"),
    REMOVE("remove");

    private String name;

    Operations(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
