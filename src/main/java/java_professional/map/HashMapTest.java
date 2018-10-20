package java_professional.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("ten", 10);
        map.put("eleven", 11);

        System.out.println(map);

        System.out.println(map.get("two"));
        System.out.println(map.get("four"));

        map.put("two", 22);

        System.out.println(map);

        map.remove("three");

        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        Set<String> strings = map.keySet();

        Collection<Integer> values = map.values();

    }
}
