package java_essential;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTimeTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            arrayList.add(arrayList.size() / 2, 777);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        List<Integer> linkedList = new LinkedList<>();
        long llSrart = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            linkedList.add(0, 777);
        }
        long llEnd = System.currentTimeMillis();
        System.out.println(llEnd - llSrart);
    }
}
