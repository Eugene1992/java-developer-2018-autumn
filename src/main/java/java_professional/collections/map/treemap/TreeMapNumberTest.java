package java_professional.collections.map.treemap;

import java.util.*;

public class TreeMapNumberTest {
    public static void main(String[] args) {
        SortedMap<Integer, Integer> numbers = new TreeMap<>();
        numbers.put(1, 1);
        numbers.put(6, 6);
        numbers.put(11, 11);
        numbers.put(3, 3);
        numbers.put(2, 2);
        numbers.put(2, 2);
        numbers.put(2, 2);
        numbers.put(2, 2);
        numbers.put(2, 2);
        numbers.put(111, 111);
        numbers.put(0, 0);
        numbers.put(-12, -12);

        System.out.println(numbers);

//        System.out.println(numbers.headMap(6));
//        System.out.println(numbers.tailMap(6));
//        System.out.println(numbers.subMap(2, 6));

        NavigableMap<Integer, Integer> navNumbers = new TreeMap<>(numbers);

        Map.Entry<Integer, Integer> lowerEntry = navNumbers.lowerEntry(5);
        System.out.println(lowerEntry.getValue());
        System.out.println(navNumbers.higherKey(6));

        System.out.println(navNumbers.descendingMap());

        System.out.println(navNumbers.ceilingEntry(5));
        System.out.println(navNumbers.floorEntry(6));

        System.out.println(navNumbers.pollFirstEntry().getValue());
        System.out.println(navNumbers);
    }
}
