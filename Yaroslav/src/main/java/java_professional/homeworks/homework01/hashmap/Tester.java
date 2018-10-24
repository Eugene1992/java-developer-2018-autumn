package java_professional.homeworks.homework01.hashmap;


import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Map<Integer, String> map = new MyHashMap<>();
        map.put(10, "AA");
        map.put(20, "BB");
        map.put(30, "AA");
        map.put(40, "CC");
        map.put(50, "DD");
        map.put(60, "KK");
        map.put(70, "MM");
        map.put(80, "JJ");
        map.put(90, "NN");


        System.out.println(map);
        Collection<String> values = map.values();
        Set<Integer> keys = map.keySet();
        System.out.println("\n\n" + map);
        System.out.println(values);
        System.out.println(keys);
        List<Integer> list = new LinkedList<>();
        list.add(10);list.add(90);list.add(20);
        System.out.println("-------------------------");
        keys.retainAll(list);


        System.out.println("\n\n" + map);
        System.out.println(values);
        System.out.println(keys);

    }
}
