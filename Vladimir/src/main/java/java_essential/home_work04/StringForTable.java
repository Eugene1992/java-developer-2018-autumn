package java_essential.home_work04;

import javax.xml.ws.Endpoint;

public enum StringForTable {
    ADD("Add"),
    GET("Get"),
    SET("Set"),
    REMOVE("Remove"),
    START("Start"),
    MIDDLE("Middle"),
    END("End"),
    ARRAYLIST("ArrayList"),
    LINKEDLIST("LinkedList");

    private String name;

    StringForTable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
