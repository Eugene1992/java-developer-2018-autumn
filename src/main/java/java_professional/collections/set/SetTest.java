package java_professional.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("c");
        strings.add("d");
        strings.add("d");
        strings.add("d");

        Set<String> objects = new HashSet<>(strings);
        System.out.println(objects);

    }
}
